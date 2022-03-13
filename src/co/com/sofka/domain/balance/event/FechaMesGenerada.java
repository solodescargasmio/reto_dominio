package co.com.sofka.domain.balance.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.FechaMes;

public class FechaMesGenerada extends DomainEvent {
    private final FechaMes fechaMes;
    public FechaMesGenerada(FechaMes fechaMes) {
        super("balance.fechamesgenerada");
        this.fechaMes = fechaMes;
    }

    public FechaMes getFechaMes() {
        return fechaMes;
    }
}
