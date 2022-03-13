package co.com.sofka.domain.empresa.command;

import co.com.sofka.domain.empresa.value.EmpleadoId;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.Telefono;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.generico.Nombre;

public class CrearEmpleado extends Command {
    private final EmpleadoId entityId;
    private final Nombre nombre;
    private final  Telefono telefono;
    private final Cedula cedula;
    private final EmpresaId empresaId;

    public CrearEmpleado(EmpleadoId entityId, Nombre nombre, Telefono telefono, Cedula cedula, EmpresaId empresaId) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.empresaId = empresaId;
    }

    public EmpleadoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }
}
