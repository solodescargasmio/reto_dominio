package co.com.sofka.domain.empresa.event;

import co.com.sofka.domain.empresa.value.RUT;
import co.com.sofka.domain.empresa.value.RazonSocial;
import co.com.sofka.domain.generic.DomainEvent;

public class RUTGenerado extends DomainEvent {
    private final RUT rut;
    public RUTGenerado(RUT rut) {
        super("empresa.rutgenerado");
        this.rut = rut;
    }

    public RUT getRut() {
        return rut;
    }
}
