package br.org.estacaoluz.epctg.service.impl;

import static br.org.estacaoluz.epctg.util.ConstantsUtil.ADMINISTRATOR_NOT_FOUND_EXCEPTION;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.Administrator;
import br.org.estacaoluz.epctg.repository.AdministratorRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AdministratorRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Administrator admin = repository.findByUsername(username);
		if (admin == null) throw new UsernameNotFoundException(ADMINISTRATOR_NOT_FOUND_EXCEPTION);
		return admin;
	}

}
