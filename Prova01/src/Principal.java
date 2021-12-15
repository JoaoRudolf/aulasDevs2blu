import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int qtdMotoristas = 0;
		boolean erro = true;
		float totalArrLeve = 0, totalArrMedia = 0, totalArrGrave = 0, totalArrGravissima = 0, totalArrecadado = 0;

		while (erro == true) {
			try {
				qtdMotoristas = Integer.parseInt(
						JOptionPane.showInputDialog("Digite a quantidade de motoristas a serem inseridos no sistema"));
				erro = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
				erro = true;
			}
		}
		erro = true;

		Motorista[] motoristas = new Motorista[qtdMotoristas];

		for (int i = 0; i < qtdMotoristas; i++) { // percorre cada motorista
			int numCart = 0;

			while (erro == true) {
				try {
					numCart = Integer.parseInt(
							JOptionPane.showInputDialog("Digite o número da carteira do " + (i + 1) + "º motorista"));
					erro = false;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
					erro = true;
				}
			}
			erro = true;

			int leve = 0;
			int media = 0;
			int grave = 0;
			int gravissima = 0;

			int opcaoMenu = 1;
			while (opcaoMenu == 1) { // while de opcao nova multa / sair

				
				while (erro == true) {
					try {
						opcaoMenu = Integer.parseInt(
								JOptionPane.showInputDialog("Opções do motorista nº " + (i + 1) + ". Digite: \n"
										+ "1 para inserir nova multa; \n"
										+ "Outro número para sair do motorista"));
						erro = false;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
						erro = true;
					}
				}
				erro = true;

				if (opcaoMenu == 1) { // if do tipo de multa
					int opcaoMulta = 0;

					while (erro == true) {
						try {
							opcaoMulta = Integer.parseInt(JOptionPane
									.showInputDialog("Digite o tipo de multa: \n "
											+ "1 - Leve - 3 Pontos; \n "
											+ "2 - Média - 4 Pontos; \n"
											+ "3 - Grave - 5 Pontos; \n "
											+ "4 - Gravíssima - 7 Pontos \n"));
							erro = false;
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
							erro = true;
						}
					}
					erro = true;
					
					switch (opcaoMulta) {
					case 1:
						leve++;
						break;
					case 2:
						media++;
						break;
					case 3:
						grave++;
						break;
					case 4:
						gravissima++;
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
						break;
					} // fim do switch

				}  // fim do while de opcao nova multa / sair
					

			} // fim do if do tipo de multa

			Motorista motorista = new Motorista(numCart, leve, media, grave, gravissima);
			motoristas[i] = motorista;

		} // fim do for que percorre cada motorista

		for (int i = 0; i < motoristas.length; i++) { // for que imprime dados por motorista
			float totalLeve = (float) (motoristas[i].getNumMultasLeves() * 88.00);
			float totalMedia = (float) (motoristas[i].getNumMultasMedias() * 130.00);
			float totalGrave = (float) (motoristas[i].getNumMultasGraves() * 195.00);
			float totalGravissima = (float) (motoristas[i].getNumMultasGravissimas() * 293.00);
			
			int pontosLeve = motoristas[i].getNumMultasLeves() * 3;
			int pontosMedio = motoristas[i].getNumMultasMedias() * 4;
			int pontosGrave = motoristas[i].getNumMultasGraves() * 5;
			int pontosGravissimo = motoristas[i].getNumMultasGravissimas() * 7;
			
			int totalPontos = pontosLeve + pontosMedio + pontosGrave + pontosGravissimo;
						
			float totalMotorista = totalLeve + totalMedia + totalGrave + totalGravissima;
			
			

			System.out.printf("\nO motorista com a carteira de nº %d teve as seguintes multas: \n"
					+ "Tipo da Multa | Pontos por Multa | Total de Pontos | Valor por Multa | Quantidade de Multas | Valor total \n"
					+ "Leves      		3pts		%d		R$ 88,00		%d		%.2f	\n"
					+ "Médias     		4pts		%d		R$ 130,00		%d 		%.2f	\n"
					+ "Graves     		5pts		%d		R$ 195,00		%d		%.2f	\n"
					+ "Gravíssimas		7pts		%d		R$ 293,00		%d 		%.2f	\n\n"
					+ "TOTAL DO MOTORISTA			%d 							%.2f	\n\n",

					motoristas[i].getNumCart(), 
					pontosLeve ,motoristas[i].getNumMultasLeves(), totalLeve,
					pontosMedio, motoristas[i].getNumMultasMedias(), totalMedia, 
					pontosGrave ,motoristas[i].getNumMultasGraves(), totalGrave,
					pontosGravissimo, motoristas[i].getNumMultasGravissimas(), totalGravissima, 
					totalPontos, totalMotorista);
			
			totalArrLeve += totalLeve;
			totalArrMedia += totalMedia;
			totalArrGrave += totalGrave;
			totalArrGravissima += totalGravissima;
			
			totalArrecadado += totalMotorista;
			
			if (i == (motoristas.length - 1)) {
				
				System.out.printf("\n *** O TOTAL ARRECADADO COM APLICAÇÃO DE MULTAS DE TRÂNSITO FOI: *** \n\n"
						+ "Tipo da Multa | Valor por Multa  | Valor total \n"
						+ "Leves    	R$ 88,00		%.2f	\n"
						+ "Médias   	R$ 130,00		%.2f	\n"
						+ "Graves    	R$ 195,00		%.2f	\n"
						+ "Gravíssimas	R$ 293,00		%.2f	\n\n"
						+ "			TOTAL GERAL	%.2f	\n\n",
							totalArrLeve, totalArrMedia, totalArrGrave, totalArrGravissima, totalArrecadado)
						;
			}

		} // fim do for que imprime dados por motorista


	} // fim do main

} // fim da classe
