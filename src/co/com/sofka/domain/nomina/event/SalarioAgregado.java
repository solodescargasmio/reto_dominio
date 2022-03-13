package co.com.sofka.domain.nomina.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.nomina.value.SalarioId;

public class SalarioAgregado extends DomainEvent {
    private final SalarioId salarioId;
    public SalarioAgregado(SalarioId salarioId) {
        super("nomina.salarioagregado");
        this.salarioId = salarioId;
    }

    public SalarioId getSalarioId() {
        return salarioId;
    }
}
