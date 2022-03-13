package co.com.sofka.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.empresa.Empresa;
import co.com.sofka.domain.empresa.Seccion;
import co.com.sofka.domain.empresa.event.SeccionCambiada;
import co.com.sofka.domain.empresa.value.EmpresaId;

public class NotificarCambioSeccionUseCase extends UseCase<TriggeredEvent<SeccionCambiada>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<SeccionCambiada> input) {
       var event = input.getDomainEvent();
       var service = getService(SMSService.class).orElseThrow();

       var seccion = event.getSeccionId();
       var empleado = event.getEmpleadoId();
       var events = repository().getEventsBy("seccion",event.aggregateRootId());
       var empresa = Empresa.from(EmpresaId.of(event.aggregateRootId()), events);
        empresa.agregarSeccion(seccion);
        empresa.agregarEmpleado(empleado);

        try {
            service.enviarMensajeAEmpresa(seccion,
                    String.format("El empleado se cambio el empleado %s a la seccion %s",empleado,seccion));

        }catch (RuntimeException e){
            throw new BusinessException(event.aggregateRootId(),"No se pudo cambiar de seccion al empleado");
        }



    }
}
