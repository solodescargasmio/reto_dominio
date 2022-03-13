package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.empresa.EmpleadoCreado;
import co.com.sofka.domain.empresa.EmpresaCreada;
import co.com.sofka.domain.empresa.command.CrearAgenda;
import co.com.sofka.domain.empresa.command.CrearEmpleado;
import co.com.sofka.domain.empresa.value.*;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.nomina.AdelantoCreado;
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

class CrearEmpleadoUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void crearEmpleado() {

        EmpleadoId empleadoId = EmpleadoId.of("eeee");
        Nombre nombre=new Nombre("Pedro Pica");
        Telefono telefono = new Telefono("1245777");
        Cedula cedula=new Cedula("1254444");
    EmpresaId empresaId = EmpresaId.of("xxxx");
    //arrange
    var command = new CrearEmpleado(empleadoId,nombre,telefono,cedula,empresaId);
        Mockito.when(repository.getEventsBy("eeee")).thenReturn(events());
    var usecase = new CrearEmpleadoUseCase();
        usecase.addRepository(repository);
    //act

    var events = UseCaseHandler.getInstance().syncExecutor(usecase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

    //assert
    var event = (EmpleadoCreado)events.get(0);
        Assertions.assertEquals("empresa.empleadocreado",event.type);
        Assertions.assertEquals("eeee",event.getEmpresaId().value());
        Assertions.assertEquals("aaaa",event.aggregateRootId());

}

    private List<DomainEvent> events() {
        EmpleadoId empleadoId = EmpleadoId.of("eeee");
        Nombre nombre=new Nombre("Pedro Pica");
        Telefono telefono = new Telefono("1245777");
        Cedula cedula=new Cedula("1254444");
        EmpresaId empresaId = EmpresaId.of("xxxx");
        return List.of(new EmpleadoCreado(empleadoId,nombre,telefono,cedula,empresaId));
    }
}