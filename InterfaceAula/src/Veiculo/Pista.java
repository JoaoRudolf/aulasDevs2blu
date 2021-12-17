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

		while (controleDeErro == true) { // while de criação do veículo
			try {
				tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o tipo de veículo a ser criado: 1 para automóvel, 2 para motocicleta"));
				modeloDeVeiculo = JOptionPane
						.showInputDialog("Digite o modelo do veículo (Exemplos: gol, fusca, cg, intruder, etc");
				capacTanque = Float.parseFloat(JOptionPane.showInputDialog("Digite a capacidade do tanque do veículo"));
				litragemAtual = Float
						.parseFloat(JOptionPane.showInputDialog("Digite quantos litros têm no tanque atualmente"));

				if (litragemAtual > capacTanque) {
					System.out.println("Litragem atual não pode ser maior que a capacidade do tanque");
				} else {

					if (tipoVeiculo == 1) {
						veiculo = new Automovel(modeloDeVeiculo, capacTanque, litragemAtual);
					} else if (tipoVeiculo == 2) {
						veiculo = new Motocicleta(modeloDeVeiculo, capacTanque, litragemAtual);
					}
					controleDeErro = false;
				} // fim do else
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
				controleDeErro = true;
			}
		} // fim do while de criação do veículo
		controleDeErro = true;

		while (controleDeErro == true) { // while do painel de opções
			try {
				while (acao != 7) {
					acao = Integer.parseInt(JOptionPane.showInputDialog("Situação do veículo: \n" + "Está ligado? "
							+ veiculo.isLigado() + " ;\n" + "Velocidade Atual: " + veiculo.getVelocAtual() + "km/h; \n"
							+ "Tanque de combustível: " + veiculo.getLitragemAtual() + " litros de um total de "
							+ veiculo.getCapacTanque() + " litros possíveis. \n\n"
							+ "Digite a ação que deseja fazer com o seu veículo: \n"
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
				JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
				controleDeErro = true;
			}
		} // fim do while de opções
	} // fim do main

} // fim da classe
