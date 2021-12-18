package arrayListAula;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayPrincipal {

	public static void main(String[] args) {

		ArrayList<String> listaCarros = new ArrayList<>();
		int qtdCarros = 0, opcao = 0;
		String marca;

		while (qtdCarros <= 0) {
			
			try {
				qtdCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros a adicionar"));
				for (int i = 0; i < qtdCarros; i++) {
					marca = JOptionPane.showInputDialog("Informe a marca do " + (i + 1) + "º carro").toUpperCase();
					listaCarros.add(marca);

				} 
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
		} // fim do while

		while (opcao == 0) {
			
			JOptionPane.showInputDialog("Os carros atuais são: \n" + listaCarros + " \n" + "Informe a opção desejada: \n"
					+ "1 - Adicionar carro; \n" + "2 - Alterar carro; \n" + "3 - Remover carro; \n"
					+ "9 - Sair e imprimir a lista.");
			
			switch (opcao) {
			case 1:
				
				break;

			default:
				break;
			}
		}



//		// verifica se esta vazia
//		if (listaCarros.isEmpty()) {
//			System.out.println("Lista vazia");
//		} else {
//			System.out.println("Lista contém registros");
//		}

//		System.out.println(listaCarros.subList(2, 4));
//		System.out.println(listaCarros);

//		// buscando o conteudo de um index especifico
//		int posicao3 = 3;
//		System.out.println("O veículo da posição 3 é o " + listaCarros.get(posicao3));
//		
//		// inverte marcas das posições 2 e 3
//		int posicao2 = 2;
//		String marcaPosicao2, marcaPosicao3 = "";
//		
//		marcaPosicao2 = listaCarros.get(posicao2);
//		marcaPosicao3 = listaCarros.get(posicao3);
//		
//		listaCarros.set(posicao2, marcaPosicao3);
//		listaCarros.set(posicao3, marcaPosicao2);
//		System.out.println(listaCarros);
//		
//		System.out.println(listaCarros.indexOf("BMW"));
//		
//		//removendo um veiculo por indice
//		//listaCarros.remove(0);
//		System.out.println(listaCarros.remove(0));
//		
//		System.out.println(listaCarros);
//		
//		// remove por conteudo
//		int marcaParaTirar = listaCarros.indexOf("Honda");
//		listaCarros.remove(marcaParaTirar);
//		System.out.println(listaCarros);
//		
//		System.out.println(listaCarros.remove(listaCarros.indexOf("Toyota"))); 
//		System.out.println(listaCarros);
//		

	}
}
