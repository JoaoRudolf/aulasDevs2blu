package arrayListAula;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Pessoa pes = new Pessoa();
		Pessoa pes2 = new Pessoa();
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		pes.nome = "jose";
		pes.idade = 25;
		pes2.nome = "joao";
		pes2.idade = 33;
		listaPessoas.add(pes);
		listaPessoas.add(pes2);
		
//		pes.imprimirDados();
		
		// forEach implícito
		for (Pessoa pessoa : listaPessoas) {
			pessoa.imprimirDados();
		}
		
		// forEach explícito
		listaPessoas.forEach( Pessoa -> {
			//imprimirDados();
			
		});
		

//		ArrayList<Object> teste = new ArrayList<>();
//		teste.add(pes);
//		teste.add(123);
//		System.out.println(teste);

	}

}
