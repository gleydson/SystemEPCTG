package br.org.estacaoluz.epctg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.estacaoluz.epctg.bean.ContactInformation;

public interface ContactInformationRepository extends JpaRepository<ContactInformation, Long> { }
