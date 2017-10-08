package br.org.estacaoluz.epctg.bean;

import java.util.HashMap;
import java.util.Map;

public class Email {
	
	private String senderName;
	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	private String senderEmail;
	private String recipientName;
	private Map<String, String> recipientAddresses;
	private String bodyMessage;
	private String subject;
	
	public Email(String recipientName, Map<String, String> recipientAddresses, String bodyMessage, String subject) {
		this.recipientName = recipientName;
		this.recipientAddresses = new HashMap<String, String>(recipientAddresses);
		this.bodyMessage = bodyMessage;
		this.subject = subject;
	}
	
	public String getRecipientName() {
		return recipientName;
	}
	
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	
	public Map<String, String> getRecipientAddresses() {
		return recipientAddresses;
	}
	
	public void setRecipientAddresses(Map<String, String> recipientAddresses) {
		this.recipientAddresses = recipientAddresses;
	}
	
	public String getBodyMessage() {
		return bodyMessage;
	}
	
	public void setBodyMessage(String bodyMessage) {
		this.bodyMessage = bodyMessage;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
