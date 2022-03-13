package co.com.sofka.domain.nomina.command;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.nomina.value.NominaId;

public class CrearNomina extends Command {
    private final FechaMes fechaMes;
    private final EmpresaId empresaId;
    private final NominaId nominaId;

    public CrearNomina(FechaMes fechaMes, EmpresaId empresaId, NominaId nominaId) {
        this.fechaMes = fechaMes;
        this.empresaId = empresaId;
        this.nominaId = nominaId;
    }

    public FechaMes getFechaMes() {
        return fechaMes;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }

    public NominaId getNominaId() {
        return nominaId;
    }
}
