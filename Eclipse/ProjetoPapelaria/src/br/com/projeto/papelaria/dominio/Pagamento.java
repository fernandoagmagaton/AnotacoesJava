package br.com.projeto.papelaria.dominio;

public class Pagamento {
	
	private Long idPagamento;
	private Pedido pedido;
	private Tipopagamento tipo;
	private String descricao;
	private Double valor;
	private Double parcelas;
	private Double valorParcelas;
	
	public Long getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}
	public Pedido getIdPedido() {
		return pedido;
	}
	public void setIdPedido(Pedido idPedido) {
		this.pedido = idPedido;
	}
	public Tipopagamento getTipopagamento() {
		return tipo;
	}
	public void setTipo(Tipopagamento tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getParcelas() {
		return parcelas;
	}
	public void setParcelas(Double parcelas) {
		this.parcelas = parcelas;
	}
	public Double getValorParcelas() {
		return valorParcelas;
	}
	public void setValorParcelas(Double valorParcelas) {
		this.valorParcelas = valorParcelas;
	}

}

