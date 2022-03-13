package co.com.sofka.domain.nomina;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.AdelantoId;
import co.com.sofka.domain.nomina.value.TotalAdelanto;

public class Adelanto extends Entity<AdelantoId> {
    private Cedula cedula;
    private TotalAdelanto totalAdelanto;
    public Adelanto(AdelantoId entityId, Cedula cedula, TotalAdelanto totalAdelanto) {
        super(entityId);
        this.cedula = cedula;
        this.totalAdelanto = totalAdelanto;
    }

    public void agregarAdelanto(TotalAdelanto totalAdelanto){
        this.totalAdelanto = totalAdelanto;
    }

    public void agregarCedula(Cedula cedula){
        this.cedula = cedula;
    }

    public Cedula cedula() {
        return cedula;
    }

    public TotalAdelanto totaladelanto() {
        return totalAdelanto;
    }
}
