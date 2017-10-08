package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Administrator;

public interface AdministratorService {
	public ResponseEntity<Administrator> create(Administrator administrator);
	public ResponseEntity<Administrator> read(Long id);
	public ResponseEntity<Administrator> update(Administrator administrator);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<Administrator>> getAll();
}
