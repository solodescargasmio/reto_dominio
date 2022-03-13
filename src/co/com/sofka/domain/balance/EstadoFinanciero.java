package co.com.sofka.domain.balance;

import co.com.sofka.domain.balance.value.EstadoFinancieroId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.nomina.value.FlujoEfectivo;
import co.com.sofka.domain.nomina.value.SaldoAnual;

public class EstadoFinanciero extends Entity<EstadoFinancieroId> {
    private FlujoEfectivo flujoEfectivo;
    private SaldoAnual saldoAnual;
    public EstadoFinanciero(EstadoFinancieroId entityId, FlujoEfectivo flujoEfectivo, SaldoAnual saldoAnual) {
        super(entityId);
        this.flujoEfectivo = flujoEfectivo;
        this.saldoAnual = saldoAnual;
    }

    public void agregarFlujoEfectivo(FlujoEfectivo flujoEfectivo){
        this.flujoEfectivo = flujoEfectivo;
    }

    public void agregarSaldoAnual(SaldoAnual saldoAnual){
        this.saldoAnual = saldoAnual;
    }

    public FlujoEfectivo flujoEfectivo() {
        return flujoEfectivo;
    }

    public SaldoAnual saldoAnual() {
        return saldoAnual;
    }
}
