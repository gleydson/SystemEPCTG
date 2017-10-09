package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.SchoolClass;

public interface SchoolClassService {
	public ResponseEntity<SchoolClass> create(SchoolClass schoolClass);
	public ResponseEntity<SchoolClass> read(Long id);
	public ResponseEntity<SchoolClass> update(SchoolClass schoolClass);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<SchoolClass>> getAll();
}
