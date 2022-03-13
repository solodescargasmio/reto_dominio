package co.com.sofka.usecase;

import co.com.sofka.domain.empresa.value.SeccionId;

public interface SMSService {

    boolean enviarMensajeAEmpresa(SeccionId seccionId, String message);

}
