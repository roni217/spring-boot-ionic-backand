package br.nom.rakio.prjmc.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import br.nom.rakio.prjmc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	

}
