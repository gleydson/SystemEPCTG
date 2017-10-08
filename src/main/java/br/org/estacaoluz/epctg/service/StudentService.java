package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Student;

public interface StudentService {
	public ResponseEntity<Student> create(Student student);
	public ResponseEntity<Student> read(Long id);
	public ResponseEntity<Student> update(Student student);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<Student>> getAll();
}
