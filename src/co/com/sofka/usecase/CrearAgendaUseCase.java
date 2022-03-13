package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.empresa.Agenda;
import co.com.sofka.domain.empresa.Empresa;
import co.com.sofka.domain.empresa.command.CrearAgenda;
import co.com.sofka.domain.empresa.value.AgendaId;
import co.com.sofka.domain.nomina.Nomina;
import co.com.sofka.domain.nomina.command.CrearAdelanto;
import co.com.sofka.domain.nomina.value.AdelantoId;

public class CrearAgendaUseCase extends UseCase<RequestCommand<CrearAgenda>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearAgenda> input) {
        var command = input.getCommand();

        var empresa = Empresa.from(command.getEmpresaId(),retrieveEvents());
        empresa.agregarAgenda(new AgendaId());

        emit().onResponse(new ResponseEvents(empresa.getUncommittedChanges()));
    }
}
