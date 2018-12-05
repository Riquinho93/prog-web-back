package com.unievangelica.progwebback.dominio.modalidade;

import com.unievangelica.progwebback.dominio.categoria.Categoria;
import com.unievangelica.progwebback.dominio.categoria.CategoriaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modalidade")
public class ModalidadeControlador {

    @Autowired
    private ModalidadeServico modalidadeServico;

    @PostMapping
    public ResponseEntity<?> salvar(@Validated @RequestBody Modalidade modalidade){
        return new ResponseEntity(modalidadeServico.salvar(modalidade), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> alterar(@Validated @RequestBody Modalidade modalidade){
        return new ResponseEntity(modalidadeServico.salvar(modalidade), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{modalidadeId}")
    public ResponseEntity<?> excluir(@PathVariable Long modalidadeId) {
        return new ResponseEntity(modalidadeServico.excluir(modalidadeId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        return new ResponseEntity(modalidadeServico.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping(value = "/{modalidadeId}")
    public ResponseEntity<?> findById(@PathVariable Long modalidadeId) {
        return new ResponseEntity(modalidadeServico.buscarPeloId(modalidadeId), HttpStatus.OK);
    }
}
