package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.balance.value.BalanceId;
import co.com.sofka.domain.generic.Identity;

public class SalarioId extends Identity {
    private SalarioId(String id){
        super(id);
    }

    public SalarioId(){

    }

    public static SalarioId of(String id) {
        return new SalarioId(id);
    }
}
