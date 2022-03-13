package co.com.sofka.domain.nomina.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.NominaId;
import co.com.sofka.domain.nomina.value.SalarioId;
import co.com.sofka.domain.nomina.value.TotalSalario;

public class CrearSalario extends Command {
    private final SalarioId salarioId;
    private final NominaId nominaId;
    private final Cedula cedula;
    private final TotalSalario totalSalario;


    public CrearSalario(SalarioId salarioId, NominaId nominaId, Cedula cedula, TotalSalario totalSalario) {
        this.salarioId = salarioId;
        this.nominaId = nominaId;
        this.cedula = cedula;
        this.totalSalario = totalSalario;
    }

    public SalarioId getSalarioId() {
        return salarioId;
    }

    public NominaId getNominaId() {
        return nominaId;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public TotalSalario getTotalSalario() {
        return totalSalario;
    }
}
