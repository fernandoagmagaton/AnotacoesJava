package concessionaria;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
	
	
	public Carro() {
		
		
		System.out.println("");
		System.out.println("          _____");
		System.out.println(" _______/_______| ");
		System.out.println("  D'-.      | /  ) ");
		System.out.println(" '(o)'-.....'(O)' ");
		System.out.println("");
		
		//chassi tambem é uma variavel que recebe os caracteres detro de ()
		String chassi = new String ("123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		//a linha abaixo cria um objeto de nome gerador
		//random é usado para gerar numeros aleatorios
		Random gerador = new Random();
		System.out.print("Chassi: * ");
		for (int i = 1; i < 16; i++) {
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.println(" *");
	}
	
	void ligar() {
	System.out.println("Ligar carro");
	}
	void acelerar() {
	System.out.println("Vruummmmmmmmmm.....");
	}
	void desligar () {
	System.out.println("Desligar carro");
	}
	
}
