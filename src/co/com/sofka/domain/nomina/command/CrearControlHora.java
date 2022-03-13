package co.com.sofka.domain.nomina.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.Cantidad;
import co.com.sofka.domain.nomina.value.ControlHorasId;
import co.com.sofka.domain.nomina.value.NominaId;
import co.com.sofka.domain.nomina.value.TipoHora;

public class CrearControlHora extends Command {
    private final Cedula cedula;
    private final TipoHora tipoHora;
    private final Cantidad cantidad;
    private final ControlHorasId controlHorasId;
    private final NominaId nominaId;

    public CrearControlHora(Cedula cedula, TipoHora tipoHora, Cantidad cantidad, ControlHorasId controlHorasId, NominaId nominaId) {
        this.cedula = cedula;
        this.tipoHora = tipoHora;
        this.cantidad = cantidad;
        this.controlHorasId = controlHorasId;
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

    public ControlHorasId getControlHorasId() {
        return controlHorasId;
    }

    public NominaId getNominaId() {
        return nominaId;
    }
}
