package concessionaria;

public class Hangar {

	public static void main(String[] args) {
		Aviao boeing = new Aviao();
		boeing.ano = 1976;
		boeing.cor ="branco";
		boeing.envergadura = 44.42;
		System.out.println("Boeing 76");
		System.out.println("Ano: " + boeing.ano);
		System.out.println("Cor: " +boeing.cor);
		System.out.println("Envergadura: " + boeing.envergadura);
		boeing.decolar();
		boeing.acelerar();
		boeing.aterrizar();
		boeing.desligar();
		

	}

}
