package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.empresa.Empresa;
import co.com.sofka.domain.empresa.EmpresaCreada;
import co.com.sofka.domain.empresa.command.CrearAgenda;
import co.com.sofka.domain.empresa.value.*;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Anio;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.generico.Mes;
import co.com.sofka.domain.nomina.AdelantoCreado;
import co.com.sofka.domain.nomina.NominaCreada;
import co.com.sofka.domain.nomina.command.CrearAdelanto;
import co.com.sofka.domain.nomina.value.AdelantoId;
import co.com.sofka.domain.nomina.value.NominaId;
import co.com.sofka.domain.nomina.value.TotalAdelanto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class CrearAgendaUseCaseTest {
    @Mock
    DomainEventRepository repository;


    @Test
    void crearAgenda() {
        AgendaId entityId = AgendaId.of("aaaa");
        FechaT fecha = new FechaT(new Date());
        Resultado resultado= new Resultado("Dia y Hora Agendado");
        EmpresaId empresaId = EmpresaId.of("xxxx");
        //arrange
        var command = new CrearAgenda(entityId,fecha,resultado,empresaId);
        Mockito.when(repository.getEventsBy("aaaa")).thenReturn(events());
        var usecase = new CrearAgendaUseCase();
        usecase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance().syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AdelantoCreado)events.get(0);
        Assertions.assertEquals("empresa.agendacreada",event.type);
        Assertions.assertEquals("eeee",event.getNominaId().value());
        Assertions.assertEquals("aaaa",event.aggregateRootId());

    }

    private List<DomainEvent> events() {
        RazonSocial razonsocial = new RazonSocial("Nombre Empresa");
        RUT rut = new RUT("12345678910154");
        return List.of(new EmpresaCreada(razonsocial,rut));
    }
}