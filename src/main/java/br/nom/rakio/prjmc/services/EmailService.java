package br.nom.rakio.prjmc.services;

import org.springframework.mail.SimpleMailMessage;
import javax.mail.internet.MimeMessage;

import br.nom.rakio.prjmc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);
}
