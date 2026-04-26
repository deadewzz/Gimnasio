package com.gym.gimnasio.infrastructure.persistence;

import com.gym.gimnasio.domain.model.MarcaAtleta;
import com.gym.gimnasio.domain.repository.MarcaAtletaRepository;
import com.gym.gimnasio.infrastructure.persistence.entity.MarcaEntity;
import com.gym.gimnasio.infrastructure.persistence.repository.MarcaJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class MarcaJpaAdapter implements MarcaAtletaRepository {

    private final MarcaJpaRepository jpaRepository;

    public MarcaJpaAdapter(MarcaJpaRepostory jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public MarcaAtleta guardar(MarcaAtleta marca) {
        return null; // pendiente
    }

    @Override
    public List<MarcaAtleta> obtenerPorAtleta(Long atletaId) {
        return List.of(); // pendiente
    }

}
