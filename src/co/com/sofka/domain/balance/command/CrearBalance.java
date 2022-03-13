package co.com.sofka.domain.balance.command;

import co.com.sofka.domain.balance.value.BalanceId;
import co.com.sofka.domain.balance.value.EstadoFinancieroId;
import co.com.sofka.domain.balance.value.PatrimonioNetoId;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.FechaMes;

public class CrearBalance extends Command {
    private final BalanceId balanceId;
    private final EmpresaId empresaId;
    private final FechaMes fechaMes;
    private final PatrimonioNetoId patrimonioNetoId;
    private final EstadoFinancieroId estadoFinancieroId;

    public CrearBalance(BalanceId balanceId,PatrimonioNetoId patrimonioNetoId,EstadoFinancieroId estadoFinancieroId,EmpresaId empresaId, FechaMes fechaMes) {
        this.balanceId = balanceId;
        this.empresaId = empresaId;
        this.fechaMes = fechaMes;
        this.patrimonioNetoId = patrimonioNetoId;
        this.estadoFinancieroId = estadoFinancieroId;
    }

    public BalanceId getBalanceId() {
        return balanceId;
    }

    public EmpresaId getEmpresaId() {
        return empresaId;
    }

    public FechaMes getFechaMes() {
        return fechaMes;
    }

    public PatrimonioNetoId getPatrimonioNetoId() {
        return patrimonioNetoId;
    }

    public EstadoFinancieroId getEstadoFinancieroId() {
        return estadoFinancieroId;
    }
}
