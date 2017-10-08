package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Teacher;
import br.org.estacaoluz.epctg.repository.TeacherRepository;
import br.org.estacaoluz.epctg.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherRepository repository;

	@Override
	public ResponseEntity<Teacher> create(Teacher teacher) {
		return new ResponseEntity<Teacher>(this.repository.save(teacher), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Teacher> read(Long id) {
		return new ResponseEntity<Teacher>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Teacher> update(Teacher teacher) {
		return new ResponseEntity<Teacher>(this.repository.save(teacher), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Teacher>> getAll() {
		return new ResponseEntity<List<Teacher>>(new ArrayList<Teacher>(this.repository.findAll()), HttpStatus.OK);
	}

}
