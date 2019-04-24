package br.nom.rakio.prjmc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Configuration;

import br.nom.rakio.prjmc.domain.PagamentoComBoleto;

@Configuration
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
	
}
