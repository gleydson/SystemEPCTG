package br.org.estacaoluz.epctg.controller;

import static br.org.estacaoluz.epctg.util.ConstantsUtil.API;
import static br.org.estacaoluz.epctg.util.ConstantsUtil.ANNUAL_NOTES;

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

import br.org.estacaoluz.epctg.bean.AnnualNotes;
import br.org.estacaoluz.epctg.service.AnnualNotesService;

@RestController
@Transactional
@RequestMapping(API + ANNUAL_NOTES)
@CrossOrigin(origins = "*")
public class AnnualNotesController {
	
	@Autowired
	private AnnualNotesService service;
	
	@PostMapping
	public ResponseEntity<AnnualNotes> create(@RequestBody AnnualNotes annualNotes) {
		return this.service.create(annualNotes);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AnnualNotes> read(@PathVariable Long id){
		return this.service.read(id);
	}
	
	@PutMapping
	public ResponseEntity<AnnualNotes> update(@RequestBody AnnualNotes annualNotes){
		return this.service.update(annualNotes);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return this.service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<AnnualNotes>> getAll(){
		return this.service.getAll();
	}
	
}
