package br.org.estacaoluz.epctg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class IndexController {
	
	@GetMapping
	public String toIndex() {
		return "index";
	}
}
