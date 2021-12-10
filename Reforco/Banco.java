package Reforco;

import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		int codCliente = 1, tipoConta;
		double valorInvestido, rendMensal = 0, jurPagos;

		while (codCliente > 0) {
			codCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente"));
			if (codCliente > 0) {
				while (rendMensal == 0) {
					tipoConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de conta: \n"
							+ "1 - Poupança\n" + "2 - Poupança Plus \n" + "3 - Fundos de Renda \n"));

					switch (tipoConta) {
					case 1:
						rendMensal = 0.015;
						break;
					case 2:
						rendMensal = 0.02;
						break;
					case 3:
						rendMensal = 0.04;
						break;
					default:
						rendMensal = 0;
						break;
					}
				}
				valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor investido (R$)"));
				jurPagos = valorInvestido * rendMensal;
				System.out.printf(
						"O rendimento mensal do cliente de código %d será de %.2f %%. Em um mês, com o valor investido, serão pagos R$ %.2f a título de juros. \n",
						codCliente, (rendMensal * 100), jurPagos);

				rendMensal = 0;
			} // fim do if

		} // fim do while
	} // fim do main

} // fim da classe
