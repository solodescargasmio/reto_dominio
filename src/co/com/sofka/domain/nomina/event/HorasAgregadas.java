package co.com.sofka.domain.nomina.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.nomina.value.ControlHorasId;

public class HorasAgregadas extends DomainEvent {
    private final ControlHorasId controlHorasId;
    public HorasAgregadas(ControlHorasId controlHorasId) {
        super("nomina.horasagregadas");
        this.controlHorasId = controlHorasId;
    }

    public ControlHorasId getControlHorasId() {
        return controlHorasId;
    }
}
