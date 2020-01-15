package com.roger.projetoxbackend.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.roger.projetoxbackend.models.Usuario;
import com.roger.projetoxbackend.repositories.UsuariosRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UsuariosRepository usuariosRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		Optional<Usuario> usuarioOptional = usuariosRepository.findByUsuario(username);	
		
		if(usuarioOptional.isPresent()) {
			Usuario usuario = usuarioOptional.get();
			return new User(usuario.getUsuario(),usuario.getSenha(), new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("Usuario não encontrado");
		}		
	}

}
