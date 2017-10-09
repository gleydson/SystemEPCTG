package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.Discipline;
import br.org.estacaoluz.epctg.repository.DisciplineRepository;
import br.org.estacaoluz.epctg.service.DisciplineService;

@Service
public class DisciplineServiceImpl implements DisciplineService {

	@Autowired
	private DisciplineRepository repository;

	@Override
	public ResponseEntity<Discipline> create(Discipline discipline) {
		return new ResponseEntity<Discipline>(this.repository.save(discipline), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Discipline> read(Long id) {
		return new ResponseEntity<Discipline>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Discipline> update(Discipline discipline) {
		return new ResponseEntity<Discipline>(this.repository.save(discipline), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Discipline>> getAll() {
		return new ResponseEntity<List<Discipline>>(new ArrayList<Discipline>(this.repository.findAll()), HttpStatus.OK);
	}
	
}
