package view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import model.DAO;
import utils.Validador;

public class Agenda extends JFrame {
	// Instanciar objetos JDBC
	DAO dao = new DAO();
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtFone;
	private JLabel lblNewLabel_3;
	private JTextField txtEmail;
	private JButton btnEditar;
	private JButton btnDeletar;
	private JButton btnLimpar;
	private JButton btnPesquisar;
	private JButton btnSobre;
	private JButton lblStatus;
	private JButton btnAdicionar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// ativação da janela
				status();
			}
		});
		setResizable(false);
		setTitle("Agenda de Contatos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agenda.class.getResource("/img/note.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.control);
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(UIManager.getBorder("Button.border"));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(31, 20, 53, 22);
		contentPane.add(lblNewLabel);

		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(140, 21, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(31, 59, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtNome = new JTextField();
		txtNome.setBounds(140, 56, 130, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		//uso do Validador para limitar o numero de caracteres
		txtNome.setDocument(new Validador(50));

		JLabel lblNewLabel_2 = new JLabel("Fone");
		lblNewLabel_2.setBounds(31, 93, 46, 14);
		contentPane.add(lblNewLabel_2);

		txtFone = new JTextField();
		txtFone.setBounds(140, 90, 130, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		txtFone.setDocument(new Validador(15));

		lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(31, 131, 46, 14);
		contentPane.add(lblNewLabel_3);

		txtEmail = new JTextField();
		txtEmail.setBounds(140, 128, 170, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		txtEmail.setDocument(new Validador(50));

		btnAdicionar = new JButton("");
		btnAdicionar.setEnabled(false);
		btnAdicionar.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnAdicionar.setContentAreaFilled(false);
		btnAdicionar.setToolTipText("Adicionar contato");
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setIcon(new ImageIcon(Agenda.class.getResource("/img/adicionar.png")));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			adicionar();
			}
		});
		btnAdicionar.setBounds(25, 172, 64, 64);
		contentPane.add(btnAdicionar);

		btnEditar = new JButton("");
		btnEditar.setEnabled(false);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarContato ();
			}
		});
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.setBorderPainted(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setToolTipText("Editar");
		btnEditar.setIcon(new ImageIcon(Agenda.class.getResource("/img/edit.png")));
		btnEditar.setBounds(105, 172, 64, 64);
		contentPane.add(btnEditar);

		btnDeletar = new JButton("");
		btnDeletar.setEnabled(false);
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletarContato();
			}
		});
		btnDeletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeletar.setBorderPainted(false);
		btnDeletar.setContentAreaFilled(false);
		btnDeletar.setIcon(new ImageIcon(Agenda.class.getResource("/img/deletar.png")));
		btnDeletar.setToolTipText("Deletar contato");
		btnDeletar.setBounds(178, 172, 64, 64);
		contentPane.add(btnDeletar);

		btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setIcon(new ImageIcon(Agenda.class.getResource("/img/eraser.png")));
		btnLimpar.setToolTipText("Limpar campos");
		btnLimpar.setBounds(252, 176, 64, 64);
		contentPane.add(btnLimpar);

		btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no botão
				buscar();
			}
		});
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setIcon(new ImageIcon(Agenda.class.getResource("/img/pesquisar.png")));
		btnPesquisar.setBounds(280, 51, 35, 33);
		contentPane.add(btnPesquisar);

		lblStatus = new JButton("");
		lblStatus.setContentAreaFilled(false);
		lblStatus.setBorderPainted(false);
		lblStatus.setIcon(new ImageIcon(Agenda.class.getResource("/img/databaseoff.png")));
		lblStatus.setBounds(377, 208, 48, 48);
		contentPane.add(lblStatus);

		btnSobre = new JButton("");
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//clicar no botão sobre
			//mostrar a janela sobre
			Sobre sobre = new Sobre ();
			sobre.setVisible(true);
			}
		});
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBorderPainted(false);
		btnSobre.setContentAreaFilled(false);
		btnSobre.setIcon(new ImageIcon(Agenda.class.getResource("/img/about.png")));
		btnSobre.setBounds(377, 20, 24, 24);
		contentPane.add(btnSobre);
		
		//substituir o click pela tecla <ENTER> em um botão
		getRootPane().setDefaultButton(btnPesquisar);
		
	} // FIM DO CONSTRUTOR

	/**
	 * Método responsável por limpar os campos
	 */
	private void limparCampos() {
		txtID.setText(null);
		txtNome.setText(null);
		txtFone.setText(null);
		txtEmail.setText(null);
		btnAdicionar.setEnabled(false);
		btnEditar.setEnabled(false);
		btnDeletar.setEnabled(false);
	}// fim do método limparcampos()

	/**
	 * Método responsável por exibir o status da conexão
	 */
	private void status() {
		try {
			// abrir a conexão
			con = dao.conectar();
			if (con == null) {
				// System.out.println("Erro de conexão");
				lblStatus.setIcon(new ImageIcon(Agenda.class.getResource("/img/databaseoff.png")));
			} else {
				// System.out.println("Banco conectado");
				lblStatus.setIcon(new ImageIcon(Agenda.class.getResource("/img/databaseon.png")));
			}

			// NUNCA esquecer de fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}
	}// fim do método status da conexão()

	/**
	 * Método para buscar um contato pelo nome
	 */
	private void buscar() {
		// dica - testar o evento primeiro
		// System.out.println("teste do botão buscar");
		// criar uma variavel com a query (instrução do banco)
		String read = "select * from contatos where nome = ? ";
		// tratamento de excessões
		try {
			con = dao.conectar();
			// preparar a execução da query (instrução sql - CRUD read)
			// o parametro 1 substitui a ? pelo conteudo da caixa de texto
			pst = con.prepareStatement(read);
			pst.setString(1, txtNome.getText());
			// executar a query e buscar o resultado
			rs = pst.executeQuery();
			// uso da estrutura if else para verificar se existe o contato
			// rs.next() -> se existir um contato no banco
			if (rs.next()) {
				// preencher as caixas de texto com as informações

				txtID.setText(rs.getString(1)); // 1º campo da tabela
				txtFone.setText(rs.getString(3)); // 3º campo da tabela
				txtEmail.setText(rs.getString(4)); // 4º campo da tabela
				//validação (liberação dos botões alterar e excluir)
				btnEditar.setEnabled(true);
				btnDeletar.setEnabled(true);
			} else {
				// se nao existir um contato no banco
				JOptionPane.showMessageDialog(null, "Contato inexistente");
				//validação (liberação do botão adicionar
				btnAdicionar.setEnabled(true);
			}
			//fechar conexão (IMPORTANTE)
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}// fim do método buscar
	/**
	 * método para adicionar um novo contato
	 */
		private void adicionar() {
			//System.out.println("teste");
			//validação de campos obrigatórios
			if(txtNome.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha o nome do contato");
				txtNome.requestFocus();
			} else if (txtFone.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha o fone do contato");
				txtFone.requestFocus();
			} else {
				//lógica principal
				//CRUD
				String create =  "insert into contatos(nome,fone,email) values (? ,? ,?)";
				//tratamento de exceções
				try {
					//abrir a conexão
					con = dao.conectar();
					//preparar a execução da query )instrução sql - CRUD read)
					pst = con.prepareStatement(create);
					pst.setString(1, txtNome.getText());
					pst.setString(2, txtFone.getText());
					pst.setString(3, txtEmail.getText());
					//executa a query(instrução sql CRUD -Create)
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Contato Adicionado" );
					//limpar campos
					limparCampos();
					//fechar a conexão
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
		} //fim do método adicionar
		
		/**
		 * Método para editar um contato (ATENÇÃO!)
		 */
		private void editarContato() {
			//System.out.println("teste do botão editar");
			//validação dos campos obrigatórios
			if (txtNome.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite o nome do contato");
				txtNome.requestFocus();
				
			} else if (txtFone.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite o fone do contato");
				txtFone.requestFocus();
			} else {
				//lógica principal
				//CRUD - Update
				String update = "update contatos set nome=?, fone=?, email=? where id=?";
				try {
					//abrir a conexão
					con = dao.conectar();
					//preparar a query (instrução sql)
					pst = con.prepareStatement(update);
					pst.setString(1, txtNome.getText());
					pst.setString(2, txtFone.getText());
					pst.setString(3, txtEmail.getText());
					pst.setString(4, txtID.getText());
					//executar a query
					pst.executeUpdate ();
					//confirmar para o usuário
					JOptionPane.showMessageDialog(null, "Dados do contato editados com sucesso.");
					//limpar os campos
					limparCampos();
					//fechar a conexão
					con.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} // fim do método editar contato
		
		/**
		 * Método usado para excluir um contato
		 */
		private void deletarContato() {
			//System.out.println("teste do botão deletar");
			//validação de exclusão
			int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exclusão desde contato?" , "Atenção!" , JOptionPane.YES_NO_OPTION);
			if (confirma == JOptionPane.YES_OPTION) {
				//CRUD - Delete
				String delete = "delete from contatos where id=?";
				//tratamento de exceções
				try {
					//abrir a conexão
					con = dao.conectar();
					//preparar a query (instrução sql)
					pst = con.prepareStatement(delete);
					//substituir a ? pelo id do contato
					pst.setString(1, txtID.getText());
					//executar a query
					pst.executeUpdate();
					//limpar campos
					limparCampos();
					//exibir uma mensagem ao usuário
					JOptionPane.showMessageDialog(null, "Contato excluído");
					//fechar a conexão
					con.close();
					
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
		}//fim do método excluir contato
}
// FIM DO CODIGO
