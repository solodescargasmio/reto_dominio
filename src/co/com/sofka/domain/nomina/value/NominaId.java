package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.balance.value.BalanceId;
import co.com.sofka.domain.generic.Identity;

public class NominaId extends Identity {
    private NominaId(String id){
        super(id);
    }

    public NominaId(){

    }

    public static NominaId of(String id) {
        return new NominaId(id);
    }
}
