import java.util.Scanner;

public class ItensVendidos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int itensVendidos = 0;
		double acumulTotal = 0;
		
		System.out.println("Informe a quantidade de itens vendidos");
		itensVendidos = entrada.nextInt();
		
		for (int i = 1; i <= itensVendidos; i++) {
			int codigo, qtdVend;
			String descricao;
			double valUnit, valTotalItem;
			
			System.out.printf("Digite o código do %dº produto. \n", i);
			codigo = entrada.nextInt();
			
			System.out.printf("Digite a descrição do %dº produto. \n", i);
			descricao = entrada.next();
			
			System.out.printf("Digite o valor unitário do %dº produto. \n", i);
			valUnit = entrada.nextDouble();
			
			System.out.printf("Digite a quantidade vendida do %dº produto. \n", i);
			qtdVend = entrada.nextInt();
			
			valTotalItem = valUnit * qtdVend;
			acumulTotal = acumulTotal + valTotalItem;
			
			System.out.printf("%dº produto: \n"
					+ "Código: %d. \n"
					+ "Descrição: %s. \n"
					+ "Valor Unitário: R$ %.2f. \n"
					+ "Quantidade Vendida: %d. \n"
					+ "Valor total do item: %.2f. \n\n", 
					i, codigo, descricao, valUnit, qtdVend, valTotalItem);
			
		}
		
		System.out.println("O Valor total da nota fiscal foi: R$ " + acumulTotal + ".");
		
		entrada.close();
	}
}
