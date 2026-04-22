package com.gym.gimnasio.infrastructure.dto;

import jakarta.validation.constraints.Min;
import lombok.NonNull;

public record AtletaRequest(

    @NonNull
    String nombre,

    @NonNull
    String fechaNacimiento,

    @Min(value = 0, message = "El peso debe ser positivo")
    double pesoActual
) {}
