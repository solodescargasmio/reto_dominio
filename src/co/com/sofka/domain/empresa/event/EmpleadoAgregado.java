package co.com.sofka.domain.empresa.event;

import co.com.sofka.domain.empresa.value.EmpleadoId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoAgregado extends DomainEvent {
   private final EmpleadoId empleadoId;


    public EmpleadoAgregado(EmpleadoId empleadoId) {
        super("empresa.empleadoagregado");
        this.empleadoId = empleadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
