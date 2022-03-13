package co.com.sofka.domain.empresa.command;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.Rubro;
import co.com.sofka.domain.empresa.value.SeccionId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Nombre;

public class CrearSeccion extends Command {
    private final SeccionId entityId;
    private final Nombre nombre;
    private final Rubro rubro;
    private final EmpresaId empresaId;

    public CrearSeccion(SeccionId entityId, Nombre nombre, Rubro rubro, EmpresaId empresaId) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.rubro = rubro;
        this.empresaId = empresaId;
    }

    public SeccionId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }
}
