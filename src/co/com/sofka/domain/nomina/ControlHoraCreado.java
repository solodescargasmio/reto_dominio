package co.com.sofka.domain.nomina;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.Cantidad;
import co.com.sofka.domain.nomina.value.NominaId;
import co.com.sofka.domain.nomina.value.TipoHora;

public class ControlHoraCreado extends DomainEvent {
    private final Cedula cedula;
    private final TipoHora tipoHora;
    private final Cantidad cantidad;
    private final NominaId nominaId;
    public ControlHoraCreado( Cedula cedula, TipoHora tipoHora, Cantidad cantidad, NominaId nominaId) {
        super("nomina.controlhoracreado");
        this.cedula = cedula;
        this.tipoHora = tipoHora;
        this.cantidad = cantidad;
        this.nominaId = nominaId;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public TipoHora getTipoHora() {
        return tipoHora;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public NominaId getNominaId() {
        return nominaId;
    }
}
