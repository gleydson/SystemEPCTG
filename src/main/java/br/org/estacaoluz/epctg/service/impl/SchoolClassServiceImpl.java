package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.SchoolClass;
import br.org.estacaoluz.epctg.repository.SchoolClassRepository;
import br.org.estacaoluz.epctg.service.SchoolClassService;

@Service
public class SchoolClassServiceImpl implements SchoolClassService {

	@Autowired
	private SchoolClassRepository repository;

	@Override
	public ResponseEntity<SchoolClass> create(SchoolClass schoolClass) {
		return new ResponseEntity<SchoolClass>(this.repository.save(schoolClass), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<SchoolClass> read(Long id) {
		return new ResponseEntity<SchoolClass>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<SchoolClass> update(SchoolClass schoolClass) {
		return new ResponseEntity<SchoolClass>(this.repository.save(schoolClass), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<SchoolClass>> getAll() {
		return new ResponseEntity<List<SchoolClass>>(new ArrayList<SchoolClass>(this.repository.findAll()), HttpStatus.OK);
	}

}
