package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.nomina.Nomina;
import co.com.sofka.domain.nomina.command.CrearAdelanto;
import co.com.sofka.domain.nomina.value.AdelantoId;

public class CrearAdelantoUseCase extends UseCase<RequestCommand<CrearAdelanto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearAdelanto> input) {
        var command = input.getCommand();

       var nomina = Nomina.from(command.getNominaId(),retrieveEvents());
       nomina.agregarAdalanto(new AdelantoId());

       emit().onResponse(new ResponseEvents(nomina.getUncommittedChanges()));

    }
}
