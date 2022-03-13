package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.empresa.EmpleadoCreado;
import co.com.sofka.domain.empresa.TramiteCreado;
import co.com.sofka.domain.empresa.command.CrearEmpleado;
import co.com.sofka.domain.empresa.command.CrearTramite;
import co.com.sofka.domain.empresa.value.*;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.generico.Nombre;
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

class CrearTramiteUseCaseTest {


    @Mock
    DomainEventRepository repository;

    @Test
    void crearTramite() {

        TramiteId tramiteId = TramiteId.of("tttt");
        FechaT fecha = new FechaT(new Date());
        Tipo tipo = new Tipo("Alta DGI");
        EmpresaId empresaId = EmpresaId.of("xxxx");
        //arrange
        var command = new CrearTramite(tramiteId,fecha,tipo,empresaId);
        Mockito.when(repository.getEventsBy("eeee")).thenReturn(events());
        var usecase = new CrearTramiteUseCase();
        usecase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance().syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (EmpleadoCreado)events.get(0);
        Assertions.assertEquals("empresa.tramitecreado",event.type);
        Assertions.assertEquals("eeee",event.getEmpresaId().value());
        Assertions.assertEquals("aaaa",event.aggregateRootId());

    }

    private List<DomainEvent> events() {
        TramiteId tramiteId = TramiteId.of("tttt");
        FechaT fecha = new FechaT(new Date());
        Tipo tipo = new Tipo("Alta DGI");
        EmpresaId empresaId = EmpresaId.of("xxxx");
        return List.of(new TramiteCreado(tramiteId,fecha,tipo,empresaId));
    }
}