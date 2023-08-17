package br.com.estrutura.trycatchfinally;

public class TryCatch2 {

	public static void main(String[] args) {
		
		int valores [] = {10,30,5,8};
		int i = 0;
		
		try {
			
		
		for (i = 0 ; i < valores.length ; i++) {
			System.out.println(valores[i]);
			}
		}
		catch(Exception bala) {
			System.out.println("Erro na quantidade de elementos "+bala.getMessage() );
		}
		
	}

}
