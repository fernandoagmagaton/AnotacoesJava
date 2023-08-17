package br.com.poo.objetos.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GerenciarContas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarContas frame = new GerenciarContas();
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
	public GerenciarContas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 653, 22);
		contentPane.add(menuBar);
		
		JMenu mnuAbertura = new JMenu("Abertura de Conta");
		menuBar.add(mnuAbertura);
		
		JMenuItem mniCorrente = new JMenuItem("Conta Corrente");
		mnuAbertura.add(mniCorrente);
		
		JMenuItem mniPoupança = new JMenuItem("Conta Poupança");
		mnuAbertura.add(mniPoupança);
		
		JLabel lblNewLabel = new JLabel("BANCASÃO");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 50));
		lblNewLabel.setBounds(193, 25, 266, 81);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GerenciarContas.class.getResource("/br/com/poo/imagens/din.png")));
		lblNewLabel_1.setBounds(184, 124, 284, 251);
		contentPane.add(lblNewLabel_1);
	}
}
