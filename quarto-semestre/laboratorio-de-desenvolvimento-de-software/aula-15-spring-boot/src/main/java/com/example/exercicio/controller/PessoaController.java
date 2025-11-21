package com.example.exercicio.controller;

import com.example.exercicio.model.Pessoa;
import com.example.exercicio.repository.PessoaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa adicionar(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id) {
        if (!pessoaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        pessoaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizada) {

        if(!pessoaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        Pessoa pessoaExistente = pessoaRepository.findById(id).orElse(null);

        if (pessoaExistente != null) {
            pessoaExistente.setNome(pessoaAtualizada.getNome());
            Pessoa pessoaAtualizadaNoBanco = pessoaRepository.save(pessoaExistente);
            return ResponseEntity.ok(pessoaAtualizadaNoBanco);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
