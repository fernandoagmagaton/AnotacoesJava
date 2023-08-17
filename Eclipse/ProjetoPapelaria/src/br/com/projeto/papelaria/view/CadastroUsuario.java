package br.com.projeto.papelaria.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.com.projeto.papelaria.dao.DAOusuario;
import br.com.projeto.papelaria.dominio.Usuario;



public class CadastroUsuario extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtNome;
	
	DAOusuario dao = new DAOusuario();
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private JPasswordField txtSenha;



	/**
	 * Launch the application.
	 */
	
	public CadastroUsuario() {
		setTitle("Cadastro de Usuario");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Usuario");
		lblNewLabel.setBounds(44, 26, 103, 14);
		getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(165, 23, 207, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(44, 81, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nivel de Acesso");
		lblNewLabel_2.setBounds(44, 135, 92, 14);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox cboNivel = new JComboBox();
		cboNivel.setBorder(new LineBorder(new Color(81, 0, 81), 2, true));
		cboNivel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cboNivel.setModel(new DefaultComboBoxModel(new String[] {"Admin", "User", "Operator", "Sales"}));
		cboNivel.setBounds(165, 131, 207, 22);
		getContentPane().add(cboNivel);
		
		JButton btnGravar = new JButton("GRAVAR");
		btnGravar.setBorder(new LineBorder(new Color(81, 0, 81), 2, true));
		btnGravar.setBackground(new Color(255, 255, 255));
		btnGravar.setContentAreaFilled(false);
		btnGravar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnGravar.setBounds(165, 210, 89, 23);
		getContentPane().add(btnGravar);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(165, 78, 207, 20);
		getContentPane().add(txtSenha);
		
		
		// FUNÇÃO GRAVAR
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o login");
					txtSenha.requestFocus();
				} else if (txtSenha.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha a senha");
					txtSenha.requestFocus();
				} else {
				
				Usuario us = new Usuario();
				us.setNomeUsuario(txtNome.getText());
				us.setSenha(txtSenha.getText());
				us.setNivelAcesso(cboNivel.getSelectedItem().toString());
				DAOusuario du = new DAOusuario();
				JOptionPane.showMessageDialog(null,du.cadastro(us));
				}
				
			}
			
		});

	}// fim do construtor
}// fim do codigo
