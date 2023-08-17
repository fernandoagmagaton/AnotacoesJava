package br.com.projeto.papelaria.view;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class CadastroCliente extends JFrame {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtCep;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setBounds(100, 100, 662, 524);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(63, 71, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		textField.setBounds(146, 68, 191, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(378, 71, 27, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(66, 114, 43, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		textField_2.setBounds(146, 111, 191, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefone");
		lblNewLabel_3.setBounds(364, 114, 55, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		textField_3.setBounds(419, 111, 138, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rua", "Avenida", "Alameda", "Viela", "Rodovia", "Estrada", "Praça"}));
		comboBox.setToolTipText("Tipo");
		comboBox.setBounds(146, 353, 159, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo");
		lblNewLabel_4.setBounds(63, 357, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CEP");
		lblNewLabel_5.setBounds(398, 308, 27, 14);
		getContentPane().add(lblNewLabel_5);
		
		txtCep = new JTextField();
		txtCep.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		txtCep.setBounds(425, 305, 86, 20);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 128));
		panel.setBounds(0, 192, 646, 4);
		getContentPane().add(panel);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		textField_4.setBounds(146, 253, 245, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Logradouro");
		lblNewLabel_6.setBounds(66, 256, 76, 14);
		getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		textField_5.setBounds(425, 253, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("N°");
		lblNewLabel_7.setBounds(401, 256, 20, 14);
		getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		textField_6.setBounds(146, 305, 245, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Bairro");
		lblNewLabel_8.setBounds(66, 312, 43, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Complemento");
		lblNewLabel_9.setBounds(315, 357, 90, 14);
		getContentPane().add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		textField_7.setBounds(398, 354, 113, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("DADOS PESSOAIS");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(254, 11, 138, 20);
		getContentPane().add(lblNewLabel_10);
		
		
		//metodo para marcar o formato do texto
		MaskFormatter msf = null;
		try {	msf = new MaskFormatter("###.###.###-##"); }
		catch(Exception e) { e.printStackTrace();}
		
		
		
		JFormattedTextField txtCPF = new JFormattedTextField(msf);
		txtCPF.setBorder(new LineBorder(new Color(128, 0, 128), 1, true));
		txtCPF.setBounds(419, 68, 138, 20);
		getContentPane().add(txtCPF);
		
		JButton btnNewButton = new JButton("GRAVAR");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(279, 435, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("ENDEREÇO");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(278, 218, 90, 24);
		getContentPane().add(lblNewLabel_11);

	}
}
