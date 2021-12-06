import java.util.Scanner;

public class DesafioFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = -1, qtdeNumeros = 0, multip = 0;


			try {
				System.out.println("Digite o número para o qual se deseja obter a tabuada: ");
				numero = entrada.nextInt();
				System.out.println("Digite a quantidade de números desejados na tabuada: ");
				qtdeNumeros = entrada.nextInt();
			} catch (Exception e) {
				System.out.println("Ocorreu um erro: " + e.getMessage());
			}


		if (numero != -1 && qtdeNumeros != 0) {
			for (int i = 1; i <= qtdeNumeros; i++) {
				multip = numero * i;
				System.out.printf("%d * %d = %d. \n", numero, i, multip);
			}
			
		}
		entrada.close();
	}
}
