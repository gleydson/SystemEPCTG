package br.org.estacaoluz.epctg.controller;

import static br.org.estacaoluz.epctg.util.ConstantsUtil.API;
import static br.org.estacaoluz.epctg.util.ConstantsUtil.SCHOOL_CLASS;

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

import br.org.estacaoluz.epctg.bean.SchoolClass;
import br.org.estacaoluz.epctg.service.SchoolClassService;

@RestController
@Transactional
@RequestMapping(API + SCHOOL_CLASS)
@CrossOrigin(origins = "*")
public class SchoolClassController {

	@Autowired
	private SchoolClassService service;
	
	@PostMapping
	public ResponseEntity<SchoolClass> create(@RequestBody SchoolClass schoolClass) {
		return this.service.create(schoolClass);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SchoolClass> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<SchoolClass> update(@RequestBody SchoolClass schoolClass){
		return this.service.update(schoolClass);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<SchoolClass>> getAll(){
		return this.service.getAll();
	}
	
}
