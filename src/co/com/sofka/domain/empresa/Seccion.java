package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.Rubro;
import co.com.sofka.domain.empresa.value.SeccionId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Nombre;

public class Seccion extends Entity<SeccionId> {
    private Nombre nombre;
    private Rubro rubro;
    public Seccion(SeccionId entityId, Nombre nombre, Rubro rubro) {
        super(entityId);
        this.nombre = nombre;
        this.rubro = rubro;
    }

    public void agregarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void agregarRubro(Rubro rubro){
        this.rubro = rubro;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Rubro rubro() {
        return rubro;
    }
}
