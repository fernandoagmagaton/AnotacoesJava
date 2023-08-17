package minecraft;

//extends -> herança
public class Enxada extends Bloco {
	//atributos
	//variável que só aceita true or false
	boolean conquista;

	//métodos
	
	//construtor
	public Enxada () {
		System.out.println("");
		System.out.println("   __");
		System.out.println("  /");
		System.out.println(" /");
	}
	public void arar() {
		System.out.println("Terra arada ._._._.");
		conquista = true;
	}
	
	// Uso do polimorfismo para modificar o comportamento de um método.
	//Obrigatório usar o mesmo nome do método
	public void minerar () {
		System.out.println("Dano causado!");
	}
}
