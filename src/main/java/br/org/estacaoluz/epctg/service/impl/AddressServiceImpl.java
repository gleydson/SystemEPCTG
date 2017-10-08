package br.org.estacaoluz.epctg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Address;
import br.org.estacaoluz.epctg.repository.AddressRepository;
import br.org.estacaoluz.epctg.service.AddressService;

public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository repository;

	@Override
	public ResponseEntity<Address> create(Address address) {
		return new ResponseEntity<Address>(this.repository.save(address), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Address> read(Long id) {
		return new ResponseEntity<Address>(this.repository.findOne(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Address> update(Address address) {
		return new ResponseEntity<Address>(this.repository.save(address), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> delete(Long id) {
		this.repository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Address>> getAll() {
		return new ResponseEntity<List<Address>>(new ArrayList<Address>(this.repository.findAll()), HttpStatus.OK);
	}

}
