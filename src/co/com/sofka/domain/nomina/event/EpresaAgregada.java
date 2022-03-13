package co.com.sofka.domain.nomina.event;

import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.DomainEvent;

public class EpresaAgregada extends DomainEvent {
    private final EmpresaId empresaId;
    public EpresaAgregada(EmpresaId empresaId) {
        super("nomina.epresaagregada");
        this.empresaId = empresaId;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }
}
