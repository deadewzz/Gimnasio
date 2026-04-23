package com.gym.gimnasio.domain.exception;

public class EntrenadorNoEncontradoException extends RuntimeException
{
    
    public EntrenadorNoEncontradoException (String message )
    {
    super ("Entrenador no encontrado: " + (message == null ? "ID desconocido" : message));
    }
    
}
