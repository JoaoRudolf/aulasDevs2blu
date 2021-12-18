package arrayAula;

public class MeuArray {

	public static void main(String[] args) {
		
		int[] listaNumeros = new int[100];
		
		for (int i = 0; i < 100; i++) {
			listaNumeros[i] = i+1;
			if((i+1) == 7) {
				listaNumeros[i] = 123;
			}
			System.out.println(listaNumeros[i]);
		}
		
	}
}
