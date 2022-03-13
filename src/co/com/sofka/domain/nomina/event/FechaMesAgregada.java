package co.com.sofka.domain.nomina.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.FechaMes;

public class FechaMesAgregada extends DomainEvent {
    private FechaMes fechaMes;
    public FechaMesAgregada(FechaMes fechaMes) {

        super("nomina.fechamesagregada");
        this.fechaMes = fechaMes;
    }

    public FechaMes getFechaMes() {
        return fechaMes;
    }
}
