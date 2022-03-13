package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Anio;
import co.com.sofka.domain.generico.Cedula;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.generico.Mes;
import co.com.sofka.domain.nomina.AdelantoCreado;
import co.com.sofka.domain.nomina.NominaCreada;
import co.com.sofka.domain.nomina.command.CrearAdelanto;
import co.com.sofka.domain.nomina.command.CrearSalario;
import co.com.sofka.domain.nomina.value.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class CrearSalarioUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void generarSalario(){
        Cedula cedula = new Cedula("12345");
        NominaId nominaId = NominaId.of("nnnn");
        SalarioId salarioId = SalarioId.of("xxxx");
        TotalSalario totalSalario = new TotalSalario(10000D);
        //arrange
        var command = new CrearSalario(salarioId,nominaId,cedula,totalSalario);
        Mockito.when(repository.getEventsBy("aaaa")).thenReturn(events());
        var usecase = new CrearSalarioUseCase();
        usecase.addRepository(repository);
        //act

        var events = UseCaseHandler.getInstance().syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AdelantoCreado)events.get(0);
        Assertions.assertEquals("nomina.salariocreado",event.type);
        Assertions.assertEquals("eeee",event.getNominaId().value());
        Assertions.assertEquals("aaaa",event.aggregateRootId());

    }

    private List<DomainEvent> events() {
        FechaMes fechaMes = new FechaMes(new Mes(5),new Anio(2022));
        return  List.of(new NominaCreada(fechaMes, EmpresaId.of("eee")));
    }

}