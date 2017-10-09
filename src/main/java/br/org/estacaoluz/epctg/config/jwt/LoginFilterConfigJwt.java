package br.org.estacaoluz.epctg.config.jwt;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.org.estacaoluz.epctg.bean.Administrator;

public class LoginFilterConfigJwt extends AbstractAuthenticationProcessingFilter {

	public LoginFilterConfigJwt(String url, AuthenticationManager authManager) {
		super(new AntPathRequestMatcher(url));
		setAuthenticationManager(authManager);
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		
		Administrator credentials = new ObjectMapper()
				.readValue(request.getInputStream(), Administrator.class);
		
		return getAuthenticationManager().authenticate (
				new UsernamePasswordAuthenticationToken (
						credentials.getUsername(), 
						credentials.getPassword(), 
						Collections.emptyList()
				)
		);
	}
	
	@Override
	protected void successfulAuthentication (
			HttpServletRequest request, 
			HttpServletResponse response,
			FilterChain filterChain,
			Authentication auth) throws IOException, ServletException {
		
		TokenAuthenticationConfigJwt.addAuthentication(response, auth.getName());
	}

}
