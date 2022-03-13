package co.com.sofka.domain.generico;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FechaMes implements ValueObject<FechaMes.Props> {
        private final Mes mes;
        private final Anio anio;

    public FechaMes(Mes mes, Anio anio) {
        this.mes = Objects.requireNonNull(mes);
        this.anio = Objects.requireNonNull(anio);
    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public Mes mes() {
                return mes;
            }

            @Override
            public Anio anio() {
                return anio;
            }
        };
    }

    public interface Props{
      Mes mes();
      Anio anio();
    }
}
