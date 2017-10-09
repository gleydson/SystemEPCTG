package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.estacaoluz.epctg.bean.Administrator;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
	public Administrator findByUsername(String username);
}
