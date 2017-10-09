package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.AnnualNotes;
import br.org.estacaoluz.epctg.repository.AnnualNotesRepository;
import br.org.estacaoluz.epctg.service.AnnualNotesService;

@Service
public class AnnualNotesServiceImpl implements AnnualNotesService {

	@Autowired
	private AnnualNotesRepository repository;

	@Override
	public ResponseEntity<AnnualNotes> create(AnnualNotes annualNotes) {
		return new ResponseEntity<AnnualNotes>(this.repository.save(annualNotes), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<AnnualNotes> read(Long id) {
		return new ResponseEntity<AnnualNotes>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<AnnualNotes> update(AnnualNotes annualNotes) {
		return new ResponseEntity<AnnualNotes>(this.repository.save(annualNotes), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<AnnualNotes>> getAll() {
		return new ResponseEntity<List<AnnualNotes>>(new ArrayList<AnnualNotes>(this.repository.findAll()), HttpStatus.OK);
	}

}