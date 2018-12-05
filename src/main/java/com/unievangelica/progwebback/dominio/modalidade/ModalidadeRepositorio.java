package com.unievangelica.progwebback.dominio.modalidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeRepositorio extends JpaRepository<Modalidade, Long> {
}
