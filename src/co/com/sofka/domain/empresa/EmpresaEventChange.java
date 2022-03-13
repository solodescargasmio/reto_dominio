package co.com.sofka.domain.empresa;

import co.com.sofka.domain.empresa.event.*;
import co.com.sofka.domain.empresa.value.EmpleadoId;
import co.com.sofka.domain.empresa.value.RUT;
import co.com.sofka.domain.empresa.value.RazonSocial;
import co.com.sofka.domain.empresa.value.TramiteId;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;
import java.util.HashSet;

public class EmpresaEventChange extends EventChange {
    public EmpresaEventChange(Empresa empresa) {

        apply((EmpresaCreada event) ->{
            empresa.razonsocial = event.getRazonSocial();
            empresa.rut = event.getRut();
            empresa.empleados = new HashSet<>();
            empresa.agendas = new HashSet<>();
            empresa.secciones = new HashSet<>();
        });

        apply((SeccionAgregada event) ->{
            empresa.secciones.add(event.getSeccionId());
        });

        apply((AgendaAgregada event) ->{
            empresa.agendas.add(event.getAgendaId());
        });

        apply((EmpleadoAgregado event) ->{
            empresa.empleados.add(event.getEmpleadoId());
        });

        apply((RUTGenerado event) ->{
            empresa.rut = new RUT(event.getRut().toString());
        });

        apply((RazonSocialGenerada event) ->{
            empresa.razonsocial = new RazonSocial(event.getRazonsocial().value);
        });
    }
}
