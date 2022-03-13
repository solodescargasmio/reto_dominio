package co.com.sofka.domain.generico;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Mes implements ValueObject<Integer> {
    private final Integer value;

    public Mes(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(value<1 || value>12){
            throw new IllegalArgumentException("El Mes debe estar en el rango de 1 a 12");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
