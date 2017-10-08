package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Relative;
import br.org.estacaoluz.epctg.repository.RelativeRepository;
import br.org.estacaoluz.epctg.service.RelativeService;

public class RelativeServiceImpl implements RelativeService {

	@Autowired
	private RelativeRepository repository;

	@Override
	public ResponseEntity<Relative> create(Relative relative) {
		return new ResponseEntity<Relative>(this.repository.save(relative), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Relative> read(Long id) {
		return new ResponseEntity<Relative>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Relative> update(Relative relative) {
		return new ResponseEntity<Relative>(this.repository.save(relative), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Relative>> getAll() {
		return new ResponseEntity<List<Relative>>(new ArrayList<Relative>(this.repository.findAll()), HttpStatus.OK);
	}

}
