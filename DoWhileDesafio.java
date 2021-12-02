package DoWhile;

import javax.swing.JOptionPane;

public class DoWhileDesafio {

	public static void main(String[] args) {
		int opcao = 0;

		do {
			try {
				opcao = Integer.parseInt(
						JOptionPane.showInputDialog("Informe a opção: \n" + 
								"'1' para Incluir;\n" + 
								"'2' para Alterar;\n" + 
								"'3' para Excluir;\n" + 
								"'4' para Consultar;\n" + 
								"'9' para Sair"));

				switch (opcao) {
				case 1:
					JOptionPane.showMessageDialog(null, "Incluído");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Alterado");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Excluído");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Resultado da Consulta");
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
