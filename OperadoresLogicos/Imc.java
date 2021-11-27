package OperadoresLogicos;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		
		JOptionPane entrada = new JOptionPane();
		double peso = 0, altura=0, imc;
		String condicao;
		
		while (peso == 0) {
			try {
				peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em kg (por exemplo 90)").replace(',', '.'));
			} catch (NumberFormatException e) {
				System.out.println("ocorreu um erro muito legal" + e.getMessage());
			}
		}
		
		while (altura == 0) {
			try {
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros (por exemplo 1,99)").replace(',', '.'));
			} catch (NumberFormatException e) {
				System.out.println("ocorreu um erro muito legal" + e.getMessage());
			}
		}


		

		System.out.printf("O peso é %.2f e a altura é %.2f.\n%n", peso, altura);
		
		imc = peso / (Math.pow(altura, 2));
		
		if (imc < 18.5) {
			condicao = "Magreza";
		} else if (imc >= 18.5 && imc < 25) {
			condicao = "Normal";
		} else if (imc >= 25 && imc < 30) {
			condicao = "Sobrepeso";
		} else if (imc >= 30 && imc < 40) {
			condicao = "Obesidade";
		} else if (imc >= 40) {
			condicao = "Obesidade grave";
		} else {
			condicao = "invalida";
		}
		
		System.out.printf("o IMC é: %.2f e a condição é de %s.", imc, condicao);
	}
}
