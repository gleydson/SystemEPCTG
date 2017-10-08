package br.org.estacaoluz.epctg.service.impl;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import br.org.estacaoluz.epctg.bean.Email;
import br.org.estacaoluz.epctg.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	private Email email;
	private InternetAddress address[];
	private MimeMessagePreparator preparator;
	
	@Override
	public ResponseEntity<Boolean> send(Email email) {
		this.email = email;
		this.address = new InternetAddress[email.getRecipientAddresses().size()];
		for(int i = 0; i < this.email.getRecipientAddresses().size(); i++) {
			for (String mail : this.email.getRecipientAddresses().keySet()) {
				try {
					this.address[i] = new InternetAddress(mail);
				} catch (AddressException e) {
					e.printStackTrace();
				}
			}
		}
		this.preparator =  new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				messageHelper.setTo(address);
				messageHelper.setFrom(new InternetAddress(email.getSenderEmail(), email.getSenderName()));
				messageHelper.setText(email.getBodyMessage());
				messageHelper.setSubject(email.getSubject());
			}
		};
		
		try {
			this.javaMailSender.send(this.preparator);
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
	}

}