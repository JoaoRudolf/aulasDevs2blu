import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class TratarExcessoes3 {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[5];
		boolean erro = true;

		for (int i = 0; i < pessoas.length; i++) {
			String nome = null;
			int idade = 0;

			while (erro == true) {
				try {
					nome = JOptionPane.showInputDialog("informe o " + (i + 1) + "° nome");
					idade = Integer.parseInt(JOptionPane.showInputDialog("informe a " + (i + 1) + "ª idade"));
					erro = false;
				} catch (HeadlessException e) {
					System.out.println("aaaa " + e.getMessage());
					erro = true;
				} catch (NumberFormatException e) {
					System.out.println("aaaa " + e.getMessage());
					erro = true;
				}
			}

			erro = true;
			Pessoa pessoa = new Pessoa(nome, idade);
			pessoas[i] = pessoa;
		}

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i].getIdade() + pessoas[i].getNome());
		}

	}
}
