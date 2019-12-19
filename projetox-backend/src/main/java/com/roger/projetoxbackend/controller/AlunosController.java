package com.roger.projetoxbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roger.projetoxbackend.entity.Alunos;
import com.roger.projetoxbackend.service.AlunosService;

@RestController
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	AlunosService alunosService;
	
	@GetMapping
	public List<Alunos> getAllAlunos() {
		return alunosService.getAllAlunos();
	}
}
