package principal;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Cliente;
import utils.Conexao;

public class Principal {

	public static void main(String[] args) {
//		boolean erro = true;

//		ArrayList<Integer> opcoes = new ArrayList<>();
//		opcoes.add(1);
//		opcoes.add(2);
//		opcoes.add(3);
//		opcoes.add(4);

		int opcao = 0; 
		while (opcao != 9) {
			opcao = telaInicial();
			
			if (opcao == 1) {
				lerTodos();
			} // fim do read
			
			if (opcao == 2) {
				String nome = null, cpf = null, endereco = null, telefone = null;
				boolean erro = true;

				while (erro == true) {
					try {
						nome = JOptionPane.showInputDialog("Digite o nome do cliente: \n");
						cpf = JOptionPane.showInputDialog("Digite o cpf do cliente(somente os n�meros): \n");
						endereco = JOptionPane.showInputDialog("Digite o endereco do cliente: \n");
						telefone = JOptionPane.showInputDialog("Digite o telefone do cliente: \n");
						erro = false;
					} catch (HeadlessException e) {
						e.printStackTrace();
						erro = true;
					}
				} // end while
				erro = true;
				criarCliente(nome, cpf, endereco, telefone);
				System.out.println("Cliente " + nome + " criado com sucesso!");
			} // fim do create
		}

//		while (erro == true) {
//			try {
//				String s = JOptionPane.showInputDialog(
//						"Selecione a op��o: \n" + "1 para consultar os clientes \n" + "2 para inserir novo cliente \n"
//								+ "3 para atualizar um cliente \n" + "4 para excluir um cliente" + "9 para sair do sistema");
//				telaA = Integer.parseInt(s);
//				if (opcoes.contains(telaA)) {
//					erro = false;
//				}
//			} catch (HeadlessException e) {
//				e.printStackTrace();
//				erro = true;
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//				erro = true;
//			}
//		} // end while
//		erro = true;

		// _______________________fim da tela inicial_______________________________
		// m�todos do CRUD abaixo
		// 1 read:

		// create



	} // fim do main

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
				String s = JOptionPane.showInputDialog("Selecione a op��o: \n" + "1 para consultar os clientes \n"
						+ "2 para inserir novo cliente \n" + "3 para atualizar um cliente \n"
						+ "4 para excluir um cliente\n" + "9 para sair do sistema");
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

	}

//		cliente.excluir(8);

//		
//		cliente.setNome("Mgal�ncia");
//		cliente.setCpf("12345678900");
//		cliente.setEndereco("Rua Ant�nio Haffner, 455");
//		cliente.setTelefone("1111-1112");
//		cliente.salvar();
//		
//		cliente.setNome("Nessildes");
//		cliente.setCpf("55599900088");
//		cliente.setEndereco("Rua Ant�nio Haffner, 455");
//		cliente.setTelefone("1111-1111");
//		cliente.salvar();

	// fim do main

	private static void criarCliente(String nome, String cpf, String endereco, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		cliente.salvar();

	}

	static void lerTodos() {
		List<Cliente> listaCliente = new Cliente().consultaTodos();

		for (Cliente c : listaCliente) {
			System.out.println(c.getId());
			System.out.println(c.getNome());
			System.out.println(c.getCpf());
			System.out.println(c.getEndereco());
			System.out.println(c.getTelefone());
			System.out.println();
		}
		
		System.out.println("_______ Fim da Consulta atual_______ \n\n");

	}
	
	
	static void testeConexao() {
		if (Conexao.conectar() != null) {
			System.out.println("conectado");
		} else {
			System.out.println("erro ao conectar");
		}
	}

}
