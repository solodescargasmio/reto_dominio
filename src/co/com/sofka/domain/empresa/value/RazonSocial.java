package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class RazonSocial implements ValueObject<String> {
    public final String value;

    public RazonSocial(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.equals("")){
            throw new IllegalArgumentException("La Razon Social no puede ser vacia");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
