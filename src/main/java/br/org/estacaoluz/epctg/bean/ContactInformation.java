package br.org.estacaoluz.epctg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "contactInformation")
public class ContactInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String phoneNumberOne;
	
	@NotNull
	private String phoneNumberTwo;
	
	@NotNull
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhoneNumberOne() {
		return phoneNumberOne;
	}
	public void setPhoneNumberOne(String phoneNumberOne) {
		this.phoneNumberOne = phoneNumberOne;
	}
	public String getPhoneNumberTwo() {
		return phoneNumberTwo;
	}
	public void setPhoneNumberTwo(String phoneNumberTwo) {
		this.phoneNumberTwo = phoneNumberTwo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
