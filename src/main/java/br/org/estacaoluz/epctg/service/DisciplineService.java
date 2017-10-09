package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Discipline;

public interface DisciplineService {
	public ResponseEntity<Discipline> create(Discipline discipline);
	public ResponseEntity<Discipline> read(Long id);
	public ResponseEntity<Discipline> update(Discipline discipline);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<Discipline>> getAll();
}
