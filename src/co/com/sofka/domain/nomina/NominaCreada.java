package co.com.sofka.domain.nomina;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.FechaMes;

public class NominaCreada extends DomainEvent {
    private final FechaMes fechaMes;
    private final EmpresaId empresaId;
    public NominaCreada(FechaMes fechaMes, EmpresaId empresaId) {
        super("nomina.nominacreada");
        this.fechaMes = fechaMes;
        this.empresaId = empresaId;
    }

    public FechaMes getFechaMes() {
        return fechaMes;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }
}
