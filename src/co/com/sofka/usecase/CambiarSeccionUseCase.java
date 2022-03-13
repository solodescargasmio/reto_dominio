package co.com.sofka.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.empresa.Empresa;
import co.com.sofka.domain.empresa.command.CambiarSeccion;

public class CambiarSeccionUseCase extends UseCase<RequestCommand<CambiarSeccion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarSeccion> input) {
        var command = input.getCommand();
        var empresa = Empresa.from(command.getEmpresaId(), retrieveEvents());
        try {
            empresa.cambiarEmpleadoSeccion(input.getCommand().getEmpleadoId(),input.getCommand().getSeccionId(),input.getCommand().getEmpresaId() );
        } catch (IllegalArgumentException e){
            throw new BusinessException(command.getSeccionId().value(), e.getMessage(), e);
        }

        emit().onResponse(new ResponseEvents(empresa.getUncommittedChanges()));
    }
}
