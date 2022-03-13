package co.com.sofka.domain.balance.value;

import co.com.sofka.domain.empresa.value.AgendaId;
import co.com.sofka.domain.generic.Identity;

public class EstadoFinancieroId extends Identity {
    private EstadoFinancieroId(String id){
        super(id);
    }

    public EstadoFinancieroId(){

    }

    public static EstadoFinancieroId of(String id) {
        return new EstadoFinancieroId(id);
    }
}
