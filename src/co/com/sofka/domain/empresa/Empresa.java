package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.event.*;
import co.com.sofka.domain.empresa.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Empresa extends AggregateEvent<EmpresaId> {
    protected Set<AgendaId> agendas;
    protected Set<SeccionId> secciones;
    protected Set<TramiteId> tramites;
    protected Set<EmpleadoId> empleados;
    protected RazonSocial razonsocial;
    protected RUT rut;

    public Empresa(EmpresaId entityId,RazonSocial razonsocial,RUT rut) {
        super(entityId);
        this.razonsocial = razonsocial;
        this.rut = rut;
        subscribe(new EmpresaEventChange(this));
        appendChange(new EmpresaCreada(razonsocial,rut)).apply();
    }

    private Empresa(EmpresaId empresaId){
        super(empresaId);
        subscribe(new EmpresaEventChange(this));
    }

    public static Empresa from(EmpresaId empresaId, List<DomainEvent> eventList){
        Empresa empresa = new Empresa(empresaId);
        eventList.forEach(empresa::applyEvent);
        return empresa;
    }

    public void agregarRazonSocial(RazonSocial razonsocial){
        appendChange(new RazonSocialGenerada(razonsocial)).apply();
    }
    public void cambiarEmpleadoSeccion(EmpleadoId empleadoId,SeccionId seccionId, EmpresaId empresaId){
        appendChange(new SeccionCambiada(seccionId, empleadoId,empresaId)).apply();
    }

    public void agregarRUT(RUT razonsocial){
        appendChange(new RUTGenerado(rut)).apply();
    }
    public void agregarTramite(TramiteId tramiteId){
        appendChange(new TramiteAgregado(tramiteId)).apply();
    }
    public void agregarEmpleado(EmpleadoId empleadoId){
        appendChange(new EmpleadoAgregado(empleadoId)).apply();
    }
    public void agregarAgenda(AgendaId agendaId){
        appendChange(new AgendaAgregada(agendaId)).apply();
    }
    public void agregarSeccion(SeccionId seccionId){
        appendChange(new SeccionAgregada(seccionId)).apply();
    }

    public Set<AgendaId> agendas() {
        return agendas;
    }

    public Set<SeccionId> secciones() {
        return secciones;
    }

    public Set<TramiteId> tramites() {
        return tramites;
    }

    public RazonSocial razonsocial() {
        return razonsocial;
    }

    public RUT rut() {
        return rut;
    }
}
