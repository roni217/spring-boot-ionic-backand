package br.nom.rakio.prjmc.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import br.nom.rakio.prjmc.domain.Pedido;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.sender}")
	private String sender;
//TODO: o codigo esta comentado para evitar conflito em TEST, resolver depois
//	@Autowired
//	private TemplateEngine templateEngine;
//
//	@Autowired
//	private JavaMailSender javaMailSender;
	
	@Override
	public void sendOrderConfirmationEmail(Pedido obj) {
		SimpleMailMessage sm = prepareSimpleMailMessageFromPedido(obj);
		sendEmail(sm);
	}

	protected SimpleMailMessage prepareSimpleMailMessageFromPedido(Pedido obj) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(obj.getCliente().getEmail());
		sm.setFrom(sender);
		sm.setSubject("Pedido confirmado! Código: " + obj.getId());
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText(obj.toString());
		return sm;
	}

//	protected String htmlFromTemplatePedido(Pedido obj) {
//		Context context = new Context();
//		context.setVariable("pedido", obj);
//		return templateEngine.process("email/confirmacaoPedido", context);
//	}

//	@Override
//	public void sendOrderConfirmationHtmlEmail(Pedido obj) {
//		try {
//			MimeMessage mm = prepareMimeMessageFromPedido(obj);
//			sendHtmlEmail(mm);
//		}
//		catch (MessagingException e) {
//			sendOrderConfirmationEmail(obj);
//		}
//	}

//	protected MimeMessage prepareMimeMessageFromPedido(Pedido obj) throws MessagingException {
//		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//		MimeMessageHelper mmh = new MimeMessageHelper(mimeMessage, true);
//		mmh.setTo(obj.getCliente().getEmail());
//		mmh.setFrom(sender);
//		mmh.setSubject("Pedido confirmado! Código: " + obj.getId());
//		mmh.setSentDate(new Date(System.currentTimeMillis()));
//		mmh.setText(htmlFromTemplatePedido(obj), true);
//		return mimeMessage;
//	}

}
