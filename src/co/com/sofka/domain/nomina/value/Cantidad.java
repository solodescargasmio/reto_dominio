package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {
    private final Integer value;

    public Cantidad(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(value<0){
            throw new IllegalArgumentException("Las cantidad de horas no pueden ser menores a cero");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
