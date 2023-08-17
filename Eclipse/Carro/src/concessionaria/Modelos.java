package concessionaria;

public class Modelos {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2000;
		ferrari.cor = "vermelho";
		System.out.println("Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " +ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.desligar();
		
		Carro fusca = new Carro();
		fusca.ano = 1969;
		fusca.cor = "Bege";
		System.out.println("Fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Cor: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
	
		
		Carro camaro = new Carro();
		camaro.ano = 2011;
		camaro.cor = "Amarelo";
		System.out.println("Camaro");
		System.out.println("Ano: " +camaro.ano);
		System.out.println("Cor: " +camaro.cor);
		camaro.ligar();
		camaro.acelerar();
		camaro.desligar();
		
		Carro uno = new Carro();
		uno.ano = 1998;
		uno.cor = "Vinho";
		System.out.println("Uninho");
		System.out.println("Ano:  " +uno.ano);
		System.out.println("Cor: " +uno.cor);
		uno.ligar();
		uno.acelerar();
		uno.desligar();
	}

}
