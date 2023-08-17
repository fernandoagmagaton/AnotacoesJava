package br.com.logica.introducao;

import java.util.Scanner;

public class EntradaTexto {

	public static void main(String[] args) {
		String nome;
		
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Digite os dados do seu cartao de credito:");
		
		nome = texto.next();

		System.out.println("compra realizada com sucesso! " + nome);
		
	}

}
