package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.empresa.EmpresaCreada;
import co.com.sofka.domain.empresa.command.CrearEmpresa;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.RUT;
import co.com.sofka.domain.empresa.value.RazonSocial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearEmpresaUseCaseTest {

    @Test
    void crearEmpresa() {
        //arrange
        EmpresaId empresaId = EmpresaId.of("eeeeee");
        RazonSocial razonSocial = new RazonSocial("raaaaa");
        RUT rut = new RUT("ruuu");
        CrearEmpresa crearEmpresa=new CrearEmpresa(empresaId,razonSocial,rut);

        //act
        CrearEmpresaUseCase useCase= new CrearEmpresaUseCase();
       var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(crearEmpresa))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (EmpresaCreada)events.get(0);
        Assertions.assertEquals("empresa.empresacreada",event.type);
        Assertions.assertEquals("raaaaa",event.getRazonSocial().value());
        Assertions.assertEquals("ruuu",event.getRut().value());
        Assertions.assertEquals("eeeeee",event.aggregateRootId());

    }
}