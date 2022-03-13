package co.com.sofka.domain.nomina;

import co.com.sofka.domain.balance.event.EmpresaAgregada;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.nomina.event.AdelantoAgregado;
import co.com.sofka.domain.nomina.event.FechaMesAgregada;
import co.com.sofka.domain.nomina.event.HorasAgregadas;
import co.com.sofka.domain.nomina.event.SalarioAgregado;

public class NominaEventChange extends EventChange {
    public NominaEventChange(Nomina nomina) {

        apply((FechaMesAgregada event)->{
            nomina.fechaMes = event.getFechaMes();
        });

        apply((EmpresaAgregada event)->{
            nomina.empresaId = event.getEmpresaId();
        });

        apply((SalarioAgregado event)->{
            nomina.salarios.add(event.getSalarioId());
        });

        apply((AdelantoAgregado event)->{
            nomina.adelantos.add(event.getAdelantoId());
        });

        apply((HorasAgregadas event)->{
            nomina.controlHoras.add(event.getControlHorasId());
        });


    }
}
