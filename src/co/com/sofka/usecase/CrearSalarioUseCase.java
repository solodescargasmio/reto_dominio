package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.nomina.Nomina;
import co.com.sofka.domain.nomina.command.CrearControlHora;
import co.com.sofka.domain.nomina.command.CrearSalario;
import co.com.sofka.domain.nomina.value.ControlHorasId;
import co.com.sofka.domain.nomina.value.SalarioId;

public class CrearSalarioUseCase extends UseCase<RequestCommand<CrearSalario>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearSalario> input) {
        var command = input.getCommand();

        var nomina = Nomina.from(command.getNominaId(),retrieveEvents());
        nomina.agregarSalario(new SalarioId());

        emit().onResponse(new ResponseEvents(nomina.getUncommittedChanges()));
    }
}
