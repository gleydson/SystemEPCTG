package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.SchoolYear;

public interface SchoolYearService {
	public ResponseEntity<SchoolYear> create(SchoolYear schoolYear);
	public ResponseEntity<SchoolYear> read(Long id);
	public ResponseEntity<SchoolYear> update(SchoolYear schoolYear);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<SchoolYear>> getAll();
}
