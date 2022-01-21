package principal;

import java.util.List;

import javax.swing.JOptionPane;

import entidades.Cliente;
import utils.Conexao;

public class Principal {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int telaA = 0;
		
		while (telaA==0 ) {
			String s = JOptionPane.showInputDialog("Selecione a opção: \n"
					+ "1 para consultar os clientes \n"
					+ "2 para inserir novo cliente \n"
					+ "3 para atualizar um cliente \n"
					+ "4 para excluir um cliente");
			telaA = Integer.parseInt(s);
		} // end while
		
		if (telaA == 1) {
			lerTodos();			
		}
		
		if (telaA == 2) {
			inserirCliente();
		}
		
		
		

		
//		cliente.excluir(8);
		
//		cliente.setNome("Joãozinho");
//		cliente.setCpf("98765432100");
//		cliente.setEndereco("Rua Antônio Haffner, 455");
//		cliente.setTelefone("9111-1112");
//		cliente.salvar();
		
//		cliente.setNome("Mgalôncia");
//		cliente.setCpf("12345678900");
//		cliente.setEndereco("Rua Antônio Haffner, 455");
//		cliente.setTelefone("1111-1112");
//		cliente.salvar();
		
//		cliente.setNome("Nessildes");
//		cliente.setCpf("55599900088");
//		cliente.setEndereco("Rua Antônio Haffner, 455");
//		cliente.setTelefone("1111-1111");
//		cliente.salvar();
		
		
		
	} // fim do main
	
	private static void inserirCliente() {
		
		
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

	}
	
	
	static void testeConexao() {
		if (Conexao.conectar()!=null) {
			System.out.println("conectado");
		} else {
			System.out.println("erro ao conectar");
		}
	}

}
