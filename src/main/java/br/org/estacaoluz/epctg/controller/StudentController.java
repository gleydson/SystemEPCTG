package br.org.estacaoluz.epctg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.estacaoluz.epctg.bean.Student;
import br.org.estacaoluz.epctg.service.StudentService;

@RestController
@Transactional
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping
	public ResponseEntity<Student> create(@RequestBody Student student) {
		return this.service.create(student);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<Student> update(@RequestBody Student student){
		return this.service.update(student);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getAll(){
		return this.service.getAll();
	}
	
}
