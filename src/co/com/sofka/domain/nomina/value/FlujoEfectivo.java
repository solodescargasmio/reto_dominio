package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FlujoEfectivo implements ValueObject<Double> {
    private final Double value;

    public FlujoEfectivo(Double value) {
        this.value = Objects.requireNonNull(value);
        if(value<0){
            throw new IllegalArgumentException("El Flujo de efectivo no pueder ser menor a cero");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
