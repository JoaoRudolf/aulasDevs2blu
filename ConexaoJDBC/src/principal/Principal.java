package principal;

import entidades.Carro;
import utils.Conexao;

public class Principal {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setPlaca("mav5526");
		carro.setMarca("Volks");
		carro.setModelo("Fusca");
		
		carro.salvar();
		
	} // fim do main
	
	static void testeConexao() {
		if (Conexao.conectar()!=null) {
			System.out.println("conectado");
		} else {
			System.out.println("erro ao conectar");
		}
	}

}
