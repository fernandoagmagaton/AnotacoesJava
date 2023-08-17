package br.com.estruturas.atividades;

import java.io.FileWriter;

/**
 * <b> OrdemdeServico </b> <br>
 *  A classe OrdemdeServico cria novos arquivos ou os abre. Insere dados no arquivo <br>
 * e possuem um método chamado gravar. <br>
 * O método gravar pede 2 argumentos, onde: <br>
 * <ol>
 * <li> nome_arquivo: você deve passar o caminho com o nome do arquivo</li>
 * <li> conteudo: você deve passar o que será escrito no arquivo </li>
 * </ol>
 * @author eduardo.csa2
 *
 */
public abstract class OrdemdeServico {
	
	public static String enviar(String nome_arquivo, String conteudo ) {
		String msg = "";
		//Para criar um arquivo, iremos usar a classe FilWriter
		FileWriter arquivo = null;
		
		try {
			arquivo = new FileWriter(nome_arquivo);
			arquivo.write(conteudo);
			
			msg = "O arquivo " +nome_arquivo+ " foi criado e escrito";
		}
		catch(Exception e) {
			System.out.println("Erro ao tratar o arquivo -> " +e.getMessage());
			msg = "Erro ao tratar o arquivo -> " +e.getMessage();
		}
		finally {
			try {arquivo.close();}catch(Exception ex) {ex.printStackTrace();}
		}
		return msg;
	}

}
