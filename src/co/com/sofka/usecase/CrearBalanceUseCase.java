package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.balance.Balance;
import co.com.sofka.domain.balance.command.CrearBalance;


public class CrearBalanceUseCase extends UseCase<RequestCommand<CrearBalance>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearBalance> input) {
        CrearBalance crearBalance = input.getCommand();

        Balance balance = new Balance(crearBalance.getBalanceId(),crearBalance.getPatrimonioNetoId(),crearBalance.getEstadoFinancieroId(),crearBalance.getEmpresaId(),crearBalance.getFechaMes());
        emit().onResponse(new ResponseEvents(balance.getUncommittedChanges()));

    }
}
