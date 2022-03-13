package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.RUT;
import co.com.sofka.domain.empresa.value.RazonSocial;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpresaCreada extends DomainEvent {
    private final RazonSocial razonSocial;
    private final RUT rut;
    public EmpresaCreada(RazonSocial razonsocial, RUT rut) {
        super("empresa.empresacreada");
        this.razonSocial = razonsocial;
        this.rut = rut;
    }

    public RazonSocial getRazonSocial() {
        return razonSocial;
    }

    public RUT getRut() {
        return rut;
    }
}
