package br.com.poo.objetos;

import javax.swing.JOptionPane;

import br.com.poo.classes.Cliente;

public class UsarCliente {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setIdCliente(10);
		cli.setNomeCliente("Eusébio");
		cli.setEmailCliente("galinha@gmail.com");
		cli.setIdadeCliente(69);
		cli.setCpfCliente("666420777-13");
		
		
		String retorno = cli.cadastro();
		JOptionPane.showMessageDialog(null, retorno);
	}

}
