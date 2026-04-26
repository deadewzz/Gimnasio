package com.gym.gimnasio.domain.exception;

public class MarcaInvalidaException extends RuntimeException {
    public MarcaInvalidaException(String mensaje) {
        super("Marca inválida: " + (mensaje == null ? "Valor desconocido" : mensaje));
    }
}
