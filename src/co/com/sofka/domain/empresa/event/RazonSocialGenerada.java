package co.com.sofka.domain.empresa.event;

import co.com.sofka.domain.empresa.value.RazonSocial;
import co.com.sofka.domain.generic.DomainEvent;

public class RazonSocialGenerada extends DomainEvent {
    private final RazonSocial razonsocial;
    public RazonSocialGenerada(RazonSocial razonsocial) {
        super("empresa.razonsocialgenerada");
        this.razonsocial = razonsocial;
    }

    public RazonSocial getRazonsocial() {
        return razonsocial;
    }
}
