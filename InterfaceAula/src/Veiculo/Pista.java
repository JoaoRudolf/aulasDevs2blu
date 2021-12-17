package Veiculo;

import javax.swing.JOptionPane;

public class Pista {

	public static void main(String[] args) {
		String modeloDeVeiculo;
		int tipoVeiculo = 0, acao = 0;
		float capacTanque, litragemAtual;
		boolean controleDeErro = true;
		Veiculo veiculo = null;
		// Motocicleta motocicleta = null;

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
						veiculo = new Automovel(modeloDeVeiculo, capacTanque, litragemAtual);
					} else if (tipoVeiculo == 2) {
						veiculo = new Motocicleta(modeloDeVeiculo, capacTanque, litragemAtual);
					}
					controleDeErro = false;
				} // fim do else
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Caractere inv�lido " + e.getMessage());
				controleDeErro = true;
			}
		} // fim do while de cria��o do ve�culo
		controleDeErro = true;

		while (controleDeErro == true) { // while do painel de op��es
			try {
				while (acao != 7) {
					acao = Integer.parseInt(JOptionPane.showInputDialog("Situa��o do ve�culo: \n" + "Est� ligado? "
							+ veiculo.isLigado() + " ;\n" + "Velocidade Atual: " + veiculo.getVelocAtual() + "km/h; \n"
							+ "Tanque de combust�vel: " + veiculo.getLitragemAtual() + " litros de um total de "
							+ veiculo.getCapacTanque() + " litros poss�veis. \n\n"
							+ "Digite a a��o que deseja fazer com o seu ve�culo: \n"
							+ "1 - Ligar / 2 - Abastecer / 3 - Acelerar / 4 - Manter Velocidade / 5 - Frear / 6 - Desligar / 7 - Sair do sistema. \n"));

					controleDeErro = true;

					switch (acao) {
					case 1:
						veiculo.ligar();
						break;
					case 2:
						veiculo.abastecer();
						break;
					case 3:
						veiculo.acelerar();
						break;
					case 4:
						veiculo.manterVelocidade();
						break;
					case 5:
						veiculo.frear();
						break;
					case 6:
						veiculo.desligar();
						break;
					default:
						break;

					}
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Caractere inv�lido " + e.getMessage());
				controleDeErro = true;
			}
		} // fim do while de op��es
	} // fim do main

} // fim da classe
