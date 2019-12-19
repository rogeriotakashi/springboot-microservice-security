package com.roger.projetoxbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roger.projetoxbackend.DTO.AlunosDTO;
import com.roger.projetoxbackend.entity.Alunos;
import com.roger.projetoxbackend.repository.AlunosRepository;

@Service
public class AlunosService {
	
	@Autowired
	private AlunosRepository alunosRepo;

	public List<AlunosDTO> getAllAlunos() {
		List<Alunos> list = alunosRepo.findAll();	
		return list.stream()
				.map(AlunosService::toDTO)
				.collect(Collectors.toList());
	}

	public void cadastrarAluno(AlunosDTO alunoDTO) {
		alunosRepo.saveAndFlush(toEntity(alunoDTO));
	}
	
	private static AlunosDTO toDTO(Alunos aluno) {
		AlunosDTO alunoDTO = new AlunosDTO();
		BeanUtils.copyProperties(aluno, alunoDTO);
		return alunoDTO;
	}
	
	private static Alunos toEntity(AlunosDTO alunoDTO) {
		Alunos alunosEntity = new Alunos();
		BeanUtils.copyProperties(alunoDTO, alunosEntity);
		return alunosEntity;
	}
}
