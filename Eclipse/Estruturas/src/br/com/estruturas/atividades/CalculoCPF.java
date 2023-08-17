package br.com.estruturas.atividades;

import javax.swing.JOptionPane;

public class CalculoCPF {

	public static void main(String[] args) {
		
		String cpfUsuario = "";
		String cpfCalc = "";
		int resto = 0;
		int resultado = 0;
		int peso = 10;
		
		cpfUsuario = JOptionPane.showInputDialog("Digite o seu CPF");
		/**
		 * vamos pegar os 9 primeiros digitos do CPF do usuario. Para isso
		 * utilizaremos o comando chamado substring, que pede 2 paramétodos,
		 * sendo: posição de inicio para pegar os valores e quantidades de 
		 * elementos a que devem ser obtidos
		 */

		cpfCalc = cpfUsuario.substring(0,9);
		System.out.println(cpfCalc);
		for (int i = 0; i < cpfCalc.length(); i++) {
			
			resultado += peso * Integer.parseInt(cpfCalc.substring(i, i+1));
			peso--;
		}
		
		resto = resultado % 11;
		if (resto < 2) {
			cpfCalc += "0";
		}
		
		else {
			cpfCalc += "" +(11-resto);
		}
		
		peso = 11;
		resultado = 0;
		resto = 0;
		
		
for (int i = 0; i < cpfCalc.length(); i++) {
			
			resultado += peso * Integer.parseInt(cpfCalc.substring(i, i+1));
			peso--;
		}
		
		resto = resultado % 11;
		if (resto < 2) {
			cpfCalc += "0";
		}
		
		else {
			cpfCalc += "" +(11-resto);
		}
		
		if(cpfUsuario.equals(cpfCalc)) {
			JOptionPane.showMessageDialog(null, "Válido" );
		}
		else {
			JOptionPane.showMessageDialog(null, "Inválido" );
		}
		
	}

}
