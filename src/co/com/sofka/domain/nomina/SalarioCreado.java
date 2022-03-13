package co.com.sofka.domain.nomina;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.NominaId;
import co.com.sofka.domain.nomina.value.SalarioId;
import co.com.sofka.domain.nomina.value.TotalSalario;

public class SalarioCreado extends DomainEvent {
   private final SalarioId entityId;
   private final Cedula cedula;
   private final TotalSalario totalSalario;
    private final NominaId nominaId;
    public SalarioCreado(SalarioId entityId, Cedula cedula, TotalSalario totalSalario, NominaId nominaId) {
        super("nomina.salariocreado");
        this.entityId = entityId;
        this.cedula = cedula;
        this.totalSalario = totalSalario;
        this.nominaId = nominaId;
    }

    public SalarioId getEntityId() {
        return entityId;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public TotalSalario getTotalSalario() {
        return totalSalario;
    }

    public NominaId getNominaId() {
        return nominaId;
    }
}
