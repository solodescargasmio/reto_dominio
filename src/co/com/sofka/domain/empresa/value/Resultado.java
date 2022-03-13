package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Resultado implements ValueObject<String> {
    private final String value;

    public Resultado(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Resultado no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
