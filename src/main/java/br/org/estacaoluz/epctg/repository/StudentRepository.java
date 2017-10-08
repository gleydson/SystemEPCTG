package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.estacaoluz.epctg.bean.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { }
