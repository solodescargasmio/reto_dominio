package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.Identity;

public class AgendaId extends Identity {
    private AgendaId(String id){
        super(id);
    }

    public AgendaId(){

    }

    public static AgendaId of(String id) {
        return new AgendaId(id);
    }
}
