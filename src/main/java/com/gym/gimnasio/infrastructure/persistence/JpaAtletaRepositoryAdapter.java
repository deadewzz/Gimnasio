package com.gym.gimnasio.infrastructure.persistence;

import com.gym.gimnasio.domain.model.Atleta;
import com.gym.gimnasio.domain.repository.AtletaRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service 

    public class JpaAtletaRepositoryAdapter implements AtletaRepository {

        private final AtletaJpaRepository atletaJpaRepository; 

        public JpaAtletaRepositoryAdapter(AtletaJpaRepository atletaJpaRepository) {
        this.atletaJpaRepository = atletaJpaRepository; 
        }

        @Override 
        public Atleta save(Atleta atleta) {
            AtletaEntity entity = new AtletaEntity(
                atleta.getId(),
                atleta.getNombre(),
                atleta.getFechaNacimiento().toString(),
                atleta.getPesoActual()
            );
            AtletaEntity savedEntity = atletaJpaRepository.save(entity);
            return new Atleta(
                savedEntity.getId(),
                savedEntity.getNombre(),
                LocalDate.parse(savedEntity.getFechaNacimiento()),
                savedEntity.getPesoActual()
            );
        }

        @Override
        public Atleta findById(Long id) {
            return  atletaJpaRepository.findById(id)
                .map(entity -> new Atleta(
                    entity.getId(),
                    entity.getNombre(),
                    LocalDate.parse(entity.getFechaNacimiento()),
                    entity.getPesoActual()
                ))
                .orElse(null);
        }

        @Override
        public List<Atleta> findAll() {
            return atletaJpaRepository.findAll().stream()
                .map(entity -> new Atleta(
                    entity.getId(),
                    entity.getNombre(),
                    LocalDate.parse(entity.getFechaNacimiento()),
                    entity.getPesoActual()
                ))
                .toList();
        }

        @Override
        public void deleteById(Long id) {
            atletaJpaRepository.deleteById(id);
        }
    }
