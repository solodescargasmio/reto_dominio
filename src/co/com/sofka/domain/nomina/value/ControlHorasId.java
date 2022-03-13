package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.balance.value.BalanceId;
import co.com.sofka.domain.generic.Identity;

public class ControlHorasId extends Identity {
    private ControlHorasId(String id){
        super(id);
    }

    public ControlHorasId(){

    }

    public static ControlHorasId of(String id) {
        return new ControlHorasId(id);
    }
}
