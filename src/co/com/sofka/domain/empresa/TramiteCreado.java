package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.FechaT;
import co.com.sofka.domain.empresa.value.Tipo;
import co.com.sofka.domain.empresa.value.TramiteId;
import co.com.sofka.domain.generic.DomainEvent;

public class TramiteCreado extends DomainEvent {
    private final TramiteId entityId;
    private final FechaT fecha;
    private final Tipo tipo;
    private final EmpresaId empresaId;
    public TramiteCreado(TramiteId entityId, FechaT fecha, Tipo tipo, EmpresaId empresaId) {
        super("empresa.tramitecreado");
        this.entityId = entityId;
        this.fecha = fecha;
        this.tipo = tipo;
        this.empresaId = empresaId;
    }

    public TramiteId getEntityId() {
        return entityId;
    }

    public FechaT getFecha() {
        return fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }
}
