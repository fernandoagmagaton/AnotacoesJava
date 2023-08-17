package br.com.estrutura.trycatchfinally;

public class TryCatch1 {

	public static void main(String[] args) {
		
		int x= 10;
		int y = 0;
		
		try {
			int p = x / y;
			System.out.println();
		}
		catch(Exception ex) {
			System.out.println("Erro ao calcular "+ex.getMessage());
			ex.printStackTrace();
		
		}

	}

}