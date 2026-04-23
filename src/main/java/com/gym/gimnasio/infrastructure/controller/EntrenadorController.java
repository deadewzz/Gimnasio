package com.gym.gimnasio.infrastructure.controller;

import com.gym.gimnasio.domain.model.Entrenador;
import com.gym.gimnasio.infrastructure.dto.EntrenadorRequest;
import com.gym.gimnasio.application.usecase.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {
    

    private final RegistrarEntrenadorUseCase registrarEntrenadorUseCase;
    private final EditarEntrenadorUseCase editarEntrenadorUseCase;
    private final EliminarEntrenadorUseCase eliminarEntrenadorUseCase;


    public EntrenadorController(RegistrarEntrenadorUseCase registrarEntrenadorUseCase, 
                                EditarEntrenadorUseCase editarEntrenadorUseCase,
                                EliminarEntrenadorUseCase eliminarEntrenadorUseCase) {
        this.registrarEntrenadorUseCase = registrarEntrenadorUseCase;
        this.editarEntrenadorUseCase = editarEntrenadorUseCase;
        this.eliminarEntrenadorUseCase = eliminarEntrenadorUseCase;
    }

    @PostMapping
    public ResponseEntity<Entrenador> registrarEntrenador(@Valid @RequestBody EntrenadorRequest request) {
        Entrenador nuevo = registrarEntrenadorUseCase.registrarEntrenador(request.nombre(), request.especialidad());
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entrenador> editarEntrenador(@PathVariable Long id, @Valid @RequestBody EntrenadorRequest request) {
        // Aquí llamas al caso de uso correspondiente y retornas directamente
        Entrenador actualizado = editarEntrenadorUseCase.ejecutar(id, request.nombre(), request.especialidad());
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEntrenador(@PathVariable Long id) {
    eliminarEntrenadorUseCase.eliminarEntrenador(id);
    return ResponseEntity.noContent().build();
}
}