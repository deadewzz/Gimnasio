package com.gym.gimnasio.domain.exception;


public class AtletaNoEncontradoException extends RuntimeException {
    public AtletaNoEncontradoException(String message) {
    
        super("Atleta no encontrado: " + (message == null ? "ID desconocido" : message));
    }
}