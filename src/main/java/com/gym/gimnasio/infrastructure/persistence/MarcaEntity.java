package com.gym.gimnasio.infrastructure.persistence;

import jakarta.persitence.*;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.Inherited;
import java.time.LocalDate;

@Entity
@Table(name = "marcasPersonales")
@Getter
@Setter
public class MarcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long atletaId;
    private String ejercicio;
    private double peso;
    private int repeticiones;
    private LocalDate fecha;
}
