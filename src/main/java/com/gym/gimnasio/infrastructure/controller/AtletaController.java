package com.gym.gimnasio.infrastructure.controller;

import com.gym.gimnasio.application.usecase.RegistrarAtletaUseCase;
import com.gym.gimnasio.application.usecase.ListarAtletasUseCase;
import com.gym.gimnasio.application.usecase.EliminarAtletasUseCase;
import com.gym.gimnasio.application.usecase.ActualizarAtletasUseCase;
import com.gym.gimnasio.domain.model.Atleta;
import com.gym.gimnasio.infrastructure.dto.AtletaRequest;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api/atletas")
public class AtletaController {
    private final RegistrarAtletaUseCase registrarAtletaUseCase;
    private final ListarAtletasUseCase listarAtletasUseCase;
    private final ActualizarAtletasUseCase actualizarAtletasUseCase;
    private final EliminarAtletasUseCase eliminarAtletasUseCase;

    public AtletaController(RegistrarAtletaUseCase registrarAtletaUseCase, ListarAtletasUseCase listarAtletasUseCase, ActualizarAtletasUseCase actualizarAtletasUseCase, EliminarAtletasUseCase eliminarAtletasUseCase) {
        this.registrarAtletaUseCase = registrarAtletaUseCase;
        this.listarAtletasUseCase = listarAtletasUseCase;
        this.actualizarAtletasUseCase = actualizarAtletasUseCase;
        this.eliminarAtletasUseCase = eliminarAtletasUseCase;
    }


    @PostMapping
    
        public ResponseEntity<Atleta> registrar(@Valid @RequestBody AtletaRequest request) {
        Atleta registrado = registrarAtletaUseCase.registrarAtleta(
            request.nombre(), 
            request.fechaNacimiento(), 
            request.pesoActual()
        );
        return ResponseEntity.ok(registrado);

    }
    
    @GetMapping
        public ResponseEntity<List<Atleta>> listarAtletas() {
                List<Atleta> lista = listarAtletasUseCase.ejecutar();
            return ResponseEntity.ok(lista);
}
    
    @PutMapping("/{id}")
    public ResponseEntity<Atleta> actualizarAtleta(@PathVariable Long id, @RequestBody AtletaRequest request) {
        Atleta actualizado = actualizarAtletasUseCase.actualizarAtleta(
            id,
            request.nombre(),
            request.fechaNacimiento(),
            request.pesoActual()
        );
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAtleta(@PathVariable Long id) {
        eliminarAtletasUseCase.eliminarAtleta(id);
        return ResponseEntity.noContent().build();
    }

}
