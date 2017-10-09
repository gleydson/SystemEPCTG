package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.SchoolYear;
import br.org.estacaoluz.epctg.repository.SchoolYearRepository;
import br.org.estacaoluz.epctg.service.SchoolYearService;

@Service
public class SchoolYearServiceImpl implements SchoolYearService {

	@Autowired
	private SchoolYearRepository repository;

	@Override
	public ResponseEntity<SchoolYear> create(SchoolYear schoolYear) {
		return new ResponseEntity<SchoolYear>(this.repository.save(schoolYear), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<SchoolYear> read(Long id) {
		return new ResponseEntity<SchoolYear>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<SchoolYear> update(SchoolYear schoolYear) {
		return new ResponseEntity<SchoolYear>(this.repository.save(schoolYear), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<SchoolYear>> getAll() {
		return new ResponseEntity<List<SchoolYear>>(new ArrayList<SchoolYear>(this.repository.findAll()), HttpStatus.OK);
	}

}
