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

import br.org.estacaoluz.epctg.bean.Discipline;
import br.org.estacaoluz.epctg.service.DisciplineService;

@RestController
@Transactional
@RequestMapping("/discipline")
@CrossOrigin(origins = "*")
public class DisciplineController {

	@Autowired
	private DisciplineService service;
	
	@PostMapping
	public ResponseEntity<Discipline> create(@RequestBody Discipline discipline) {
		return this.service.create(discipline);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Discipline> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<Discipline> update(@RequestBody Discipline discipline){
		return this.service.update(discipline);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Discipline>> getAll(){
		return this.service.getAll();
	}
	
}
