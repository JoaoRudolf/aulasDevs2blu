package Reforco;

import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		double vlrOrig = 0, precoFinal, vlrParcel, vlrAVista, acrescimo = 0;
		int qtdParcel = 0;

		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Digite o valor original do carro(R$):");
			vlrOrig = entrada.nextDouble();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro " + e.getMessage());
		}

		vlrAVista = vlrOrig * 0.8;

		System.out.printf("O valor à vista é R$ %.2f. Opções de parcelamento abaixo: \n"
				+ "Parcelas | Valor da Parcela | Preço Final \n", vlrAVista);

		for (int i = 0; i < 10; i++) {
			qtdParcel += 6;
			acrescimo += 0.03;
			precoFinal = vlrOrig * (1 + acrescimo);
			vlrParcel = precoFinal / qtdParcel;
			System.out.printf(" %d		%.2f		%.2f \n", qtdParcel, vlrParcel, precoFinal);
		}

		entrada.close();
	}

}
