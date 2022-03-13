package co.com.sofka.domain.balance;

import co.com.sofka.domain.balance.event.EmpresaAgregada;
import co.com.sofka.domain.balance.event.EstadoAgregado;
import co.com.sofka.domain.balance.event.PatrimonioAgregado;
import co.com.sofka.domain.balance.value.PatrimonioNetoId;
import co.com.sofka.domain.generic.EventChange;

public class BalanceEventChange extends EventChange {

    public BalanceEventChange(Balance balance) {

        apply((BalanceCreado event)->{
            balance.empresaId = event.getEmpresaId();
            balance.fechaMes = event.getFechaMes();
        });

        apply((PatrimonioAgregado event)->{
            balance.patrimonioNetoId = event.getPatrimonioNetoId();
        });

        apply((EstadoAgregado event)->{
            balance.estadoFinancieroId = event.getEstadoFinancieroId();
        });

        apply((EmpresaAgregada event)->{
            balance.empresaId = event.getEmpresaId();
        });


    }
}
