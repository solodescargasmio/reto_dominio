package co.com.sofka.domain.nomina;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.Cantidad;
import co.com.sofka.domain.nomina.value.ControlHorasId;
import co.com.sofka.domain.nomina.value.TipoHora;

public class ControlHora extends Entity<ControlHorasId> {
    private Cedula cedula;
    private TipoHora tipoHora;
    private Cantidad cantidad;


    public ControlHora(ControlHorasId entityId, Cedula cedula, TipoHora tipoHora, Cantidad cantidad) {
        super(entityId);
        this.cedula = cedula;
        this.tipoHora = tipoHora;
        this.cantidad = cantidad;
    }

    public void agregarCedula(Cedula cedula){
        this.cedula = cedula;
    }

    public void agregarTipoHora(TipoHora tipoHora){
        this.tipoHora = tipoHora;
    }

    public void agregarCantidad(Cantidad cantidad){
        this.cantidad = cantidad;
    }

    public Cedula cedula() {
        return cedula;
    }

    public TipoHora tipoHora() {
        return tipoHora;
    }

    public Cantidad cantidad() {
        return cantidad;
    }
}
