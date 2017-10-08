package br.org.estacaoluz.epctg.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.org.estacaoluz.epctg.bean.ContactInformation;

public interface ContactInformationService {
	public ResponseEntity<ContactInformation> create(ContactInformation contactInformation);
	public ResponseEntity<ContactInformation> read(Long id);
	public ResponseEntity<ContactInformation> update(ContactInformation contactInformation);
	public ResponseEntity<Boolean> delete(Long id);
	public ResponseEntity<List<ContactInformation>> getAll();
}
