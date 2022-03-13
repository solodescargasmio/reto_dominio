package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.FechaT;
import co.com.sofka.domain.empresa.value.Tipo;
import co.com.sofka.domain.empresa.value.TramiteId;
import co.com.sofka.domain.generic.Entity;

import java.util.Date;

public class Tramite extends Entity<TramiteId> {
    private FechaT fecha;
    private Tipo tipo;
    public Tramite(TramiteId entityId,FechaT fecha,Tipo tipo) {
        super(entityId);
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public void agregarFecha(FechaT fecha){
        this.fecha = fecha;
    }

    public void agregarTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public FechaT fecha() {
        return fecha;
    }

    public Tipo tipo() {
        return tipo;
    }
}
