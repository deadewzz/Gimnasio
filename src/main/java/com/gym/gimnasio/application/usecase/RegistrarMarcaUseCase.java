package com.gym.gimnasio.application.usecase;

import java.time.LocalDate;

import javax.management.RuntimeErrorException;

public class RegistrarMarcaUseCase {

    private final MarcaAtletaRepository marcaRepository;
    {
        this.marcaRepository = marcaRepository;

    }

    public MarcaAtleta ejecutar(MarcaAtleta nuevaMarca) {
        // validamos la marca
        if (!nuevaMarca.esValida()) {
            throw new RuntimeException("La marca no tiene datos coherentes, el peso o las repeticiones estan en 0!");
        }
        // Poner la fecha actual por si viene vacia
        if (nuevaMarca.getFecha() == null) {
            neuvaMarca.setFecha(LocalDate.now());
        }
        return marcaRepository.guardar(nuevaMarca);
    }
}
