package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.estacaoluz.epctg.bean.Relative;

@Repository
public interface RelativeRepository extends JpaRepository<Relative, Long> { }
