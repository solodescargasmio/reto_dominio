package co.com.sofka.domain.empresa.command;

import co.com.sofka.domain.empresa.value.EmpleadoId;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.SeccionId;
import co.com.sofka.domain.generic.Command;

public class CambiarSeccion extends Command {
    private final EmpresaId empresaId;
    private final SeccionId seccionId;
    private final EmpleadoId empleadoId;

    public CambiarSeccion(EmpresaId empresaId, SeccionId seccionId, EmpleadoId empleadoId) {
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
