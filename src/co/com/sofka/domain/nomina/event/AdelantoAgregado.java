package co.com.sofka.domain.nomina.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.nomina.value.AdelantoId;

public class AdelantoAgregado extends DomainEvent {
    private final AdelantoId adelantoId;
    public AdelantoAgregado(AdelantoId adelantoId) {
        super("nomina.adelantoagregado");
        this.adelantoId = adelantoId;
    }

    public AdelantoId getAdelantoId() {
        return adelantoId;
    }
}
