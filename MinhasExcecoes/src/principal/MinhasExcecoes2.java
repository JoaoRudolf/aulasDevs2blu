package principal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import principalexceptions.IdadeNegativaException;
import principalexceptions.ZeroANoveExceeption;

public class MinhasExcecoes2 {

	public static void main(String[] args) {
		try {
			lerIdade();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	} // fim do main
	
	static void lerIdade() throws IdadeNegativaException, ZeroANoveExceeption {
		String idade = JOptionPane.showInputDialog("Informe a idade");
		int idadeConvertida = Integer.parseInt(idade);
		
		if(idadeConvertida < 0) {
			throw new IdadeNegativaException("Idade não pode ser negativa");
		} // fim do if
		
		
		ArrayList<Integer> algarismos = new ArrayList<>();
		
		algarismos.add(0);algarismos.add(1);algarismos.add(2);algarismos.add(3);algarismos.add(4);
		algarismos.add(5);algarismos.add(6);algarismos.add(7);algarismos.add(8);algarismos.add(9);
		
		
		if(!algarismos.contains(idadeConvertida)) {
			throw new ZeroANoveExceeption("Idade não pode ser diferente dos algarismos de 0 a 9");
		} // fim do if
		
		System.out.println(idadeConvertida);
		System.out.println(algarismos.size());
		
	} // fim do lerIdade

} // fim da classe
