package co.com.sofka.domain.generico;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Anio implements ValueObject<Integer> {
    private final Integer value;

    public Anio(Integer value) {
        this.value = Objects.requireNonNull(value);
        LocalDate date_actual = LocalDate.now();
        int year = date_actual.getYear();
        if (value != year) {
            throw new IllegalArgumentException("El Anio debe ser el actual  "+year);
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}