import entidades.Contato;
import entidadesDao.DaoContato;

public class Principal {

	public static void main(String[] args) {
		//chamaSalvar();
		pegaUm();
		System.out.println("");
		chamaUpdate();
		System.out.println("");
		pegaUm();
		

	}
	
	static void chamaUpdate () {
		Contato contato = new DaoContato().pegarUm(2L);
		contato.setCelular("47 6969-6969");
		if (new DaoContato().update(contato)) {
			System.out.println("Alterado com sucesso");
		}
		
		
	}
	
	static void chamaSalvar() {
		Contato contato = new Contato();
		contato.setNome("João Gabriel");
		contato.setEmail("joaogrudolf@gmail.com");
		contato.setCelular("(47)9988-0171");
		
		new DaoContato().salvar(contato);
	}
	
	static void pegaUm() {
		Contato contato = new DaoContato().pegarUm(2L);
		System.out.println("Nome: " + contato.getNome());
	}
	
	
}
