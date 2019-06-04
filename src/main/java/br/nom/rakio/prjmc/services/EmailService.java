package br.nom.rakio.prjmc.services;

import org.springframework.mail.SimpleMailMessage;

import br.nom.rakio.prjmc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
