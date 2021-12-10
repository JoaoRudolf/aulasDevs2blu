package Reforco;

import javax.swing.JOptionPane;

public class Folha {

	public static void main(String[] args) {
		int opcao = 0, mesesTrab = -1;
		double salario;

		while (opcao == 0) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção \n" + "1 - Novo Salário;\n"
					+ "2 - Férias;\n" + "3 - Décimo Terceiro;\n" + "4 - Sair\n"));
			
			if (opcao == 1) {
				System.out.println("Calculo de novo salário:");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário. "));

				if (salario >= 0 && salario < 350) {
					salario *= 1.15;
				} else if (salario >= 350 && salario <= 600) {
					salario *= 1.1;
				} else if (salario > 600) {
					salario *= 1.05;
				} else {
					System.out.println("salario inválido");
					salario = 0;
				}

				if (salario != 0) {
					System.out.printf("O novo salário é de R$ %.2f.\n", salario);
					// JOptionPane.showMessageDialog(null, "O novo salário é de R$ " + salario);					
				}

			}

			else if (opcao == 2) {
				System.out.println("Cálculo de férias:");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário. "));
				salario = salario / 3;
				System.out.printf("O valor relativo às férias é de R$ %.2f.\n", salario);
				
			} else if (opcao == 3) {
				System.out.println("Cálculo de 13º");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário. "));
				while (mesesTrab < 0 || mesesTrab > 12) {
					mesesTrab = Integer
							.parseInt(JOptionPane.showInputDialog("Informe o número de meses de trabalho na empresa. \n"
									+ "(Apenas no ano corrente, máximo 12 meses "));
				}
				double decimoTerc = salario * (mesesTrab / 12.0);
				System.out.printf("O valor relativo ao Décimo Terceiro salário é de R$ %.2f. \n", decimoTerc);
				
			} else if (opcao == 4) {
				return;
			} else {
				opcao = 0;
			}

			opcao = 0;
		}

	}

}
