package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.empresa.command.CrearEmpresa;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generico.Anio;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.generico.Mes;
import co.com.sofka.domain.nomina.Nomina;
import co.com.sofka.domain.nomina.command.CrearNomina;
import co.com.sofka.domain.nomina.value.AdelantoId;
import co.com.sofka.domain.nomina.value.ControlHorasId;
import co.com.sofka.domain.nomina.value.SalarioId;

public class CrearNominaUseCase extends UseCase<RequestCommand<CrearNomina>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearNomina> input) {
        CrearNomina crearNomina=input.getCommand();
        Nomina nomina = new Nomina(crearNomina.getNominaId(),crearNomina.getFechaMes(),crearNomina.getEmpresaId());

        emit().onResponse(new ResponseEvents(nomina.getUncommittedChanges()));
    }
}
