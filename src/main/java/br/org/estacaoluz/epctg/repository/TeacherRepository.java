package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.estacaoluz.epctg.bean.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> { }
