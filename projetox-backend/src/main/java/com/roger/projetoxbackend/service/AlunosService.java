package com.roger.projetoxbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roger.projetoxbackend.entity.Alunos;
import com.roger.projetoxbackend.repository.AlunosRepository;

@Service
public class AlunosService {
	
	@Autowired
	private AlunosRepository alunosRepo;

	public List<Alunos> getAllAlunos() {
		return alunosRepo.findAll();
	}
}
