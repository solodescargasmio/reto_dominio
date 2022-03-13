package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.nomina.Nomina;
import co.com.sofka.domain.nomina.command.CrearControlHora;
import co.com.sofka.domain.nomina.value.ControlHorasId;

public class CrearControlHoraUseCase extends UseCase<RequestCommand<CrearControlHora>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearControlHora> input) {
        var command = input.getCommand();

        var nomina = Nomina.from(command.getNominaId(),retrieveEvents());
        nomina.agregarHorasId(new ControlHorasId());

        emit().onResponse(new ResponseEvents(nomina.getUncommittedChanges()));
    }

}
