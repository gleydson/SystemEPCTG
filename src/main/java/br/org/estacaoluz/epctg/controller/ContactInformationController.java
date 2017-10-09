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

import br.org.estacaoluz.epctg.bean.ContactInformation;
import br.org.estacaoluz.epctg.service.ContactInformationService;

@RestController
@Transactional
@RequestMapping("/contactInformation")
@CrossOrigin(origins = "*")
public class ContactInformationController {

	@Autowired
	private ContactInformationService service;
	
	@PostMapping
	public ResponseEntity<ContactInformation> create(@RequestBody ContactInformation contactInformation) {
		return this.service.create(contactInformation);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ContactInformation> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<ContactInformation> update(@RequestBody ContactInformation contactInformation){
		return this.service.update(contactInformation);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<ContactInformation>> getAll(){
		return this.service.getAll();
	}
	
}
