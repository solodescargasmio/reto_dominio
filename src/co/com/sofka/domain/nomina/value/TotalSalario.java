package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalSalario implements ValueObject<Double> {
    private final Double value;

    public TotalSalario(Double value) {
        this.value = Objects.requireNonNull(value);
        if(value<1){
            throw new IllegalArgumentException("El Salario no pueder ser cero");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
