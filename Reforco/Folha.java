package Reforco;

import javax.swing.JOptionPane;

public class Folha {

	public static void main(String[] args) {
		int opcao = 0, mesesTrab = -1;
		double salario;

		while (opcao == 0) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o \n" + "1 - Novo Sal�rio;\n"
					+ "2 - F�rias;\n" + "3 - D�cimo Terceiro;\n" + "4 - Sair\n"));
			
			if (opcao == 1) {
				System.out.println("Calculo de novo sal�rio:");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio. "));

				if (salario >= 0 && salario < 350) {
					salario *= 1.15;
				} else if (salario >= 350 && salario <= 600) {
					salario *= 1.1;
				} else if (salario > 600) {
					salario *= 1.05;
				} else {
					System.out.println("salario inv�lido");
					salario = 0;
				}

				if (salario != 0) {
					System.out.printf("O novo sal�rio � de R$ %.2f.\n", salario);
					// JOptionPane.showMessageDialog(null, "O novo sal�rio � de R$ " + salario);					
				}

			}

			else if (opcao == 2) {
				System.out.println("C�lculo de f�rias:");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio. "));
				salario = salario / 3;
				System.out.printf("O valor relativo �s f�rias � de R$ %.2f.\n", salario);
				
			} else if (opcao == 3) {
				System.out.println("C�lculo de 13�");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio. "));
				while (mesesTrab < 0 || mesesTrab > 12) {
					mesesTrab = Integer
							.parseInt(JOptionPane.showInputDialog("Informe o n�mero de meses de trabalho na empresa. \n"
									+ "(Apenas no ano corrente, m�ximo 12 meses "));
				}
				double decimoTerc = salario * (mesesTrab / 12.0);
				System.out.printf("O valor relativo ao D�cimo Terceiro sal�rio � de R$ %.2f. \n", decimoTerc);
				
			} else if (opcao == 4) {
				return;
			} else {
				opcao = 0;
			}

			opcao = 0;
		}

	}

}
