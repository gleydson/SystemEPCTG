package br.org.estacaoluz.epctg.service;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Email;

public interface EmailService {
	public ResponseEntity<Boolean> send(Email email);
}
