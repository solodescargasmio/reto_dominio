package co.com.sofka.domain.balance.value;

import co.com.sofka.domain.empresa.value.AgendaId;
import co.com.sofka.domain.generic.Identity;

public class PatrimonioNetoId extends Identity {
    private PatrimonioNetoId(String id){
        super(id);
    }

    public PatrimonioNetoId(){

    }

    public static PatrimonioNetoId of(String id) {
        return new PatrimonioNetoId(id);
    }
}
