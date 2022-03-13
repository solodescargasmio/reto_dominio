package co.com.sofka.domain.nomina;

import co.com.sofka.domain.empresa.Empresa;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.nomina.event.*;
import co.com.sofka.domain.nomina.value.AdelantoId;
import co.com.sofka.domain.nomina.value.ControlHorasId;
import co.com.sofka.domain.nomina.value.NominaId;
import co.com.sofka.domain.nomina.value.SalarioId;

import java.util.List;
import java.util.Set;

public class Nomina extends AggregateEvent<NominaId> {
    protected FechaMes fechaMes;
    protected EmpresaId empresaId;
    protected Set<SalarioId> salarios;
    protected Set<AdelantoId> adelantos;
    protected Set<ControlHorasId> controlHoras;
    public Nomina(NominaId entityId, FechaMes fechaMes, EmpresaId empresaId) {
        super(entityId);
        this.fechaMes = fechaMes;
        this.empresaId = empresaId;
        subscribe(new NominaEventChange(this));
        appendChange(new NominaCreada(fechaMes,empresaId)).apply();
    }

    private Nomina(NominaId nominaId){
        super(nominaId);
        subscribe(new NominaEventChange(this));
    }

    public static Nomina from(NominaId nominaId, List<DomainEvent> eventList){
        Nomina nomina = new Nomina(nominaId);
        eventList.forEach(nomina::applyEvent);

        return nomina;
    }

    public void agregarFechaMes(FechaMes fechaMes){
        appendChange(new FechaMesAgregada(fechaMes)).apply();
    }
    public void agregarEmpresaId(EmpresaId empresaId){
        appendChange(new EpresaAgregada(empresaId)).apply();
    }
    public void agregarSalario(SalarioId salarioId){
        appendChange(new SalarioAgregado(salarioId)).apply();
    }
    public void agregarAdalanto(AdelantoId adelantoId){
        appendChange(new AdelantoAgregado(adelantoId)).apply();
    }
    public void agregarHorasId(ControlHorasId controlHorasId){
        appendChange(new HorasAgregadas(controlHorasId)).apply();
    }

    public FechaMes fechaMes() {
        return fechaMes;
    }

    public EmpresaId empresaId() {
        return empresaId;
    }

    public Set<SalarioId> salarios() {
        return salarios;
    }

    public Set<AdelantoId> adelantos() {
        return adelantos;
    }

    public Set<ControlHorasId> controlHoras() {
        return controlHoras;
    }
}
