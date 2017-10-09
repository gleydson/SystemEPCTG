package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.AnnualNotes;

public interface AnnualNotesService {
	public ResponseEntity<AnnualNotes> create(AnnualNotes annualNotes);
	public ResponseEntity<AnnualNotes> read(Long id);
	public ResponseEntity<AnnualNotes> update(AnnualNotes annualNotes);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<AnnualNotes>> getAll();
}
