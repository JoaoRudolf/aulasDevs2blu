package OperadoresLogicos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3, num4;

		
		System.out.println("Digite o número 1: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o número 2: ");
		num2 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println("Teste 1 - número 1 e número 2 são iguais.\n");
		} else {
			System.out.println("Teste 1 - número 1 e número 2 são diferentes.\n");
		}
		
		System.out.println("Digite o número 3: ");
		num3 = entrada.nextInt();
		System.out.println("Digite o número 4: ");
		num4 = entrada.nextInt();
		
		if ((num1 == num2) && (num3 == num4)) {
			System.out.println("Teste 2 - números 1 e 2 são iguais entre si e os números 3 e 4 são iguais entre si.\n");
		} else {
			System.out.println("Teste 2 - números 1 e 2 são diferentes entre si ou os números 3 e 4 são diferentes entre si.\n");
		}
		

		
		
		entrada.close();
	}
}
