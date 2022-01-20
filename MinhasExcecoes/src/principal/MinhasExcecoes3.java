package principal;

import javax.swing.JOptionPane;

import principalexceptions.IdadeNegativaException;
import principalexceptions.ZeroANoveExceeption2;

public class MinhasExcecoes3 {

	public static void main(String[] args) {
		try {
			lerIdade();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // fim do main
	
	static void lerIdade() throws IdadeNegativaException, ZeroANoveExceeption2 {
		String idade = JOptionPane.showInputDialog("Informe a idade");
		
		if (idade.contains("a")) {
			throw new ZeroANoveExceeption2("Idade não pode ser diferente dos algarismos de 0 a 9");
		}
		
		
		int idadeConvertida = Integer.parseInt(idade);
		
		if(idadeConvertida < 0) {
			throw new IdadeNegativaException("Idade não pode ser negativa");
		} // fim do if
	} // fim do lerIdade

} // fim da classe
