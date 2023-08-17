package br.com.projeto.papelaria.dominio;

public class ItensPedido {
	
	private Long idItensPedido;
	private Pedido pedido;
	private Produto produto;
	private Double desconto;
	private Integer quantidade;
	private Double precoTotal;
	
	
	public Long getIdItensPedido() {
		return idItensPedido;
	}
	public void setIdItensPedido(Long idItensPedido) {
		this.idItensPedido = idItensPedido;
	}
	public Pedido getIdPedido() {
		return pedido;
	}
	public void setIdPedido(Pedido idPedido) {
		this.pedido = idPedido;
	}
	public Produto getIdProduto() {
		return produto;
	}
	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	
	
	

}
