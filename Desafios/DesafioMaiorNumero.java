package Desafios;

import javax.swing.JOptionPane;

public class DesafioMaiorNumero {

	public static void main(String[] args) {
		int qtdNumeros = 0;
		double maiorNumero, menorNumero = 0;

		try {
			qtdNumeros = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a quantidade de n�meros a ser digitada"));
			double[] conjuntoNumeros = new double[qtdNumeros];

			for (int i = 0; i < conjuntoNumeros.length; i++) { // for para armazenamento dos n�meros no array
				conjuntoNumeros[i] = Double
						.parseDouble(JOptionPane.showInputDialog("Digite o n�mero " + (i + 1) + "� n�mero").replace(",", "."));
			} // fim do for para armazenamento dos n�meros no array

			maiorNumero = conjuntoNumeros[0];
			for (int i = 0; i < conjuntoNumeros.length; i++) { // for para identifica��o do maior n�mero
				maiorNumero = Math.max(conjuntoNumeros[i], maiorNumero);
			}

			menorNumero = conjuntoNumeros[0];
			for (int i = 0; i < conjuntoNumeros.length; i++) { // for para identifica��o do menor n�mero
				menorNumero = Math.min(conjuntoNumeros[i], menorNumero);
			}

			JOptionPane.showMessageDialog(null, "Foram informados " + qtdNumeros + " n�meros. \n" + "O maior n�mero � "
					+ maiorNumero + ".\n" + "O menor n�mero � o " + menorNumero);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Caractere inv�lido " + e.getMessage());
		}

	} // main
} // classe
