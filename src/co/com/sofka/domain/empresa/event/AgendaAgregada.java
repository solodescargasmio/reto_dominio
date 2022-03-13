package co.com.sofka.domain.empresa.event;

import co.com.sofka.domain.empresa.value.AgendaId;
import co.com.sofka.domain.generic.DomainEvent;

public class AgendaAgregada extends DomainEvent {
    private final AgendaId agendaId;
    public AgendaAgregada(AgendaId agendaId) {
        super("empresa.agendaagregada");
        this.agendaId = agendaId;
    }

    public AgendaId getAgendaId() {
        return agendaId;
    }
}
