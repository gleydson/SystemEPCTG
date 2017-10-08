package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Teacher;

public interface TeacherService {
	public ResponseEntity<Teacher> create(Teacher teacher);
	public ResponseEntity<Teacher> read(Long id);
	public ResponseEntity<Teacher> update(Teacher teacher);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<Teacher>> getAll();
}
