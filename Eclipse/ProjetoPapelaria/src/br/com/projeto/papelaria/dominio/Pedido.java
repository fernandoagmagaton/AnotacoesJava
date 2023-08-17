package br.com.projeto.papelaria.dominio;

import java.util.Date;

public class Pedido extends InformacoesPessoais {

	private Long idPedido;
	private Date dataPedido;
	
	public Pedido(Usuario us) {
		super.usuario = us;

	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
}
