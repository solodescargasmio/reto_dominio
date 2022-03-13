package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Rubro implements ValueObject<String> {
    private final String value;

    public Rubro(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("El Rubro no puede ser vacio");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
