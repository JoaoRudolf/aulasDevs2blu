package OperadoresLogicos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3, num4;

		
		System.out.println("Digite o n�mero 1: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o n�mero 2: ");
		num2 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println("Teste 1 - n�mero 1 e n�mero 2 s�o iguais.\n");
		} else {
			System.out.println("Teste 1 - n�mero 1 e n�mero 2 s�o diferentes.\n");
		}
		
		System.out.println("Digite o n�mero 3: ");
		num3 = entrada.nextInt();
		System.out.println("Digite o n�mero 4: ");
		num4 = entrada.nextInt();
		
		if ((num1 == num2) && (num3 == num4)) {
			System.out.println("Teste 2 - n�meros 1 e 2 s�o iguais entre si e os n�meros 3 e 4 s�o iguais entre si.\n");
		} else {
			System.out.println("Teste 2 - n�meros 1 e 2 s�o diferentes entre si ou os n�meros 3 e 4 s�o diferentes entre si.\n");
		}
		

		
		
		entrada.close();
	}
}
