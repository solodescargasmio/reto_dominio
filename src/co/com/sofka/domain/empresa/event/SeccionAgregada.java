package co.com.sofka.domain.empresa.event;

import co.com.sofka.domain.empresa.value.SeccionId;
import co.com.sofka.domain.generic.DomainEvent;

public class SeccionAgregada extends DomainEvent {
    private final SeccionId seccionId;
    public SeccionAgregada(SeccionId seccionId) {
        super("empresa.seccionagregada");
        this.seccionId = seccionId;
    }

    public SeccionId getSeccionId() {
        return seccionId;
    }
}
