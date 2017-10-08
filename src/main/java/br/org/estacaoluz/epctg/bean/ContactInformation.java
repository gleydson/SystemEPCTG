package br.org.estacaoluz.epctg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "contactInformation")
public class ContactInformation {
	
	@Id
	@Column(nullable = false, updatable = false, insertable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String phoneNumberOne;
	
	@Column(nullable = false)
	private String phoneNumberTwo;
	
	@Column(nullable = false)
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
