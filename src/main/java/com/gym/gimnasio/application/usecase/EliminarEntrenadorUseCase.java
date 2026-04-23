package com.gym.gimnasio.application.usecase;

// Imports de modelos y repositorios

import com.gym.gimnasio.domain.model.Entrenador;
import com.gym.gimnasio.domain.repository.EntrenadorRepository;

// Imports de Spring

import org.springframework.stereotype.Service;

@Service
public class EliminarEntrenadorUseCase {
    
    private final EntrenadorRepository entrenadorRepository;

    public EliminarEntrenadorUseCase(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    public Entrenador eliminarEntrenador(Long id) {
        Entrenador entrenadorEliminado = entrenadorRepository.findById(id);
        if (entrenadorEliminado != null) {
            entrenadorRepository.deleteById(id);
        }
        return entrenadorEliminado;
    }

    

}
