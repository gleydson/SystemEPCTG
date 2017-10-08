package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.ContactInformation;
import br.org.estacaoluz.epctg.repository.ContactInformationRepository;
import br.org.estacaoluz.epctg.service.ContactInformationService;

@Service
public class ContactInformationServiceImpl implements ContactInformationService {

	@Autowired
	private ContactInformationRepository repository;

	@Override
	public ResponseEntity<ContactInformation> create(ContactInformation contactInformation) {
		return new ResponseEntity<ContactInformation>(this.repository.save(contactInformation), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ContactInformation> read(Long id) {
		return new ResponseEntity<ContactInformation>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ContactInformation> update(ContactInformation contactInformation) {
		return new ResponseEntity<ContactInformation>(this.repository.save(contactInformation), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<ContactInformation>> getAll() {
		return new ResponseEntity<List<ContactInformation>>(new ArrayList<ContactInformation>(this.repository.findAll()), HttpStatus.OK);
	}

}
