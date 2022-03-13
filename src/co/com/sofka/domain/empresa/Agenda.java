package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.value.AgendaId;
import co.com.sofka.domain.empresa.value.FechaT;
import co.com.sofka.domain.empresa.value.Resultado;
import co.com.sofka.domain.generic.Entity;

public class Agenda extends Entity<AgendaId> {
    private FechaT fecha;
    private Resultado resultado;
    public Agenda(AgendaId entityId, FechaT fecha, Resultado resultado) {
        super(entityId);
        this.fecha = fecha;
        this.resultado = resultado;
    }

    public void agregarFecha(FechaT fecha){
        this.fecha = fecha;
    }

    public void agregarResultado(Resultado resultado){
        this.resultado = resultado;
    }

    public FechaT fecha() {
        return fecha;
    }

    public Resultado resultado() {
        return resultado;
    }
}
