package arrayAula;

import java.util.Arrays;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] codigos = new int[10];
		String[] nomes = new String[10];
		double[] salarios = new double[10];
		double[] maioresSalarios = new double[3];
		
		nomes[0] = "João";
		nomes[1] = "José";
		nomes[2] = "Maria";
		nomes[3] = "Pedro";
		nomes[4] = "Alberto";
		nomes[5] = "Josué";
		nomes[6] = "Carol";
		nomes[7] = "Catieli";
		nomes[8] = "Leandro";
		nomes[9] = "Camila";
		
		System.out.println("Código | Nome  |   Salário");
		
		for (int i = 0; i < 10; i++) {
			codigos[i] = i+1;
			salarios[i] = Math.random() * 10000;
			System.out.printf(" %d  	%s	  R$ %.2f \n", codigos[i], nomes[i], salarios[i]);
		}
		
		maioresSalarios[0] = 0;
		maioresSalarios[1] = 0;
		maioresSalarios[2] = 0;
		
		for (int i = 0; i < salarios.length-1; i++) {
			if (salarios[i] > maioresSalarios[0]) {
				maioresSalarios[0] = salarios[i];				
			} 
		}
		
		
		for (int i = 0; i < salarios.length; i++) {
			
		}
			
		Arrays.sort(salarios);
		System.out.println("Os três maiores salário são:");
		
		for (int i = 9; i >= 7; i--) {
			System.out.printf("R$ %.2f. \n", salarios[i]);			
		}
		
		
		System.out.printf("o maior salário é de R$ %.2f. \n", maioresSalarios[0]);
	}
}
