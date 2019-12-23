package com.roger.projetoxbackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roger.projetoxbackend.dtos.AlunosDTO;
import com.roger.projetoxbackend.models.Alunos;
import com.roger.projetoxbackend.services.AlunosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/alunos")
public class AlunosResource {
	
	@Autowired
	AlunosService alunosService;
	
	@GetMapping
	@ApiOperation(value = "Finds all Alunos",
			notes = "Return all register of Alunos from the database.Be Careful!",
			response = Alunos.class)
	public ResponseEntity<List<AlunosDTO>> getAllAlunos() {	
		List<AlunosDTO> list = alunosService.getAllAlunos();
		return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrarAluno(@RequestBody AlunosDTO alunoDTO) {
		alunosService.cadastrarAluno(alunoDTO);		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar/{id}")
	public ResponseEntity<String> atualizarAluno(@PathVariable("id") long id,
			@RequestBody AlunosDTO alunoDTO) {
		alunosService.atualizarAluno(id,alunoDTO);		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping("/remover/{id}")
	public ResponseEntity<String> deletarAluno(@PathVariable("id") long id) {
		alunosService.deletarAluno(id);		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.OK);
	}
	
	
}
