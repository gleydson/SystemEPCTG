package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.Address;

public interface AddressService {
	public ResponseEntity<Address> create(Address address);
	public ResponseEntity<Address> read(Long id);
	public ResponseEntity<Address> update(Address address);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<Address>> getAll();
}
