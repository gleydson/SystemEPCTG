package br.org.estacaoluz.epctg.controller;

import static br.org.estacaoluz.epctg.util.ConstantsUtil.API;
import static br.org.estacaoluz.epctg.util.ConstantsUtil.EMAIL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.estacaoluz.epctg.bean.Email;
import br.org.estacaoluz.epctg.service.EmailService;

@RestController
@Transactional
@RequestMapping(API + EMAIL)
@CrossOrigin(origins = "*")
public class EmailController {

	@Autowired
	private EmailService service;
	
	@PostMapping
	public ResponseEntity<Boolean> sendMain(@RequestBody Email email) {
		return this.service.send(email);
	}
}
