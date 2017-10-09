package br.org.estacaoluz.epctg.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.org.estacaoluz.epctg.config.jwt.AuthenticationFilterConfigJwt;
import br.org.estacaoluz.epctg.config.jwt.LoginFilterConfigJwt;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
@CrossOrigin(origins = "*")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	@Qualifier("userDetailsService")
	private UserDetailsService userDetailsService;
	
	@Bean
	public UserDetailsService userDetailsService() {
	    return super.userDetailsService();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		String login = "/login";
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers(HttpMethod.POST, login).permitAll()
			.anyRequest().authenticated()
			.and()
			.addFilterBefore(new LoginFilterConfigJwt(login, authenticationManager()), UsernamePasswordAuthenticationFilter.class)
			.addFilterBefore(new AuthenticationFilterConfigJwt(), UsernamePasswordAuthenticationFilter.class);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("123").roles("ADMIN");
		//auth.userDetailsService(userDetailsService);		
	}
	
}