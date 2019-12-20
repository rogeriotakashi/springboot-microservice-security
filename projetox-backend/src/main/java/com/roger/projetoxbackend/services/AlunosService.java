package com.roger.projetoxbackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roger.projetoxbackend.dtos.AlunosDTO;
import com.roger.projetoxbackend.models.Alunos;
import com.roger.projetoxbackend.repositories.AlunosRepository;

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
	
	public void atualizarAluno(long id, AlunosDTO alunoDTO) {
		Alunos aluno = toEntity(alunoDTO);
		aluno.setId(id);
		alunosRepo.saveAndFlush(aluno);
	}
	
	public void deletarAluno(long id) {
		alunosRepo.deleteById(id);
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
