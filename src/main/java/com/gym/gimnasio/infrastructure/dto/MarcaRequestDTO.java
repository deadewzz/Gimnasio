package com.gym.gimnasio.infrastructure.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validations.constraints.Positive;
import lombok.Data;

@Data
public class MarcaRequestDTO {

    private Long atletaiId;

    @NotBlank(message = "El nombre del ejercicios es obligatorio")
    private String ejercicio;

    @Positive(message = "El peso debe ser mauyor a 0")
    private double peso;

    @Positive(message = "Las repeticiones deben ser al menos 1")
    private int repeticiones;
}
