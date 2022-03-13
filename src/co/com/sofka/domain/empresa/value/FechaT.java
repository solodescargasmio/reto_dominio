package co.com.sofka.domain.empresa.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaT implements ValueObject<Date> {
    public final Date value;

    public FechaT(Date value) {
        this.value = Objects.requireNonNull(value);
        if(value==null){
            throw new IllegalArgumentException("La fecha debe de ser valida.");
        }
    }

    @Override
    public Date value() {
        return value;
    }
}
