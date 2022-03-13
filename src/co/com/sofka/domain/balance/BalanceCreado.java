package co.com.sofka.domain.balance;

import co.com.sofka.domain.balance.value.EstadoFinancieroId;
import co.com.sofka.domain.balance.value.PatrimonioNetoId;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.FechaMes;

public class BalanceCreado extends DomainEvent {
    private final EmpresaId empresaId;
    private final FechaMes fechaMes;
    public BalanceCreado(EmpresaId empresaId, FechaMes fechaMes) {
        super("balance.balancecreado");
        this.empresaId = empresaId;
        this.fechaMes = fechaMes;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }

    public FechaMes getFechaMes() {
        return fechaMes;
    }
}
