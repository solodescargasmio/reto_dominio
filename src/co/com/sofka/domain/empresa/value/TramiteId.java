package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.Identity;

public class TramiteId extends Identity {
    private TramiteId(String id){
        super(id);
    }

    public TramiteId(){

    }

    public static TramiteId of(String id) {
        return new TramiteId(id);
    }
}
