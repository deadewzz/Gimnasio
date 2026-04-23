package com.gym.gimnasio.application.usecase;

// Imports de modelos y repositorios
import com.gym.gimnasio.domain.model.Entrenador;
import com.gym.gimnasio.domain.repository.EntrenadorRepository;

// Imports de Spring
import org.springframework.stereotype.Service;

@Service
public class RegistrarEntrenadorUseCase {
    
    private final EntrenadorRepository entrenadorRepository;

    public RegistrarEntrenadorUseCase(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    public Entrenador registrarEntrenador(String nombre, String especialidad) {
        Entrenador nuevoEntrenador = new Entrenador();
        nuevoEntrenador.setNombre(nombre);
        nuevoEntrenador.setEspecialidad(especialidad);
        return entrenadorRepository.save(nuevoEntrenador);
    }

}
