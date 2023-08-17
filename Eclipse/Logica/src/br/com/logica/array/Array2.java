package br.com.logica.array;

public class Array2 {

	public static void main(String[] args) {
		
		int[] numeros = { 10, 20, 3, 8, 12, 19, 31};
		
		int[] outros = { 20, 6, 8, 15, 78, 94, 3, 200, 31};

		for(int p = 0; p < numeros.length ; p++) {
			System.out.println(numeros[p]);
			}
		
		for(int p = numeros.length - 1 ; p >= 0 ; p--) {
			System.out.print(numeros[p]+" - ");
		}
		
		System.out.println("\n\n============ Soma dos Valores =============\n");
		
		int rs = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			rs += numeros[i];
		}
		
		System.out.println(rs); 
		System.out.println("===============Número de pares================");
		for(int i = 0 ; i < numeros.length ; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i]+ " | ");
			}
		}
			
			System.out.println("\n\n==================Números Iguais===============\n");
			
			for(int i = 0 ; i < outros.length ; i++) {
				
				for(int j = 0; j < numeros.length ; j++) {
					
					if( outros[i] == numeros[j]) {
						System.out.print(outros[i]+ " | ");
					}
				}
			}
		}
		
		
		
	}

