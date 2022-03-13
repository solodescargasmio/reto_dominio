package co.com.sofka.domain.generico;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cedula implements ValueObject<String> {
    private final String value;

    public Cedula(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("La Cedula no puede ser vacia");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
