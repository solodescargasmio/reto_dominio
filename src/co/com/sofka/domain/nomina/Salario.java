package co.com.sofka.domain.nomina;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.nomina.value.SalarioId;
import co.com.sofka.domain.nomina.value.TotalSalario;

public class Salario extends Entity<SalarioId> {
    private Cedula cedula;
    private TotalSalario totalSalario;
    public Salario(SalarioId entityId, Cedula cedula, TotalSalario totalSalario) {
        super(entityId);
        this.cedula = cedula;
        this.totalSalario = totalSalario;
    }

    public void agregarCedula(Cedula cedula){
        this.cedula = cedula;
    }

    public void agregarTotalSalario(TotalSalario totalSalario){
        this.totalSalario = totalSalario;
    }

    public Cedula cedula() {
        return cedula;
    }

    public TotalSalario totalSalario() {
        return totalSalario;
    }
}
