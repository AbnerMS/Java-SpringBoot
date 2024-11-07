package com.aulaPROA.demo.controller;
import com.aulaPROA.demo.model.Aluno;
import com.aulaPROA.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository aulaPROARepository;

    @PostMapping("/add")
    public ResponseEntity<String> addAluno(@RequestBody Aluno aulaPROA) {
        aulaPROARepository.save(aulaPROA);
        return ResponseEntity.ok("Aluno inserido com sucesso");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Aluno>> listAlunos() {
        List<Aluno> alunos = aulaPROARepository.findAll();
        return ResponseEntity.ok(alunos);
    }
}
