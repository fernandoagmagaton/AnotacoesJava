package contas;

public class Conta {
	// atributos
	// POO - Encapsulamento
	// 1) Usar o modificador private nas variaveis
	// 2) Criar métodos (getters e setters) para acessar as variaveis
	private String cliente;
	private double saldo;
	
	

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// --------------------- Encapsulamento

	// construtor
	public Conta() {
		super();
		System.out.println("Agência 2167");
	}

	// métodos
	/**
	 * método simples (void) Exibir o saldo da conta
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	void depositar (double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);
	}
	
	/**
	 * Método com parametro (variavel)
	 * 
	 * @param valor
	 */
	void sacar(double valor) {
		saldo += valor;
		System.out.println("Débito: R$ " + valor);
	}
	
	/**
	 * Método com 2 parametros (objeto e variavel)
	 * @param destino
	 * @param valor
	 */
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
	}
	
	/**
	 * Método com 2 parametros (variaveis) e retorno
	 * @param cc1
	 * @param cc2
	 * @return
	 */
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
}
