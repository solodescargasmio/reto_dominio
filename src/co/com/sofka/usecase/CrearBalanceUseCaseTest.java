package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.balance.BalanceCreado;
import co.com.sofka.domain.balance.command.CrearBalance;
import co.com.sofka.domain.balance.value.BalanceId;
import co.com.sofka.domain.balance.value.EstadoFinancieroId;
import co.com.sofka.domain.balance.value.PatrimonioNetoId;
import co.com.sofka.domain.empresa.EmpresaCreada;
import co.com.sofka.domain.empresa.command.CrearEmpresa;
import co.com.sofka.domain.empresa.value.EmpresaId;
import co.com.sofka.domain.empresa.value.RUT;
import co.com.sofka.domain.empresa.value.RazonSocial;
import co.com.sofka.domain.generico.Anio;
import co.com.sofka.domain.generico.FechaMes;
import co.com.sofka.domain.generico.Mes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CrearBalanceUseCaseTest {

    @Test
    void crearBalance() {
        //arrange
        BalanceId balanceId = BalanceId.of("bbbbbb");
        EmpresaId empresaId = EmpresaId.of("eeeeee");
        PatrimonioNetoId patrimonioNetoId=PatrimonioNetoId.of("pppppp");
        EstadoFinancieroId estadoFinancieroId=EstadoFinancieroId.of("efefef");
        Mes mes = new Mes(5);
        Anio anio=new Anio(2022);
        FechaMes fechaMes= new FechaMes(mes,anio);

        CrearBalance crearBalance=new CrearBalance(balanceId,patrimonioNetoId,estadoFinancieroId,empresaId,fechaMes);


        //act
        CrearBalanceUseCase useCase= new CrearBalanceUseCase();
        FechaMes fe=new FechaMes(new Mes(5),new Anio(2022));
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(crearBalance))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (BalanceCreado)events.get(0);
        Assertions.assertEquals("balance.balancecreado",event.type);
        Assertions.assertEquals("eeeeee",event.getEmpresaId().value());
        Assertions.assertEquals(fechaMes,event.getFechaMes().value());
        Assertions.assertEquals("bbbbbb",event.aggregateRootId());
    }
}