package principal;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Cliente;
import utils.Conexao;

public class Principal {

	public static void main(String[] args) {
		int opcao = 0; 
		while (opcao != 9) {
			opcao = telaInicial();
			
			//___________READ___________________________________________ |
			if (opcao == 1) {
				lerTodos();
			} // fim do read
			//___________FIM DO READ_____________________________________||
			
			
			//________________CREATE_____________________________________|
			
			if (opcao == 2) {
				String nome = null, cpf = null, endereco = null, telefone = null;
				boolean erro = true;

				while (erro == true) {
					try {
						nome = JOptionPane.showInputDialog("Digite o nome do cliente: \n");
						cpf = JOptionPane.showInputDialog("Digite o cpf do cliente(somente os números): \n");
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
			} 
			//________________FIM DO CREATE_____________________________________||
			
			
			//____________________UPDATE________________________________________||
			
			if (opcao == 3) {
				String idStr = JOptionPane.showInputDialog("Digite o id do cliente: \n");
				int id = Integer.parseInt(idStr);
				
				
				String nome = null, cpf = null, endereco = null, telefone = null;
				boolean erro = true;

				while (erro == true) {
					try {
						nome = JOptionPane.showInputDialog("Digite o novo nome do cliente de id " + id  + ": \n");
						cpf = JOptionPane.showInputDialog("\"Digite o novo cpf do cliente de id " + id  + ": \\n");
						endereco = JOptionPane.showInputDialog("\"Digite o novo endereco do cliente de id " + id  + ": \\n");
						telefone = JOptionPane.showInputDialog("\"Digite o novo telefone do cliente de id " + id  + ": \\n");
						erro = false;
					} catch (HeadlessException e) {
						e.printStackTrace();
						erro = true;
					}
				} // end while
				erro = true;
				
				alterarCliente(id, nome, cpf, endereco, telefone);
				
				System.out.println("Cliente de id " + id + " criado com sucesso!");
			}
			
			//________________FIM DO UPDATE_____________________________________||
			
			
			//________________DELETE_____________________________________|
			
			if (opcao == 4) {
				String idStr = JOptionPane.showInputDialog("Digite o id do cliente a ser excluído: \n");
				int id = Integer.parseInt(idStr);
				
				chamaExcluir(id);
			}
			
			
			//________________FIM DO DELETE_____________________________________||
			
			
			
		} // FIM DO WHILE DA TELA INICIAL



	} // fim do main
	
	//===================== END OF MAIN ========================================||

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
				String s = JOptionPane.showInputDialog("Selecione a opção: \n" + "1 para consultar os clientes \n"
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
	
	static Cliente alterarCliente(int id, String nome, String cpf, String endereco, String telefone) {
		Cliente cliente = new Cliente().consultaPeloId(id);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEndereco(endereco);
		cliente.setTelefone(telefone);
		return cliente;
	}
	
	static void chamaExcluir(int id) {
		Cliente cliente = new Cliente();
		if (cliente.excluir(id)) {
			System.out.println("excluído com sucesso");
		}
	}
	
	static void testeConexao() {
		if (Conexao.conectar() != null) {
			System.out.println("conectado");
		} else {
			System.out.println("erro ao conectar");
		}
	}

}