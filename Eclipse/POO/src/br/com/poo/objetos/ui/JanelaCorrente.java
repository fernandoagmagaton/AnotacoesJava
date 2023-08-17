package br.com.poo.objetos.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.poo.classes.ContaCorrente;

public class JanelaCorrente extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitularConta;
	private JTextField txtNumeroBanco;
	private JTextField txtNumeroConta;
	private JTextField txtNumeroAgencia;
	private JTextField txtSaldoConta;
	private JTextField txtLimite;
	private ContaCorrente cc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCorrente frame = new JanelaCorrente();
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
	public JanelaCorrente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titular");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel.setBounds(11, 15, 55, 14);
		contentPane.add(lblNewLabel);
		
		txtTitularConta = new JTextField();
		txtTitularConta.setColumns(10);
		txtTitularConta.setBounds(60, 11, 289, 20);
		contentPane.add(txtTitularConta);
		
		JLabel lblBanco = new JLabel("Número do Banco");
		lblBanco.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblBanco.setBounds(359, 14, 113, 14);
		contentPane.add(lblBanco);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.setColumns(10);
		txtNumeroBanco.setBounds(475, 14, 54, 20);
		contentPane.add(txtNumeroBanco);
		
		JLabel lblConta = new JLabel("Número da");
		lblConta.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblConta.setBounds(13, 56, 75, 17);
		contentPane.add(lblConta);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setColumns(10);
		txtNumeroConta.setBounds(96, 65, 145, 20);
		contentPane.add(txtNumeroConta);
		
		JLabel lblNewLabel_1 = new JLabel("conta");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 74, 38, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAgencia = new JLabel("Número da");
		lblAgencia.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblAgencia.setBounds(257, 54, 72, 21);
		contentPane.add(lblAgencia);
		
		JLabel lblNewLabel_2 = new JLabel("agência");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(266, 68, 55, 20);
		contentPane.add(lblNewLabel_2);
		
		txtNumeroAgencia = new JTextField();
		txtNumeroAgencia.setColumns(10);
		txtNumeroAgencia.setBounds(343, 65, 163, 20);
		contentPane.add(txtNumeroAgencia);
		
		txtSaldoConta = new JTextField();
		txtSaldoConta.setColumns(10);
		txtSaldoConta.setBounds(96, 124, 145, 20);
		contentPane.add(txtSaldoConta);
		
		JLabel lblNewLabel_3 = new JLabel("Saldo");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(24, 122, 46, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Limite");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(270, 125, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtLimite = new JTextField();
		txtLimite.setColumns(10);
		txtLimite.setBounds(343, 124, 163, 20);
		contentPane.add(txtLimite);
		
		JButton btnAbrirConta = new JButton("Abrir Conta");
		
		btnAbrirConta.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnAbrirConta.setBounds(62, 168, 163, 38);
		contentPane.add(btnAbrirConta);
		
		JButton btnVerificarSaldo = new JButton("Verificar Saldo");
		
		btnVerificarSaldo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnVerificarSaldo.setBounds(322, 168, 163, 38);
		contentPane.add(btnVerificarSaldo);
		
		JButton btnSacar = new JButton("Sacar");
		
		btnSacar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnSacar.setBounds(324, 235, 161, 38);
		contentPane.add(btnSacar);
		
		JButton btnDepositar = new JButton("Depositar");
		
		btnDepositar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnDepositar.setBounds(63, 235, 163, 38);
		contentPane.add(btnDepositar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(3, 328, 539, 137);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(3, 4, 532, 130);
		txtResultado.setForeground(new Color(0, 64, 64));
		txtResultado.setBackground(Color.WHITE);
		panel.add(txtResultado);
		
		
		btnAbrirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cc = new ContaCorrente();
				String rs = cc.abrirConta(
						Long.parseLong(txtNumeroBanco.getText()),
						Long.parseLong(txtNumeroAgencia.getText()),
						Long.parseLong(txtNumeroConta.getText()),
						txtTitularConta.getText(),
						Double.parseDouble(txtSaldoConta.getText()),
						Double.parseDouble(txtLimite.getText())
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
				txtResultado.setText(String.valueOf(cc.verificarSaldo()));
			}
		});
		
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor do depósito");
				txtResultado.setText(cc.depositar(Double.parseDouble(valor)));
			}
		});
		
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor que deseja sacar");
				txtResultado.setText(cc.sacar(Double.parseDouble(valor)));
			}
		});
		
	}
}
