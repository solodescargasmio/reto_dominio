package co.com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.empresa.Empresa;
import co.com.sofka.domain.empresa.command.CrearEmpresa;

public class CrearEmpresaUseCase extends UseCase<RequestCommand<CrearEmpresa>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEmpresa> input) {
        CrearEmpresa crearEmpresa = input.getCommand();

        Empresa empresa = new Empresa(crearEmpresa.getEmpresaId(),crearEmpresa.getRazonSocial(),crearEmpresa.getRut());
        emit().onResponse(new ResponseEvents(empresa.getUncommittedChanges()));

    }
}
