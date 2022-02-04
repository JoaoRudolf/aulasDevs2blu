package Classes;

import java.awt.HeadlessException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Util.Conexao;

public class MenuPrincipal {

	public static void main(String[] args) {
		int opcao = 0;
		while (opcao != 9) {
			opcao = telaInicial();

//_________________________READ ALL_________________________________________________________

			if (opcao == 1) {
				lerTodos();
			} // fim do read

//___________FIM DO READ ALL_________________________________________________________________

//_________________________READ BY ID_________________________________________________________

			if (opcao == 2) {
				String codStr = JOptionPane.showInputDialog("Digite o código do aluno: \n");
				int codInte = Integer.parseInt(codStr);
				consultarPorcod(codInte);
				;
			} // fim do read

//___________FIM DO READ ALL_________________________________________________________________

//_______________________CREATE__________________________________________________________

			if (opcao == 3) {
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

				criarAluno(nome, nommae, nompai, Date.valueOf(dataNascimento), media, situacao);
				System.out.println("Cliente " + nome + " criado com sucesso!");
			}
//____________________________FIM DO CREATE________________________________________________________

//_____________________________UPDATE________________________________________||

			if (opcao == 4) {
				String idStr = JOptionPane.showInputDialog("Digite o codigo do aluno: \n");
				int id = Integer.parseInt(idStr);

				String nome = null, nommae = null, nompai = null;
				boolean erro = true;

				while (erro == true) {
					try {
						nome = JOptionPane.showInputDialog("Digite o novo nome do aluno de id " + id + ": \n");
						nommae = JOptionPane.showInputDialog("\"Digite o novo nome da mãe do aluno de id " + id + ": \n");
						nompai = JOptionPane.showInputDialog("\"Digite o novo nome do pai do cliente de id " + id + ": \\n");
						erro = false;
					} catch (HeadlessException e) {
						e.printStackTrace();
						erro = true;
					}
				} // end while
				erro = true;

				chamaUpdate(id, nome, nommae, nompai);

				System.out.println("Cliente de id " + id + " alterado com sucesso!");
			}

// ________________________FIM DO UPDATE_____________________________________||
			
			
//________________DELETE_____________________________________|
			
			if (opcao == 5) {
				String idStr = JOptionPane.showInputDialog("Digite o id do aluno a ser excluído: \n");
				int id = Integer.parseInt(idStr);
				chamaExcluir(id);
			}
			
			

//		String dataNascimento = "2000-02-01";
//		criarAluno("a", "b", "c", Date.valueOf(dataNascimento), 0.0, "d");

		} // FIM DO WHILE DA TELA INICIAL

//		Calendar c = Calendar.getInstance();
//		Date data = c.getTime();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		System.out.println("Data formatada: " + sdf.format(data));

//		Aluno alu = new Aluno();
//		String dataNascimento = "2000-02-01";
//		
//		alu.setDataNasc(Date.valueOf(dataNascimento));
//		// alu.mostrarData();
//		System.out.println("Data de nascimento informada " + dataNascimento);

	} // FIM DO MAIN__________________________

	private static int telaInicial() {
		ArrayList<Integer> opcoes = new ArrayList<>();
		opcoes.add(1);
		opcoes.add(2);
		opcoes.add(3);
		opcoes.add(4);
		opcoes.add(5);
		opcoes.add(9);

		int telaA = 0;
		boolean erro = true;

		while (erro == true) {
			try {
				String s = JOptionPane.showInputDialog("Selecione a opção: \n"
						+ "1 para consultar todos os alunos cadastrados \n" + "2 para consultar um aluno por id \n"
						+ "3 para inserir novo aluno \n" + "4 para atualizar um aluno \n" + "5 para excluir um aluno \n"
						+ "9 para sair do sistema");
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

	static void criarAluno(String nome, String nomMae, String nomPai, Date dataNasc, Double media, String situacao) {
		Aluno aluno = new Aluno();
		aluno.setNomAluno(nome);
		aluno.setNomMae(nomMae);
		aluno.setNomPai(nomPai);
		aluno.setDataNasc(dataNasc);
		aluno.setMedAluno(media);
		aluno.setSitAluno(situacao);
		aluno.salvar();

	}

	static void lerTodos() {
		List<Aluno> listaAluno = new Aluno().consultaTodos();
		System.out.println("Cod   | nome     |    nome mãe   |    nome pai |");

		for (Aluno a : listaAluno) {
			System.out.printf("%d 	%s	 	 %s 	%s	\n", a.getCodAluno(), a.getNomAluno(), a.getNomMae(),
					a.getNomPai());
		}
		System.out.println();

		System.out.println("_______ Fim da Consulta atual_______ \n\n");

	}

	static void consultarPorcod(int id) {
		Aluno a = new Aluno().consultaPeloId(id);
		System.out.println("Cod   | nome     |    nome mãe   |    nome pai |");
		System.out.printf("%d 	%s	 	 %s 	%s	\n", a.getCodAluno(), a.getNomAluno(), a.getNomMae(),
				a.getNomPai());
	}

	static void chamaUpdate(int id, String nomealuno, String nommae, String nompai) {
		Aluno aluno = new Aluno().consultaPeloId(id);
		aluno.update(id, nomealuno, nommae, nompai);
	}
	
	static void chamaExcluir(int id) {
		Aluno aluno = new Aluno();
		if (aluno.excluir(id)) {
			System.out.println("excluído com sucesso");
		}
	}
		
		
		
		
//		contato.setCelular("47 6969-6969");
//		if (new DaoContato().update(contato)) {
//			System.out.println("Alterado com sucesso");

//	
//	static void chamaExcluir(int id) {
//		Aluno aluno = new Aluno();
//		if (aluno.excluir(id)) {
//			System.out.println("excluído com sucesso");
//		}
//	}

	static void testeConexao() {
		if (Conexao.conectar() != null) {
			System.out.println("conectado");
		} else {
			System.out.println("erro ao conectar");
		}
	}

}
