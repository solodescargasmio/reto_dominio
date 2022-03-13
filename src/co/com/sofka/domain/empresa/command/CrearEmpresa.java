package co.com.sofka.domain.empresa.command;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.RUT;
import co.com.sofka.domain.empresa.value.RazonSocial;
import co.com.sofka.domain.generic.Command;

public class CrearEmpresa extends Command {
    private final EmpresaId empresaId;
    private final RazonSocial razonSocial;
    private final RUT rut;


    public CrearEmpresa(EmpresaId empresaId, RazonSocial razonSocial, RUT rut) {
        this.empresaId = empresaId;
        this.razonSocial = razonSocial;
        this.rut = rut;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }

    public RazonSocial getRazonSocial() {
        return razonSocial;
    }

    public RUT getRut() {
        return rut;
    }
}
