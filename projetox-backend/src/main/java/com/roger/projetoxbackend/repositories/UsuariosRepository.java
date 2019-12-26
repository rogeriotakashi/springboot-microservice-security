package com.roger.projetoxbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roger.projetoxbackend.models.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

}
