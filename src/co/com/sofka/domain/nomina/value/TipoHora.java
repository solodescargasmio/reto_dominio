package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoHora implements ValueObject<String> {
    private final String value;

    public TipoHora(String value) {
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
