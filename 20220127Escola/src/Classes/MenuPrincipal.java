package Classes;

import java.awt.HeadlessException;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Util.Conexao;

public class MenuPrincipal {

	public static void main(String[] args) {
		int opcao = 0; 
		while (opcao != 9) {
			opcao = telaInicial();
		
//________________CREATE_____________________________________|
			
			if (opcao == 2) {
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
				
				criarAluno(nome, nommae, nompai, Date.valueOf(dataNascimento), media, situacao );
				System.out.println("Cliente " + nome + " criado com sucesso!");
			} 
			//________________FIM DO CREATE_____________________________________||
		
		
		
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
			opcoes.add(9);

			int telaA = 0;
			boolean erro = true;

			while (erro == true) {
				try {
					String s = JOptionPane.showInputDialog("Selecione a opção: \n" + "1 para consultar os alunos \n"
							+ "2 para inserir novo aluno \n" + "3 para atualizar um aluno \n"
							+ "4 para excluir um aluno \n" + "9 para sair do sistema");
					telaA = Integer.parseInt(s);
					System.out.println(telaA);
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
	
	

	private static void criarAluno(String nome, String nomMae, String nomPai, Date dataNasc, Double media, String situacao) {
		Aluno aluno = new Aluno();
		aluno.setNomAluno(nome);
		aluno.setNomMae(nomMae);
		aluno.setNomPai(nomPai);
		aluno.setDataNasc(dataNasc);
		aluno.setMedAluno(media);
		aluno.setSitAluno(situacao);
		aluno.salvar();

	}

//	static void lerTodos() {
//		List<Aluno> listaAluno = new Aluno().consultaTodos();
//
//		for (Aluno c : listaAluno) {
//			System.out.println(c.getId());
//			System.out.println(c.getNome());
//			System.out.println(c.getCpf());
//			System.out.println(c.getEndereco());
//			System.out.println(c.getTelefone());
//			System.out.println();
//		}
//		
//		System.out.println("_______ Fim da Consulta atual_______ \n\n");
//
//	}
//	
//	static Aluno alterarAluno(int id, String nome, String cpf, String endereco, String telefone) {
//		Aluno aluno = new Aluno().consultaPeloId(id);
//		aluno.setNomAluno(nome);
//		aluno.setCpf(cpf);
//		aluno.setEndereco(endereco);
//		aluno.setTelefone(telefone);
//		return aluno;
//	}
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
