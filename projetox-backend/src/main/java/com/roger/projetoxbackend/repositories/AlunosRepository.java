package com.roger.projetoxbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roger.projetoxbackend.models.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
