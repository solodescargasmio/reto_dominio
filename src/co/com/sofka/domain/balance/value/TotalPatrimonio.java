package co.com.sofka.domain.balance.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalPatrimonio implements ValueObject<Double> {
    private final Double value;

    public TotalPatrimonio(Double value) {
        this.value = Objects.requireNonNull(value);
        if(value<0){
            throw new IllegalArgumentException("El Patrimonio no pueder ser menor a cero");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
