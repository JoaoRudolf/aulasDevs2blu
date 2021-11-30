package SwitchEWhile;
import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		
		float nota = 0, somaNotas = 0, media = 0;
		int qtdNotas = 0, contaNotas;
		

		while (qtdNotas <1) {
			try {
				qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas"));
			} catch (NumberFormatException e) {
				System.out.println("Ocorreu um erro: " + e.getMessage());
			} 	
		}
		
		while (media == 0) {
			try {
				contaNotas = 0;
				while (contaNotas < qtdNotas) {
					nota = Float.parseFloat(
							JOptionPane.showInputDialog("Informe a nota nº" + (contaNotas + 1)).replace(",", "."));
					if (nota < 0 && nota >10) {
						media = 0;
					} else {
						somaNotas += nota;
						System.out.printf("nota %d = %.2f.\n", contaNotas+1, nota);
						System.out.println("Soma das notas: " + somaNotas);
						contaNotas++;		
					}	
				}

					media = somaNotas / qtdNotas;
					System.out.printf("A média é: %.2f", media);

				} catch (NumberFormatException e) {
					System.out.println("Ocorreu um erro: " + e.getMessage());
				} 
		}		
	}
}
