package co.com.sofka.domain.balance;

import co.com.sofka.domain.balance.value.PatrimonioNetoId;
import co.com.sofka.domain.balance.value.TotalPatrimonio;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Anio;

public class PatrimonioNeto extends Entity<PatrimonioNetoId> {
    private Anio anio;
    private TotalPatrimonio totalPatrimonio;
    public PatrimonioNeto(PatrimonioNetoId entityId, Anio anio, TotalPatrimonio totalPatrimonio) {
        super(entityId);
        this.anio = anio;
        this.totalPatrimonio = totalPatrimonio;
    }

    public void agregarAnio(Anio anio){
        this.anio = anio;
    }

    public void agregarTotalPatrimonio(TotalPatrimonio totalPatrimonio){
        this.totalPatrimonio = totalPatrimonio;
    }

    public Anio anio() {
        return anio;
    }

    public TotalPatrimonio totalPatrimonio() {
        return totalPatrimonio;
    }
}
