package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.generico.Anio;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.generico.Mes;
import co.com.sofka.domain.nomina.Nomina;
import co.com.sofka.domain.nomina.NominaCreada;
import co.com.sofka.domain.nomina.command.CrearNomina;
import co.com.sofka.domain.nomina.value.NominaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearNominaUseCaseTest {

    @Test
    void crearNomina() {
        //arrange
        FechaMes fechaMes;
        NominaId nominaId = NominaId.of("xxxx");
        EmpresaId empresaId = EmpresaId.of("eeee");
        Mes mes=new Mes(5);
        Anio anio=new Anio(2022);
        fechaMes=new FechaMes(mes,anio);

        CrearNomina crearNomina = new CrearNomina(fechaMes, empresaId, nominaId);

        //act
        CrearNominaUseCase useCase = new CrearNominaUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(crearNomina))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (NominaCreada)events.get(0);
        Assertions.assertEquals("nomina.nominacreada",event.type);
        Assertions.assertEquals("eeee",event.getEmpresaId().value());
        Assertions.assertEquals("xxxx",event.aggregateRootId());


    }
}