package OperadoresLogicos;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		 int idade;
		 System.out.println("Digite a idade");
		 idade = entrada.nextInt();
		 
		 if (idade < 18 && idade >= 0) {
			System.out.println("Menor de idade");
		} else if (idade >= 18 && idade <= 64){
			System.out.println("Adulto");
		} else if (idade > 65) {
			System.out.println("Idoso");
		} else {
			System.out.println("Idade inválida");
		}
		 
		 
		 entrada.close();
	}
}
