package br.com.estruturas.arquivos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GerenciarArquivos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeArquivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarArquivos frame = new GerenciarArquivos();
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
	public GerenciarArquivos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GerenciarArquivos.class.getResource("/br/com/estruturas/imagens/1068776.jpg")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeArquivo = new JLabel("Nome do Arquivo");
		lblNomeArquivo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNomeArquivo.setBounds(10, 11, 161, 45);
		contentPane.add(lblNomeArquivo);
		
		JLabel lblConteudo = new JLabel("Conteúdo");
		lblConteudo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblConteudo.setBounds(10, 67, 161, 45);
		contentPane.add(lblConteudo);
		
		txtNomeArquivo = new JTextField();
		txtNomeArquivo.setBounds(142, 19, 238, 29);
		contentPane.add(txtNomeArquivo);
		txtNomeArquivo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 123, 418, 187);
		contentPane.add(scrollPane);
		
		JTextArea txtConteudo = new JTextArea();
		scrollPane.setViewportView(txtConteudo);
		
		JButton btnGravar = new JButton("Gerar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtNomeArquivo.getText().trim().equals("") ||
						txtConteudo.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Você deve preencher os campos");
				}
				 String s = GerarArquivo.gravar(txtNomeArquivo.getText(), txtConteudo.getText());
				 JOptionPane.showMessageDialog(null, s);
			}
		});
		btnGravar.setBounds(175, 321, 89, 23);
		contentPane.add(btnGravar);
		
		JComboBox cboCidades = new JComboBox();
		cboCidades.setModel(new DefaultComboBoxModel(new String[] {"São Paulo", "Guarulhos", "Osasco", "Florianópolis", "Rio de Janeiro", "Leme", "Campinas", "Palmas", "Natal", "Porto Seguro"}));
		cboCidades.setBounds(141, 81, 239, 24);
		contentPane.add(cboCidades);
		setLocationRelativeTo(null);//centraliza a janela (o null como não é direcionamento nenhum centraliza com a tela)
	}
}
