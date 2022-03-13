package co.com.sofka.domain.empresa.event;

import co.com.sofka.domain.empresa.value.TramiteId;
import co.com.sofka.domain.generic.DomainEvent;

public class TramiteAgregado extends DomainEvent {
    private final TramiteId tramiteId;
    public TramiteAgregado(TramiteId tramiteId) {
        super("empresa.tramite");
        this.tramiteId = tramiteId;
    }

    public TramiteId getTramiteId() {
        return tramiteId;
    }
}
