package co.com.sofka.domain.balance;

import co.com.sofka.domain.balance.event.EmpresaAgregada;
import co.com.sofka.domain.balance.event.EstadoAgregado;
import co.com.sofka.domain.balance.event.FechaMesGenerada;
import co.com.sofka.domain.balance.event.PatrimonioAgregado;
import co.com.sofka.domain.balance.value.BalanceId;
import co.com.sofka.domain.balance.value.EstadoFinancieroId;
import co.com.sofka.domain.balance.value.PatrimonioNetoId;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.generico.FechaMes;

import java.util.List;

public class Balance extends AggregateEvent<BalanceId> {
    protected PatrimonioNetoId patrimonioNetoId;
    protected EstadoFinancieroId estadoFinancieroId;
    protected EmpresaId empresaId;
    protected FechaMes fechaMes;

    public Balance(BalanceId entityId, PatrimonioNetoId patrimonioNetoId, EstadoFinancieroId estadoFinancieroId, EmpresaId empresaId, FechaMes fechaMes) {
        super(entityId);
        this.patrimonioNetoId = patrimonioNetoId;
        this.estadoFinancieroId = estadoFinancieroId;
        this.empresaId = empresaId;
        this.fechaMes = fechaMes;
        subscribe(new BalanceEventChange(this));
        appendChange(new BalanceCreado(empresaId,fechaMes)).apply();
    }

    private Balance(BalanceId balanceId){
        super(balanceId);
        subscribe(new BalanceEventChange(this));
    }

    public static Balance from(BalanceId balanceId, List<DomainEvent> eventList){
        Balance balance = new Balance(balanceId);
        eventList.forEach(balance::applyEvent);

        return balance;
    }

    public void agregarFechaMes(FechaMes fechaMes){
        appendChange(new FechaMesGenerada(fechaMes)).apply();
    }

    public void agregarPatrimonio(PatrimonioNetoId patrimonioNetoId){
        appendChange(new PatrimonioAgregado(patrimonioNetoId)).apply();
    }

    public void agregarEstadoFinanciero(EstadoFinancieroId estadoFinancieroId){
        appendChange(new EstadoAgregado(estadoFinancieroId)).apply();
    }

    public void agregarEmpresa(EmpresaId empresaId){
        appendChange(new EmpresaAgregada(empresaId)).apply();
    }

    public PatrimonioNetoId patrimonioNetoId() {
        return patrimonioNetoId;
    }

    public EstadoFinancieroId estadoFinancieroId() {
        return estadoFinancieroId;
    }

    public EmpresaId empresaId() {
        return empresaId;
    }

    public FechaMes fechaMes() {
        return fechaMes;
    }
}
