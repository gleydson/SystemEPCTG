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

import br.org.estacaoluz.epctg.bean.Teacher;
import br.org.estacaoluz.epctg.service.TeacherService;

@RestController
@Transactional
@RequestMapping("/teacher")
@CrossOrigin(origins = "*")
public class TeacherController {

	@Autowired
	private TeacherService service;
	
	@PostMapping
	public ResponseEntity<Teacher> create(@RequestBody Teacher teacher) {
		return this.service.create(teacher);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Teacher> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<Teacher> update(@RequestBody Teacher teacher){
		return this.service.update(teacher);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Teacher>> getAll(){
		return this.service.getAll();
	}
	
}