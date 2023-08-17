package br.com.estruturas.atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrdemdeServicoPainel extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtFone;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdemdeServicoPainel frame = new OrdemdeServicoPainel();
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
	public OrdemdeServicoPainel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome do cliente:");
		lblNewLabel.setBounds(20, 27, 147, 25);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("E - mail:");
		lblNewLabel_1.setBounds(20, 56, 80, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Telefone para contato:");
		lblNewLabel_2.setBounds(20, 81, 187, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Equipamento a ser consertado:");
		lblNewLabel_3.setBounds(20, 135, 198, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Descrever os problemas diagnosticados:");
		lblNewLabel_4.setBounds(20, 193, 279, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Solução para o equipamento:");
		lblNewLabel_5.setBounds(20, 265, 224, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Data de ENTRADA do produto:");
		lblNewLabel_6.setBounds(20, 355, 187, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Data a RETIRAR o produto:");
		lblNewLabel_7.setBounds(20, 388, 198, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Valor do serviço:");
		lblNewLabel_8.setBounds(20, 442, 136, 14);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Funcionário responsável pelo produto: ");
		lblNewLabel_9.setBounds(140, 482, 224, 14);
		contentPane.add(lblNewLabel_9);

		txtNome = new JTextField();
		txtNome.setBounds(164, 29, 455, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(164, 53, 455, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		txtFone = new JTextField();
		txtFone.setBounds(164, 78, 455, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);

		JComboBox cboEquipamento = new JComboBox();
		cboEquipamento.setModel(
				new DefaultComboBoxModel(new String[] { "Desktop", "Notebook", "Tablet", "Celular", "Monitor" }));
		cboEquipamento.setBounds(20, 160, 198, 22);
		contentPane.add(cboEquipamento);

		JComboBox cboAnoentrada = new JComboBox();
		cboAnoentrada.setModel(new DefaultComboBoxModel(new String[] { "2023", "2024" }));
		cboAnoentrada.setBounds(370, 347, 61, 22);
		contentPane.add(cboAnoentrada);

		JComboBox cboDiaentrada = new JComboBox();
		cboDiaentrada.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		cboDiaentrada.setBounds(248, 347, 51, 22);
		contentPane.add(cboDiaentrada);

		JComboBox cboMesentrada = new JComboBox();
		cboMesentrada.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		cboMesentrada.setBounds(309, 347, 51, 22);
		contentPane.add(cboMesentrada);

		JComboBox cboDiaretirar = new JComboBox();
		cboDiaretirar.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		cboDiaretirar.setBounds(248, 380, 51, 22);
		contentPane.add(cboDiaretirar);

		JComboBox cboMesretirar = new JComboBox();
		cboMesretirar.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		cboMesretirar.setBounds(309, 380, 51, 22);
		contentPane.add(cboMesretirar);

		JComboBox cboAnoretirar = new JComboBox();
		cboAnoretirar.setModel(new DefaultComboBoxModel(new String[] { "2023", "2024" }));
		cboAnoretirar.setBounds(370, 380, 62, 22);
		contentPane.add(cboAnoretirar);

		txtValor = new JTextField();
		txtValor.setBounds(126, 439, 108, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		JComboBox cboFuncionario = new JComboBox();
		cboFuncionario
				.setModel(new DefaultComboBoxModel(new String[] { "Abílio", "Afonso", "Maricas Mário", "Fausto" }));
		cboFuncionario.setBounds(374, 478, 117, 22);
		contentPane.add(cboFuncionario);

		JTextArea txtProblemas = new JTextArea();
		txtProblemas.setLineWrap(true);
		txtProblemas.setBounds(20, 209, 599, 54);
		contentPane.add(txtProblemas);

		JTextArea txtSolucao = new JTextArea();
		txtSolucao.setLineWrap(true);
		txtSolucao.setBounds(20, 281, 597, 57);
		contentPane.add(txtSolucao);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNome.getText().trim().equals("") || txtEmail.getText().trim().equals("")
						|| txtFone.getText().trim().equals("") || txtProblemas.getText().trim().equals("")
						|| txtSolucao.getText().trim().equals("") || txtValor.getText().trim().equals("")

				) {
					JOptionPane.showMessageDialog(null, "Você deve preencher os campos");
				}
				String j = txtNome.getText() + " - " + txtEmail.getText() + " - " + txtFone.getText()
						+ cboEquipamento.getSelectedItem() + " - " + " - " + txtProblemas.getText() + " - "
						+ txtSolucao.getText() + " - " + txtValor.getText() + " - " + cboDiaentrada.getSelectedItem()
						+ " / " + cboMesentrada.getSelectedItem() + " / " + cboAnoentrada.getSelectedItem() + " / "
						+ cboFuncionario.getSelectedItem() + " - " + cboDiaretirar.getSelectedItem() + " / "
						+ cboMesretirar.getSelectedItem() + " / " + cboAnoretirar.getSelectedItem() + " / ";
				String h = txtNome.getText() + txtFone.getText() + " .txt";
				String s = OrdemdeServico.enviar("C:/users/" +h, j);
				JOptionPane.showMessageDialog(null, s);

			}
		});
		btnEnviar.setBounds(541, 478, 89, 23);
		contentPane.add(btnEnviar);
	}
}
