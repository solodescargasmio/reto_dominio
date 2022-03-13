package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.balance.value.BalanceId;
import co.com.sofka.domain.generic.Identity;

public class AdelantoId extends Identity {
    private AdelantoId(String id){
        super(id);
    }

    public AdelantoId(){

    }

    public static AdelantoId of(String id) {
        return new AdelantoId(id);
    }
}
