package co.com.sofka.domain.nomina;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.AdelantoId;
import co.com.sofka.domain.nomina.value.NominaId;
import co.com.sofka.domain.nomina.value.TotalAdelanto;

public class AdelantoCreado extends DomainEvent {
    private final AdelantoId adelantoId;
    private final Cedula cedula;
    private final TotalAdelanto totalAdelanto;
    private final NominaId nominaId;
    public AdelantoCreado(AdelantoId adelantoId, Cedula cedula, TotalAdelanto totalAdelanto, NominaId nominaId) {
        super("nomina.adelantocreado");
        this.adelantoId = adelantoId;
        this.cedula = cedula;
        this.totalAdelanto = totalAdelanto;
        this.nominaId = nominaId;
    }

    public AdelantoId getAdelantoId() {
        return adelantoId;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public TotalAdelanto getTotalAdelanto() {
        return totalAdelanto;
    }

    public NominaId getNominaId() {
        return nominaId;
    }
}
