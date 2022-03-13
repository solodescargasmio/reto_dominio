package co.com.sofka.domain.empresa.event;

import co.com.sofka.domain.empresa.value.EmpleadoId;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.SeccionId;
import co.com.sofka.domain.generic.DomainEvent;

public class SeccionCambiada extends DomainEvent {
    private final EmpresaId empresaId;
    private final SeccionId seccionId;
    private final EmpleadoId empleadoId;


    public SeccionCambiada(SeccionId seccionId, EmpleadoId empleadoId, EmpresaId empresaId) {
        super("empresa.seccioncambiada");
        this.empresaId = empresaId;
        this.seccionId = seccionId;
        this.empleadoId = empleadoId;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }

    public SeccionId getSeccionId() {
        return seccionId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
