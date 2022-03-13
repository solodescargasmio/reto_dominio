package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.AgendaId;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.FechaT;
import co.com.sofka.domain.empresa.value.Resultado;
import co.com.sofka.domain.generic.DomainEvent;

public class AgendaCreada extends DomainEvent {
    private final AgendaId entityId;
    private final FechaT fecha;
    private final Resultado resultado;
    private final EmpresaId empresaId;
    public AgendaCreada(AgendaId entityId, FechaT fecha, Resultado resultado, EmpresaId empresaId) {
        super("empresa.agendacreada");
        this.entityId = entityId;
        this.fecha = fecha;
        this.resultado = resultado;
        this.empresaId = empresaId;
    }

    public AgendaId getEntityId() {
        return entityId;
    }

    public FechaT getFecha() {
        return fecha;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }
}
