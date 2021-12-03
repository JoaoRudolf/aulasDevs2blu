package Desafios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		double num1, num2, resultado, resto;
		int operacao = 0;

		while (operacao != 9) {
			try {
				operacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opera��o desejada: \n"
						+ "Digite 1 para somar; \n" + "Digite 2 para subtrair; \n" + "Digite 3 para multiplicar; \n"
						+ "Digite 4 para dividir; \n" + "Digite 9 para sair; \n"));
				if (operacao == 9) {
					JOptionPane.showMessageDialog(null, "Hasta la vista, baby");
					return;
				}
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero:"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero:"));

				switch (operacao) {
				case 1:
					resultado = num1 + num2;
					JOptionPane.showMessageDialog(null, "O resultado da soma � " + resultado + ".");
					break;
				case 2:
					resultado = num1 - num2;
					JOptionPane.showMessageDialog(null, "O resultado da subtra��o � " + resultado + ".");
					break;
				case 3:
					resultado = num1 * num2;
					JOptionPane.showMessageDialog(null, "O resultado da multiplica��o � " + resultado + ".");
					break;
				case 4:
					if (num2 != 0) {
						resultado = num1 / num2;
						resto = num1 % num2;
						JOptionPane.showMessageDialog(null,
								"O resultado da divis�o � " + resultado + " e o resto da divis�o � " + resto);
					} else {
						JOptionPane.showMessageDialog(null, "Divisor n�o pode ser igual a zero. Tente novamente");

					}

					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Hasta la vista, baby");
					break;
				default:
					break;

				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Caractere informado inv�lido: " + e.getMessage());
			}

		}

	}
}
