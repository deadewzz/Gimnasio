package com.gym.gimnasio.application.usecase;

// Imports de modelos y repositorios
import com.gym.gimnasio.domain.model.Entrenador;
import com.gym.gimnasio.domain.repository.EntrenadorRepository;

// Imports de Spring
import org.springframework.stereotype.Service;
@Service
public class EditarEntrenadorUseCase {
    private final EntrenadorRepository entrenadorRepository;

    public EditarEntrenadorUseCase(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    // Cambiamos el nombre a 'ejecutar' o 'editar' para que sea más claro
    // y recibimos los nuevos datos como parámetros
    public Entrenador ejecutar(Long id, String nuevoNombre, String nuevaEspecialidad) {
        Entrenador entrenador = entrenadorRepository.findById(id);
        
        if (entrenador != null) {
            // APLICAMOS los nuevos datos que recibiste desde el Controller
            entrenador.setNombre(nuevoNombre);
            entrenador.setEspecialidad(nuevaEspecialidad);
            
            // Guardamos y retornamos el objeto actualizado
            return entrenadorRepository.save(entrenador);
        } else {
            // Aquí te sugiero lanzar una excepción personalizada (ej: EntrenadorNotFoundException)
            // en lugar de retornar un String. 
            throw new RuntimeException("Entrenador con ID " + id + " no encontrado.");
        }
    }
}
