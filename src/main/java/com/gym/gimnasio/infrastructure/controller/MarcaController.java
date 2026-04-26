package com.gym.gimnasio.infrastructure.controller;

@RestController
@RequestMapping("api/v1/marcas")
public class MarcaController {

    private final RegistrarMarcaUseCase useCase;

    public MarcaController(RegistrarMarcaUseCase useCase) {
        this.useCase = useCase;

    }

    @PostMapping
    public ResponseEntity<MarcaAtleta> registrar(@RequestBody MarcaResquestDTO dto) {

        // Mapeamos el DTO a modelo de Dominio
        MarcaAtleta nuevaMarca = new MarcaAtleta();
        nuevaMarca.setAtletaId(dto.getAtletaId());
        nuevaMarca.setEjercicio(dto.getEjercicio());
        nuevaMarca.setPeso(dto.getPeso());
        nuevaMarca.setRepeticiones(dto.getRepeticiones());

        return ResponseEntity.ok(useCase.ejecutar(nuevaMarca));
    }

}
