package Veiculo;

import javax.swing.JOptionPane;

public class Pista {

	public static void main(String[] args) {
		String modeloDeVeiculo;
		int tipoVeiculo = 0, acao = 0;
		float capacTanque, litragemAtual;
		boolean controleDeErro = true;
		Automovel automovel = null;

		while (controleDeErro == true) { // while de cria��o do ve�culo
			try {
				tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o tipo de ve�culo a ser criado: 1 para autom�vel, 2 para motocicleta"));
				modeloDeVeiculo = JOptionPane
						.showInputDialog("Digite o modelo do ve�culo (Exemplos: gol, fusca, cg, intruder, etc");
				capacTanque = Float.parseFloat(JOptionPane.showInputDialog("Digite a capacidade do tanque do ve�culo"));
				litragemAtual = Float
						.parseFloat(JOptionPane.showInputDialog("Digite quantos litros t�m no tanque atualmente"));

				if (litragemAtual > capacTanque) {
					System.out.println("Litragem atual n�o pode ser maior que a capacidade do tanque");
				} else {
					
					if (tipoVeiculo == 1) {
						automovel = new Automovel(modeloDeVeiculo, capacTanque, litragemAtual);
					} else if (tipoVeiculo == 2) {
						// implementar motocicleta
					}
					controleDeErro = false;
				} // fim do else
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Caractere inv�lido " + e.getMessage());
				controleDeErro = true;
			}
		}  // fim do while de cria��o do ve�culo
		controleDeErro = true;
		
		
		while (acao != 6) {
			acao = Integer.parseInt(JOptionPane.showInputDialog("Situa��o do ve�culo: \n" + "Est� ligado? "
					+ automovel.isLigado() + " ;\n" + "Velocidade Atual: " + automovel.getVelocAtual() + "km/h; \n"
					+ "Tanque de combust�vel: " + automovel.getLitragemAtual() + " litros de um total de "
					+ automovel.getCapacTanque() + " litros poss�veis. \n\n"
					+ "Digite a a��o que deseja fazer com o seu ve�culo: \n"
					+ "1 - Ligar / 2 - Abastecer / 3 - Acelerar / 4 - Frear / 5 - Desligar / 6 - Sair do sistema. \n"));
			switch (acao) {
			case 1:
				automovel.ligar();
				break;
			case 2:
				automovel.abastecer();
				break;
			case 3:
				automovel.acelerar();
				break;
			case 4:
				automovel.frear();
				break;
			case 5:
				automovel.desligar();
				break;
			default:
				break;
			}
		}

	} // fim do main

} // fim da classe
