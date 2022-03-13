package co.com.sofka.domain.nomina.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SaldoAnual implements ValueObject<Double> {
    private final Double value;

    public SaldoAnual(Double value) {
        this.value = Objects.requireNonNull(value);
        if(value<0){
            throw new IllegalArgumentException("El Saldo no pueder ser menor a cero");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
