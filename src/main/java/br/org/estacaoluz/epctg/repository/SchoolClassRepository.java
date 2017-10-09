package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.estacaoluz.epctg.bean.SchoolClass;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> { }
