package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;

public class CalculadoraServico extends JFrame {

	// variáveis
	double remuneracao, custo, valor, total;
	int cargaHoraria, estimativa;

	/**
	 * 
	 */

	private JPanel contentPane;
	private JTextField txtRemuneracao;
	private JTextField txtCusto;
	private JTextField txtCargaHoraria;
	private JTextField txtEstimativa;
	private JLabel lblValor;
	private JLabel lblTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraServico frame = new CalculadoraServico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculadoraServico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraServico.class.getResource("/img/din.png")));
		setTitle("Calculadora de Serviços de TI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 472);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.scrollbar);
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Remuneração mensal pretendida");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel.setBounds(29, 31, 181, 17);
		contentPane.add(lblNewLabel);

		txtRemuneracao = new JTextField();
		txtRemuneracao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				String caracteres = "0123456789.";

				if (!caracteres.contains(e.getKeyChar() + "")) {

					e.consume();
				}
			}
		});
		txtRemuneracao.setBounds(272, 28, 157, 20);
		contentPane.add(txtRemuneracao);
		txtRemuneracao.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Custo operacional mensal");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(29, 86, 157, 17);
		contentPane.add(lblNewLabel_1);

		txtCusto = new JTextField();
		txtCusto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				String caracteres = "0123456789.";

				if (!caracteres.contains(e.getKeyChar() + "")) {

					e.consume();
				}
			}
		});
		txtCusto.setBounds(272, 83, 157, 20);
		contentPane.add(txtCusto);
		txtCusto.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Carga horária mensal de trabalho");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(29, 140, 181, 17);
		contentPane.add(lblNewLabel_2);

		txtCargaHoraria = new JTextField();
		txtCargaHoraria.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				String caracteres = "0123456789";

				if (!caracteres.contains(e.getKeyChar() + "")) {

					e.consume();
				}
			}
		});
		txtCargaHoraria.setBounds(272, 139, 157, 20);
		contentPane.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setBorder(new LineBorder(new Color(153, 0, 153), 2, true));
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(272, 208, 107, 38);
		contentPane.add(btnLimpar);

		JLabel lblNewLabel_3 = new JLabel("Valor da hora:");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(29, 291, 81, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Estimativa de horas de serviço");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(29, 345, 168, 14);
		contentPane.add(lblNewLabel_4);

		txtEstimativa = new JTextField();
		txtEstimativa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				String caracteres = "0123456789";

				if (!caracteres.contains(e.getKeyChar() + "")) {

					e.consume();
				}
			}
		});
		txtEstimativa.setBounds(225, 343, 86, 20);
		contentPane.add(txtEstimativa);
		txtEstimativa.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Total a ser cobrado do cliente:");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(29, 393, 168, 14);
		contentPane.add(lblNewLabel_5);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setBorder(new LineBorder(new Color(153, 0, 153), 2, true));
		btnCalcular.setContentAreaFilled(false);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(98, 208, 107, 38);
		contentPane.add(btnCalcular);

		lblValor = new JLabel("");
		lblValor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				String caracteres = "0123456789.";

				if (!caracteres.contains(e.getKeyChar() + "")) {

					e.consume();
				}
			}
		});
		lblValor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblValor.setBounds(131, 291, 67, 14);
		contentPane.add(lblValor);

		lblTotal = new JLabel("");
		lblTotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				String caracteres = "0123456789.";

				if (!caracteres.contains(e.getKeyChar() + "")) {

					e.consume();
				}
			}
		});

		lblTotal = new JLabel("");
		lblTotal.setBounds(225, 389, 86, 19);

		contentPane.add(lblTotal);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(153, 0, 204), 2, true));
		panel.setBounds(334, 343, 128, 33);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnTotal = new JButton("Calcular Total");
		btnTotal.setBorderPainted(false);
		btnTotal.setBounds(8, 6, 112, 23);
		panel.add(btnTotal);
		btnTotal.setContentAreaFilled(false);
		btnTotal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total();
			}
		});
	}

	private void calcular() {

		if (txtRemuneracao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a remuneração mensal pretendida");
			txtRemuneracao.requestFocus();
		} else if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o custo oepracional mensal");
			txtCusto.requestFocus();
		} else if (txtCargaHoraria.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a carha horária mensal de trabalho");
			txtCargaHoraria.requestFocus();
		} else {

			remuneracao = Double.parseDouble(txtRemuneracao.getText());
			custo = Double.parseDouble(txtCusto.getText());
			cargaHoraria = Integer.parseInt(txtCargaHoraria.getText());

			valor = (remuneracao + (0.3 * remuneracao) + (0.2 * remuneracao) + custo) / cargaHoraria;

			lblValor.setText("R$" + valor);

			DecimalFormat formatador = new DecimalFormat("#0.00");
			lblValor.setText("R$ " + formatador.format(valor));

		}
	}

	private void limpar() {
		txtRemuneracao.setText(null);
		txtCusto.setText(null);
		txtCargaHoraria.setText(null);
		txtEstimativa.setText(null);
		lblValor.setText(null);
		lblTotal.setText(null);

	}

	private void total() {

		if (txtEstimativa.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a estimativa de horas");
			txtEstimativa.requestFocus();
		} else {
			estimativa = Integer.parseInt(txtEstimativa.getText());
			total = valor * estimativa;

			lblTotal.setText("R$" + total);

			DecimalFormat formatador = new DecimalFormat("#0.00");
			lblTotal.setText("R$ " + formatador.format(total));
		}
	}
}
