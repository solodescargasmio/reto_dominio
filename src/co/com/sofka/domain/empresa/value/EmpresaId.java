package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.Identity;

public class EmpresaId extends Identity {

    private EmpresaId(String id){
        super(id);
    }

    public EmpresaId(){

    }

    public static EmpresaId of(String id) {
        return new EmpresaId(id);
    }
}
