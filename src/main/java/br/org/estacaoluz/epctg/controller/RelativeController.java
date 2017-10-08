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

import br.org.estacaoluz.epctg.bean.Relative;
import br.org.estacaoluz.epctg.service.RelativeService;

@RestController
@RequestMapping("/relative")
@CrossOrigin(origins = "*")
public class RelativeController {

	@Autowired
	private RelativeService service;
	
	@PostMapping
	public ResponseEntity<Relative> create(@RequestBody Relative relative) {
		return this.service.create(relative);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Relative> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<Relative> update(@RequestBody Relative relative){
		return this.service.update(relative);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Relative>> getAll(){
		return this.service.getAll();
	}
	
}