package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Relative;

public interface RelativeService {
	public ResponseEntity<Relative> create(Relative relative);
	public ResponseEntity<Relative> read(Long id);
	public ResponseEntity<Relative> update(Relative relative);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<Relative>> getAll();
}
