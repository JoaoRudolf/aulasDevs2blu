package arrayListAula;

import java.util.ArrayList;
import java.util.Collections;

public class Sorteio {

	public static void main(String[] args) {
		String f = "fernando";
		String j = "joao";
		String m = "marcus";
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add(f);
		nomes.add(j);
		nomes.add(m);
		
		Collections.sort(nomes);
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.printf("nome: %s - %.0f. \n" , nomes.get(i), (Math.random()*10));			
		}
		
	} // fim do main
} // fim da classe
