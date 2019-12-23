package com.roger.projetoxbackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roger.projetoxbackend.dtos.UsuarioDTO;
import com.roger.projetoxbackend.models.Usuario;
import com.roger.projetoxbackend.repositories.UsuariosRepository;

@Service
public class UsuariosService {
	
	@Autowired
	private UsuariosRepository alunosRepo;

	public List<UsuarioDTO> getAllUsuarios() {
		List<Usuario> list = alunosRepo.findAll();	
		return list.stream()
				.map(UsuariosService::toDTO)
				.collect(Collectors.toList());
	}

	public void cadastrarUsuario(UsuarioDTO alunoDTO) {
		alunosRepo.saveAndFlush(toEntity(alunoDTO));
	}
	
	public void atualizarUsuario(long id, UsuarioDTO alunoDTO) {
		Usuario aluno = toEntity(alunoDTO);
		aluno.setId(id);
		alunosRepo.saveAndFlush(aluno);
	}
	
	public void deletarUsuario(long id) {
		alunosRepo.deleteById(id);
	}
	
	private static UsuarioDTO toDTO(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		BeanUtils.copyProperties(usuario, usuarioDTO);
		return usuarioDTO;
	}
	
	private static Usuario toEntity(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		BeanUtils.copyProperties(usuarioDTO, usuario);
		return usuario;
	}

	

	
}
