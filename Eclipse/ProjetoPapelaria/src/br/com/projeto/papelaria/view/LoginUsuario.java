package br.com.projeto.papelaria.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import br.com.projeto.papelaria.dao.DAOusuario;
import br.com.projeto.papelaria.dominio.Usuario;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUsuario extends JFrame {
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUsuario frame = new LoginUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginUsuario() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(42, 46, 103, 14);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(42, 101, 46, 14);
		getContentPane().add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(163, 43, 207, 20);
		getContentPane().add(txtLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(163, 98, 207, 20);
		getContentPane().add(txtSenha);
		
		JButton btnLogar = new JButton("Logar");
		
		btnLogar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogar.setBorder(new LineBorder(new Color(81, 0, 81), 2, true));
		btnLogar.setContentAreaFilled(false);
		btnLogar.setBounds(163, 165, 89, 23);
		getContentPane().add(btnLogar);
		
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario us = new Usuario();
				us.setNomeUsuario(txtLogin.getText());
				us.setSenha(txtSenha.getText());
				DAOusuario du = new DAOusuario();
				if(du.Logar(us)) {
					Principal p = new Principal();
					p.setState(MAXIMIZED_BOTH);
					p.setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto");
				}
			}
		});

	}

}
