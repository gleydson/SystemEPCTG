package br.org.estacaoluz.epctg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.estacaoluz.epctg.bean.Administrator;
import br.org.estacaoluz.epctg.service.AdministratorService;

@RestController
@RequestMapping("/administrator")
@CrossOrigin(origins = "*")
public class AdministratorController {

	@Autowired
	private AdministratorService service;
	
	@PostMapping
	public ResponseEntity<Administrator> create(@RequestBody Administrator administrator) {
		return this.service.create(administrator);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Administrator> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<Administrator> update(@RequestBody Administrator administrator){
		return this.service.update(administrator);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Administrator>> getAll(){
		return this.service.getAll();
	}
	
}