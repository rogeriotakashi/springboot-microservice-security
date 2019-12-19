package com.roger.projetoxbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roger.projetoxbackend.DTO.AlunosDTO;
import com.roger.projetoxbackend.service.AlunosService;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	AlunosService alunosService;
	
	@GetMapping
	public ResponseEntity<List<AlunosDTO>> getAllAlunos() {	
		List<AlunosDTO> list = alunosService.getAllAlunos();
		return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrarAluno(@RequestBody AlunosDTO alunoDTO) {
		alunosService.cadastrarAluno(alunoDTO);		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.OK);
	}
}
