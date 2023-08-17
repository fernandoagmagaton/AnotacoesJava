package br.com.estruturas.atividades;

public class Atividade2 {

	public static void main(String[] args) {
		
		int [] valores = {15, 35, 16, 82, 10, 26, 31, 47, 11, 19, 5, 13, 33, 51, 201, 200, 56};
		
		for(int p = 1; p < valores.length ; p++){
			System.out.print(valores[p]);
		}
		System.out.println("\n========= VALORES ENTRE 1 E 9 =========");
		for(int i = 1; i <= 9; i++) {
			System.out.println(valores[i]);
		}
		System.out.println("========= VALORES ENTRE 8 E 13 ========");
		for(int j = 8; j <= 13; j++) {
			System.out.println(valores[j]);
		}
		System.out.println("========= NÚMEROS PARES =========");
		for(int r = 0 ; r < valores.length; r++) {
			if(valores[r] % 2 == 0) {
				System.out.print(valores[r]+ " | ");
			}
		}
		System.out.println("\n========= NÚMEROS IMPARES =========");
		for(int h = 0 ; h < valores.length; h++) {
			if(valores[h] % 3 == 0) {
				System.out.print(valores[h]+ " | ");
			}
		}
		System.out.println("\n========= MÚLTIPLOS DE 3 =========");
		for(int y = 0 ; y < valores.length; y++) {
			if(valores[y] % 3 == 0) {
				System.out.print(valores[y]+ " | ");
			}
		}
		System.out.println("\n========= MÚLTIPLOS DE 4 =========");
		for(int y = 0 ; y < valores.length; y++) {
			if(valores[y] % 4 == 0) {
				System.out.print(valores[y]+ " | ");
			}
		}
		System.out.println("\n========= MÚLTIPLOS DE 5 =========");
		for(int y = 0 ; y < valores.length; y++) {
			if(valores[y] % 5 == 0) {
				System.out.print(valores[y]+ " | ");
			}
		}
		System.out.println("\n========= LISTA INVERSA =========");
		for(int g = valores.length - 1; g >= 0; g--) {
			System.out.println(valores[g]);
		}
	}
}
