package co.com.sofka.domain.balance.event;

import co.com.sofka.domain.balance.value.PatrimonioNetoId;
import co.com.sofka.domain.generic.DomainEvent;

public class PatrimonioAgregado extends DomainEvent {
    private final PatrimonioNetoId patrimonioNetoId;
    public PatrimonioAgregado(PatrimonioNetoId patrimonioNetoId) {
        super("balance.patrimonioagregado");
        this.patrimonioNetoId = patrimonioNetoId;
    }

    public PatrimonioNetoId getPatrimonioNetoId() {
        return patrimonioNetoId;
    }
}
