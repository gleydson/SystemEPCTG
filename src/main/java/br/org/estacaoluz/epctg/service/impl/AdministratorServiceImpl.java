package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Administrator;
import br.org.estacaoluz.epctg.repository.AdministratorRepository;
import br.org.estacaoluz.epctg.service.AdministratorService;

public class AdministratorServiceImpl implements AdministratorService {

	@Autowired
	private AdministratorRepository repository;

	@Override
	public ResponseEntity<Administrator> create(Administrator administrator) {
		return new ResponseEntity<Administrator>(this.repository.save(administrator), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Administrator> read(Long id) {
		return new ResponseEntity<Administrator>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Administrator> update(Administrator administrator) {
		return new ResponseEntity<Administrator>(this.repository.save(administrator), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Administrator>> getAll() {
		return new ResponseEntity<List<Administrator>>(new ArrayList<Administrator>(this.repository.findAll()), HttpStatus.OK);
	}

}
