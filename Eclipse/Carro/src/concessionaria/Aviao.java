package concessionaria;

public class Aviao extends Carro {
	//atributos
	double envergadura;
	
	//métodos
	
	public void decolar() {
		System.out.println("Avião decolou");
	}
	
	void aterrizar() {
		System.out.println("Avião pousou");
	}
	
	// polimorfismo
	void acelerar() {
		System.out.println("REEEEEEEEEEEEEEEUUUUUUUUUUNNNNNNNNNNNNNNNN");
		}
	
	
	public Aviao () {
		System.out.println("-------------------------------------------");
		System.out.println("                             ___________");
		System.out.println("                                  |");
		System.out.println("                            __   _|_   _");
		System.out.println("                           (_)-/   \\-(_)");
		System.out.println("    _                         /\\___/\\     ");
		System.out.println("   (_)_______________________( ( . ) )_______________________(_) ");
		System.out.println("                              \\_____/");
	}
	
	public void desligar() {
		System.out.println("Desligar motores");
		}
		
	}

