package com.unievangelica.progwebback.dominio.modalidade;

import com.unievangelica.progwebback.dominio.categoria.Categoria;
import com.unievangelica.progwebback.dominio.categoria.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModalidadeServico {

    @Autowired
    private ModalidadeRepositorio modalidadeRepositorio;


    public Modalidade salvar(Modalidade modalidade){
        return modalidadeRepositorio.save(modalidade);
    }

    public boolean excluir(Long modalidadeId){
        Modalidade modalidadeBusca = modalidadeRepositorio.getOne(modalidadeId);
        if( modalidadeBusca != null ){
            modalidadeRepositorio.delete(modalidadeBusca);
            return true;
        }
        else {
            return false;
        }
    }

    public Modalidade buscarPeloId(Long modalidadeId){
        return modalidadeRepositorio.getOne(modalidadeId);
    }

    public List<Modalidade> buscarTodos(){
        return modalidadeRepositorio.findAll();
    }
}
