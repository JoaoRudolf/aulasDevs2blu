package refatoracao;

import entidades.Carro;
import entidadesDAO.DaoCarro;
import utils.Conexao;

public class RefatoracaoProf {

	public static void main(String[] args) {
		chamaExcluirPorObjeto();
	}

	static void chamaExcluirPorObjeto() {
		Carro carro = new DaoCarro().retornarUm(5);

		if (new DaoCarro().excluir(carro)) {
			System.out.println("carro excluido com sucesso");
		}
	}

	static void chamaExcluir() {
		if (new DaoCarro().excluir(6)) {
			System.out.println("carro excluido com sucesso");
		}
	}

	static void chamaSalvar() {
		DaoCarro dao = new DaoCarro();

		Carro carro = new Carro();
		carro.setPlaca("abc124");
		carro.setModelo("Fusca");
		carro.setMarca("volks");

		if (new DaoCarro().salvar(carro)) {
			System.out.println("Carro salvo com sucesso");
		}

		Carro carro2 = new Carro("def2345", "Kombi", "Volks");
		if (dao.salvar(carro2)) {
			System.out.println("Carro salvo com sucesso");
		}
	}
}
