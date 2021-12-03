package Desafios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		double num1, num2, resultado, resto;
		int operacao = 0;

		while (operacao != 9) {
			try {
				operacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada: \n"
						+ "Digite 1 para somar; \n" + "Digite 2 para subtrair; \n" + "Digite 3 para multiplicar; \n"
						+ "Digite 4 para dividir; \n" + "Digite 9 para sair; \n"));
				if (operacao == 9) {
					JOptionPane.showMessageDialog(null, "Hasta la vista, baby");
					return;
				}
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número:"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número:"));

				switch (operacao) {
				case 1:
					resultado = num1 + num2;
					JOptionPane.showMessageDialog(null, "O resultado da soma é " + resultado + ".");
					break;
				case 2:
					resultado = num1 - num2;
					JOptionPane.showMessageDialog(null, "O resultado da subtração é " + resultado + ".");
					break;
				case 3:
					resultado = num1 * num2;
					JOptionPane.showMessageDialog(null, "O resultado da multiplicação é " + resultado + ".");
					break;
				case 4:
					if (num2 != 0) {
						resultado = num1 / num2;
						resto = num1 % num2;
						JOptionPane.showMessageDialog(null,
								"O resultado da divisão é " + resultado + " e o resto da divisão é " + resto);
					} else {
						JOptionPane.showMessageDialog(null, "Divisor não pode ser igual a zero. Tente novamente");

					}

					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Hasta la vista, baby");
					break;
				default:
					break;

				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Caractere informado inválido: " + e.getMessage());
			}

		}

	}
}
