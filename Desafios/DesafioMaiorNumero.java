package Desafios;

import javax.swing.JOptionPane;

public class DesafioMaiorNumero {

	public static void main(String[] args) {
		int qtdNumeros = 0;
		double maiorNumero, menorNumero = 0;


			try {
				qtdNumeros = Integer.parseInt(JOptionPane
						.showInputDialog("Informe a quantidade de números a ser digitada").replace(",", "."));
				double[] conjuntoNumeros = new double[qtdNumeros];

				for (int i = 0; i < conjuntoNumeros.length; i++) { // for para armazenamento dos números no array
					conjuntoNumeros[i] = Double
							.parseDouble(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "º número"));
				} // fim do for para armazenamento dos números no array

				maiorNumero = conjuntoNumeros[0];
				for (int i = 0; i < conjuntoNumeros.length; i++) { // for para identificação do maior número
					maiorNumero = Math.max(conjuntoNumeros[i], maiorNumero);
				}

				menorNumero = conjuntoNumeros[0];
				for (int i = 0; i < conjuntoNumeros.length; i++) { // for para identificação do menor número
					menorNumero = Math.min(conjuntoNumeros[i], menorNumero);
				}

				JOptionPane.showMessageDialog(null, "Foram informados " + qtdNumeros + " números. \n"
						+ "O maior número é " + maiorNumero + ".\n" + "O menor número é o " + menorNumero);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
			} 
	

	} // main
} // classe
