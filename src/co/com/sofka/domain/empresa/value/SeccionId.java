package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.Identity;

public class SeccionId extends Identity {
    private SeccionId(String id){
        super(id);
    }

    public SeccionId(){

    }

    public static SeccionId of(String id) {
        return new SeccionId(id);
    }
}
