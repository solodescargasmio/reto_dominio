package co.com.sofka.domain.balance.event;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpresaAgregada extends DomainEvent {
    private final EmpresaId empresaId;
    public EmpresaAgregada(EmpresaId empresaId) {
        super("empresa.empresaagregada");
        this.empresaId = empresaId;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }
}
