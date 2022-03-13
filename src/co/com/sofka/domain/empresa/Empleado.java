package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.EmpleadoId;
import co.com.sofka.domain.empresa.value.Telefono;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.generico.Nombre;

public class Empleado extends Entity<EmpleadoId> {
    private Nombre nombre;
    private Telefono telefono;
    private Cedula cedula;
    public Empleado(EmpleadoId entityId, Nombre nombre, Telefono telefono, Cedula cedula) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public void agregarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void agregarTelefono(Telefono telefono){
        this.telefono = telefono;
    }

    public void agregarCedula(Cedula cedula){
        this.cedula = cedula;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }

    public Cedula cedula() {
        return cedula;
    }
}
