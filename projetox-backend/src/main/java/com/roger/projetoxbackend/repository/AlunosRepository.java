package com.roger.projetoxbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roger.projetoxbackend.entity.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
