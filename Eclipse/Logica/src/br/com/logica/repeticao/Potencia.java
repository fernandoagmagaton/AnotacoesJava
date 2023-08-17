package br.com.logica.repeticao;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main(String[] args) {

		int n1,n2,rs=1;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre um número base"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre um número Expoente"));
		rs = n1;
		
		for (int i = 1; i < n2 ; i++) {
			rs *= n1;
		}
		
		JOptionPane.showConfirmDialog(null, "O resultado da soma é: " +rs);
	
	}

}
