package principal;

import javax.swing.JOptionPane;

import principalexceptions.IdadeNegativaException;

public class MinhasExcecoes {

	public static void main(String[] args) {
		try {
			lerIdade();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // fim do main
	
	static void lerIdade() throws IdadeNegativaException {
		String idade = JOptionPane.showInputDialog("Informe a idade");
		int idadeConvertida = Integer.parseInt(idade);
		
		if(idadeConvertida < 0) {
			throw new IdadeNegativaException("Idade não pode ser negativa");
		} // fim do if
	} // fim do lerIdade

} // fim da classe
