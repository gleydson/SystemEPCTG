package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.Student;
import br.org.estacaoluz.epctg.repository.StudentRepository;
import br.org.estacaoluz.epctg.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public ResponseEntity<Student> create(Student student) {
		return new ResponseEntity<Student>(this.repository.save(student), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Student> read(Long id) {
		return new ResponseEntity<Student>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Student> update(Student student) {
		return new ResponseEntity<Student>(this.repository.save(student), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Student>> getAll() {
		return new ResponseEntity<List<Student>>(new ArrayList<Student>(this.repository.findAll()), HttpStatus.OK);
	}

}
