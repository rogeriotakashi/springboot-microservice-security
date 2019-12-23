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

import com.roger.projetoxbackend.dtos.UsuarioDTO;
import com.roger.projetoxbackend.models.Usuario;
import com.roger.projetoxbackend.services.UsuariosService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosResource {
	
	@Autowired
	UsuariosService usuariosService;
	
	@GetMapping
	@ApiOperation(value = "Finds all users",
			notes = "Return all register of users from the database.Be Careful!",
			response = Usuario.class)
	public ResponseEntity<List<UsuarioDTO>> getAllAlunos() {	
		List<UsuarioDTO> list = usuariosService.getAllUsuarios();
		return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrarUsuario(@RequestBody UsuarioDTO alunoDTO) {
		usuariosService.cadastrarUsuario(alunoDTO);		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizar/{id}")
	public ResponseEntity<String> atualizarUsuario(@PathVariable("id") long id,
			@RequestBody UsuarioDTO alunoDTO) {
		usuariosService.atualizarUsuario(id,alunoDTO);		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping("/remover/{id}")
	public ResponseEntity<String> deletarUsuario(@PathVariable("id") long id) {
		usuariosService.deletarUsuario(id);		
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.OK);
	}
	
	
}
