package DoWhile;

import javax.swing.JOptionPane;

public class DoWhileTeoria {

	public static void main(String[] args) {
		int opcao = 1;

		do {
			try {
				opcao = Integer.parseInt(
						JOptionPane.showInputDialog("Informe a opção: \n" + "'1' para incluir;\n" + "'9' para sair"));

				switch (opcao) {
				case 1:
					JOptionPane.showMessageDialog(null, "Incluir");
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Hasta la vista, baby");
					break;
				default:
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Caractere informado inválido: " + e.getMessage());
			}

		} while (opcao != 9);
	}

}
