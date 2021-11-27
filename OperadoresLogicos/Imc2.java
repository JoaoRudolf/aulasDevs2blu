package OperadoresLogicos;

import java.util.Scanner;

public class Imc2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double peso, altura, imc;

		System.out.println("Digite o seu peso em Kg (por exemplo 90)");
		peso = entrada.nextDouble();
		
		System.out.println("Digite a sua altura em metros (por exemplo 1,99)");
		altura = entrada.nextDouble();
		
		System.out.printf("O peso é %.2f e a altura é %.2f.\n%n", peso, altura);
		
		imc = peso / (Math.pow(altura, 2));
		System.out.printf("o IMC é: %.2f.", imc);
		
		entrada.close();
	}
}
