package principal;

import java.util.List;

import entidades.Carro;
import utils.Conexao;

public class Principal {
	
	public static void main(String[] args) {
//		alterarCarro();
//		lerTodos();
//		
//
//		
//		
//
////		consultar();
//		

		
	} // fim do main
	
	static void lerTodos() {
		List<Carro> listaCarro = new Carro().consultaTodos();
		
		for (Carro c : listaCarro) {
			System.out.println(c.getId());
			System.out.println(c.getPlaca());
			System.out.println(c.getMarca());
			System.out.println(c.getModelo());
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
	
	static void consultar() {
		 /* Carro carro = new Carro();
       carro.consultaPeloId(1);*/
		Carro carro = new Carro().consultaPeloId(1);
		System.out.println(carro.getId());
		System.out.println(carro.getPlaca());
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		
		System.out.println("");
		
		Carro carro1 = new Carro().consultaPeloId(3);
		System.out.println(carro1.getId());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
	}

	static void chamaExcluir() {
		Carro carro = new Carro();
		if (carro.excluir(1)) {
			System.out.println("excluído com sucesso");
		}
	}
	
	static void alterarCarro() {
		Carro carro = new Carro().consultaPeloId(3);
		carro.setPlaca("abc1266");
		if (carro.update()) {
			System.out.println("carro alterado com sucesso");
		}
		
	}
}
