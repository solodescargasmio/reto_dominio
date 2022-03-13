package co.com.sofka.domain.balance.value;

import co.com.sofka.domain.empresa.value.AgendaId;
import co.com.sofka.domain.generic.Identity;

public class BalanceId extends Identity {
    private BalanceId(String id){
        super(id);
    }

    public BalanceId(){

    }

    public static BalanceId of(String id) {
        return new BalanceId(id);
    }
}
