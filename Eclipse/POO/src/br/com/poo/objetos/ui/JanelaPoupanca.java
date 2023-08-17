package br.com.poo.objetos.ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.poo.classes.ContaPoupanca;
import javax.swing.JTextArea;

public class JanelaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitularConta;
	private JTextField txtNumeroConta;
	private JTextField txtNumeroBanco;
	private JTextField txtNumeroAgencia;
	private JTextField txtSaldoConta;
	private JTextField txtAniversario;
	private ContaPoupanca cp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPoupanca frame = new JanelaPoupanca();
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
	public JanelaPoupanca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 503);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConta = new JLabel("Número da");
		lblConta.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblConta.setBounds(10, 71, 75, 17);
		contentPane.add(lblConta);
		
		JLabel lblBanco = new JLabel("Número do Banco");
		lblBanco.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblBanco.setBounds(370, 29, 113, 14);
		contentPane.add(lblBanco);
		
		JLabel lblAgencia = new JLabel("Número da");
		lblAgencia.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblAgencia.setBounds(279, 67, 72, 21);
		contentPane.add(lblAgencia);
		
		JLabel lblNewLabel = new JLabel("Titular");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 30, 55, 14);
		contentPane.add(lblNewLabel);
		
		txtTitularConta = new JTextField();
		txtTitularConta.setBounds(57, 26, 289, 20);
		contentPane.add(txtTitularConta);
		txtTitularConta.setColumns(10);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setBounds(96, 80, 145, 20);
		contentPane.add(txtNumeroConta);
		txtNumeroConta.setColumns(10);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setBounds(493, 26, 54, 20);
		contentPane.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("conta");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(24, 89, 38, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("agência");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(290, 83, 55, 20);
		contentPane.add(lblNewLabel_2);
		
		txtNumeroAgencia = new JTextField();
		txtNumeroAgencia.setBounds(370, 80, 163, 20);
		contentPane.add(txtNumeroAgencia);
		txtNumeroAgencia.setColumns(10);
		
		JButton btnAbrirConta = new JButton("Abrir Conta");
		
		btnAbrirConta.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnAbrirConta.setBounds(62, 183, 163, 38);
		contentPane.add(btnAbrirConta);
		
		JButton btnVerificarSaldo = new JButton("Verificar Saldo");
	
		btnVerificarSaldo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnVerificarSaldo.setBounds(322, 183, 163, 38);
		contentPane.add(btnVerificarSaldo);
		
		JButton btnDepositar = new JButton("Depositar");
		
		btnDepositar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnDepositar.setBounds(63, 250, 163, 38);
		contentPane.add(btnDepositar);
		
		JButton btnSacar = new JButton("Sacar");
		
		btnSacar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnSacar.setBounds(324, 250, 161, 38);
		contentPane.add(btnSacar);
		
		JLabel lblNewLabel_3 = new JLabel("Saldo");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(19, 137, 46, 21);
		contentPane.add(lblNewLabel_3);
		
		txtSaldoConta = new JTextField();
		txtSaldoConta.setBounds(96, 139, 145, 20);
		contentPane.add(txtSaldoConta);
		txtSaldoConta.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Aniversário");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(279, 140, 72, 14);
		contentPane.add(lblNewLabel_4);
		
		txtAniversario = new JTextField();
		txtAniversario.setBounds(370, 139, 163, 20);
		contentPane.add(txtAniversario);
		txtAniversario.setColumns(10);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(11, 328, 537, 137);
		contentPane.add(txtResultado);
		
		btnAbrirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp = new ContaPoupanca();
				String rs = cp.abrirConta(
						Long.parseLong(txtNumeroBanco.getText()),
						Long.parseLong(txtNumeroAgencia.getText()),
						Long.parseLong(txtNumeroConta.getText()),
						txtTitularConta.getText(),
						Double.parseDouble(txtSaldoConta.getText())
						);
				txtResultado.setText(rs);
				txtNumeroBanco.setEnabled(false);
				txtNumeroAgencia.setEnabled(false);
				txtNumeroConta.setEnabled(false);
				txtTitularConta.setEnabled(false);
				txtSaldoConta.setEnabled(false);
				btnAbrirConta.setEnabled(false);
				
			}
		});
		
		btnVerificarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(String.valueOf(cp.verificarSaldo()));
				
				
			}
		});
		
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor do depósito");
				txtResultado.setText(cp.depositar(Double.parseDouble(valor)));
			}
		});
		
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor que deseja sacar");
				txtResultado.setText(cp.sacar(Double.parseDouble(valor)));
			}
		});
	}
}
