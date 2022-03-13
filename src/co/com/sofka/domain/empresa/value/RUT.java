package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class RUT implements ValueObject<String>{
    public final String value;

    public RUT(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El RUT no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
