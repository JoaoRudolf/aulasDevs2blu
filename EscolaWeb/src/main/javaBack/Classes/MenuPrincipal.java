package Classes;

import java.awt.HeadlessException;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Util.Conexao;
import telas.TelaAluno;
import telas.TelaDisciplina;

public class MenuPrincipal {

	public static void main(String[] args) {
		int opcao = 0;
		while (opcao != 9) {
			opcao = telaInicial();

			if (opcao == 1) { // READ ALUNOS
				TelaAluno.lerTodosAluno();
			} 
			
			if (opcao == 2) { // READ BY ID ALUNOS
				String codStr = JOptionPane.showInputDialog("Digite o código do aluno: \n");
				int codInte = Integer.parseInt(codStr);
				TelaAluno.consultarPorcod(codInte);
			} 

			if (opcao == 3) { // CREATE ALUNO
				String nome = null, nommae = null, nompai = null, dataNascimento = null;
				Double media = 0.0;
				String situacao = "C";
				boolean erro = true;

				while (erro == true) {
					try {
						nome = JOptionPane.showInputDialog("Digite o nome do aluno: \n");
						nommae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno): \n");
						nompai = JOptionPane.showInputDialog("Digite o nome do pai do aluno: \n");
						dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento (yyyy-MM-DD: \n");
						erro = false;
					} catch (HeadlessException e) {
						e.printStackTrace();
						erro = true;
					}
				} // end while
				erro = true;
				TelaAluno.criarAluno(nome, nommae, nompai, Date.valueOf(dataNascimento), media, situacao);
			}

			if (opcao == 4) { // UPDATE ALUNO
				String idStr = JOptionPane.showInputDialog("Digite o codigo do aluno: \n");
				int id = Integer.parseInt(idStr);

				String nome = null, nommae = null, nompai = null;
				boolean erro = true;

				while (erro == true) {
					try {
						nome = JOptionPane.showInputDialog("Digite o novo nome do aluno de id " + id + ": \n");
						nommae = JOptionPane
								.showInputDialog("\"Digite o novo nome da mãe do aluno de id " + id + ": \n");
						nompai = JOptionPane
								.showInputDialog("\"Digite o novo nome do pai do cliente de id " + id + ": \\n");
						erro = false;
					} catch (HeadlessException e) {
						e.printStackTrace();
						erro = true;
					}
				} // end while
				erro = true;

				TelaAluno.chamaUpdate(id, nome, nommae, nompai);

			}

			if (opcao == 5) { // DELETE ALUNO
				String idStr = JOptionPane.showInputDialog("Digite o id do aluno a ser excluído: \n");
				int id = Integer.parseInt(idStr);
				TelaAluno.chamaExcluir(id);
			}

			if (opcao == 6) {  // READ DISCIPLINA
				TelaDisciplina.lerTodasDisciplinas();
				
			} 
			
			if (opcao == 7) { // READ BY ID DISCIPLINA
				String codStr = JOptionPane.showInputDialog("Digite o código da disciplina: \n");
				int codInte = Integer.parseInt(codStr);
				TelaDisciplina.consultarPorcod(codInte);
			} 
			
			if (opcao == 8) { // CREATE DISCIPLINA
				String nomeDisc = null, nomProf = null;
				int qtdAv = 0;
				
				boolean erro = true;

				while (erro == true) {
					try {
						nomeDisc = JOptionPane.showInputDialog("Digite o nome da disciplina: \n");
						nomProf = JOptionPane.showInputDialog("Digite o nome do professor): \n");
						qtdAv = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de avaliações: \n"));
						erro = false;
					} catch (HeadlessException e) {
						e.printStackTrace();
						erro = true;
					}
				} // end while
				erro = true;
				TelaDisciplina.criarDisciplina(nomeDisc, nomProf, qtdAv);;
			}
			

		} // FIM DO WHILE DA TELA INICIAL


	} // FIM DO MAIN



	private static int telaInicial() {
		ArrayList<Integer> opcoes = new ArrayList<>();
		opcoes.add(1);
		opcoes.add(2);
		opcoes.add(3);
		opcoes.add(4);
		opcoes.add(5);
		opcoes.add(6);
		opcoes.add(7);
		opcoes.add(8);
		opcoes.add(9);

		int telaA = 0;
		boolean erro = true;

		while (erro == true) {
			try {
				String s = JOptionPane.showInputDialog("Selecione a opção: \n"
						+ "1 para consultar todos os alunos cadastrados \n" + "2 para consultar um aluno por id \n"
						+ "3 para inserir novo aluno \n" + "4 para atualizar um aluno \n" + "5 para excluir um aluno \n"
						+ "6 para consultar todas as disciplinas \n"
						+ "7 para conultar disciplina por código \n 8 para inserir nova disciplina" + "9 para sair do sistema");
				telaA = Integer.parseInt(s);
				if (opcoes.contains(telaA)) {
					erro = false;
				}
			} catch (HeadlessException e) {
				e.printStackTrace();
				erro = true;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				erro = true;
			}
		} // end while
		erro = true;
		return telaA;

	} // fim tela inicial


	static void testeConexao() {
		if (Conexao.conectar() != null) {
			System.out.println("conectado");
		} else {
			System.out.println("erro ao conectar");
		}
	}

}
