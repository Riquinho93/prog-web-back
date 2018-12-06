package com.unievangelica.progwebback.dominio.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

    public List<Produto> findProdutosByModalidadeId(long modalidadeId);
}
