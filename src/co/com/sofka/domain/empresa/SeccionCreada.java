package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.Rubro;
import co.com.sofka.domain.empresa.value.SeccionId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Nombre;

public class SeccionCreada extends DomainEvent {
    private final SeccionId entityId;
    private final Nombre nombre;
    private final Rubro rubro;
    private final EmpresaId empresaId;
    public SeccionCreada(SeccionId entityId, Nombre nombre, Rubro rubro, EmpresaId empresaId) {
        super("empresa.seccioncreada");
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
