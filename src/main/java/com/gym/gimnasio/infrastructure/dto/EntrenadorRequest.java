package com.gym.gimnasio.infrastructure.dto;

// Imports de validación
import lombok.NonNull;


public record EntrenadorRequest(
    @NonNull String nombre,
    @NonNull String especialidad
) 
{}
