package br.org.estacaoluz.epctg.controller;

import static br.org.estacaoluz.epctg.util.ConstantsUtil.API;
import static br.org.estacaoluz.epctg.util.ConstantsUtil.SCHOOL_YEAR;

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

import br.org.estacaoluz.epctg.bean.SchoolYear;
import br.org.estacaoluz.epctg.service.SchoolYearService;

@RestController
@Transactional
@RequestMapping(API + SCHOOL_YEAR)
@CrossOrigin(origins = "*")
public class SchoolYearController {

	@Autowired
	private SchoolYearService service;
	
	@PostMapping
	public ResponseEntity<SchoolYear> create(@RequestBody SchoolYear schoolYear) {
		return this.service.create(schoolYear);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SchoolYear> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<SchoolYear> update(@RequestBody SchoolYear schoolYear){
		return this.service.update(schoolYear);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<SchoolYear>> getAll(){
		return this.service.getAll();
	}
	
}
