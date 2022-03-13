package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {
    public final String value;

    public Tipo(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Tipo no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
