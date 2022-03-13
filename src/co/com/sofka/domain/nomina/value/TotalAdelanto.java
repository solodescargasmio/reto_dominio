package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalAdelanto implements ValueObject<Double> {
    private final Double value;

    public TotalAdelanto(Double value) {
        this.value = Objects.requireNonNull(value);
        if(value<0){
            throw new IllegalArgumentException("El Adelanto no pueder ser menor a cero");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
