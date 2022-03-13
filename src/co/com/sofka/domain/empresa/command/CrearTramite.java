package co.com.sofka.domain.empresa.command;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.FechaT;
import co.com.sofka.domain.empresa.value.Tipo;
import co.com.sofka.domain.empresa.value.TramiteId;
import co.com.sofka.domain.generic.Command;

public class CrearTramite extends Command {
    private final TramiteId entityId;
    private final FechaT fecha;
    private final Tipo tipo;
    private final EmpresaId empresaId;

    public CrearTramite(TramiteId entityId, FechaT fecha, Tipo tipo, EmpresaId empresaId) {
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
