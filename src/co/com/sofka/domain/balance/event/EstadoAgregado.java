package co.com.sofka.domain.balance.event;

import co.com.sofka.domain.balance.value.EstadoFinancieroId;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoAgregado extends DomainEvent {
    private final EstadoFinancieroId estadoFinancieroId;
    public EstadoAgregado(EstadoFinancieroId estadoFinancieroId) {
        super("balance.estadoagregado");
        this.estadoFinancieroId = estadoFinancieroId;
    }

    public EstadoFinancieroId getEstadoFinancieroId() {
        return estadoFinancieroId;
    }
}
