package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.empresa.Empresa;
import co.com.sofka.domain.empresa.command.CrearEmpleado;
import co.com.sofka.domain.empresa.command.CrearSeccion;
import co.com.sofka.domain.empresa.value.EmpleadoId;
import co.com.sofka.domain.empresa.value.SeccionId;

public class CrearSeccionUseCase extends UseCase<RequestCommand<CrearSeccion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearSeccion> input) {
        var command = input.getCommand();

        var empresa = Empresa.from(command.getEmpresaId(),retrieveEvents());
        empresa.agregarSeccion(new SeccionId());

        emit().onResponse(new ResponseEvents(empresa.getUncommittedChanges()));
    }
}
