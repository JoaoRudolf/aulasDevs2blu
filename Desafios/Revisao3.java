package Desafios;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Revisao3 {

	public static void main(String[] args) {
		int qtdAlunos = 0, qtdNotas = 0;
		boolean erro = true;
		double[][] notasAlunos;
		String[] nomeAlunos;
		double[] totalAluno;
		double[] mediaAluno;
		String[] situacaoAluno;

		while (erro == true) {
			try {
				qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos"));
				qtdNotas = Integer
						.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas a serem digitadas"));
				erro = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Caractere inválido " + e.getMessage());
				erro = true;
			}
		}

		erro = true;
		notasAlunos = new double[qtdAlunos][qtdNotas];
		nomeAlunos = new String[qtdAlunos];
		totalAluno = new double[qtdAlunos];
		mediaAluno = new double[qtdAlunos];
		situacaoAluno = new String[qtdAlunos];

		for (int i = 0; i < qtdAlunos; i++) {
			nomeAlunos[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno");

			for (int j = 0; j < qtdNotas; j++) {

				notasAlunos[i][j] = Double.parseDouble(
						JOptionPane.showInputDialog("Digite a nota nº" + (j + 1) + " do aluno " + nomeAlunos[i] + "."));
				totalAluno[i] += notasAlunos[i][j];

			} // fim do for interno
			mediaAluno[i] = totalAluno[i] / qtdNotas;

			if (mediaAluno[i] >= 7.5 && mediaAluno[i] <= 10) {
				situacaoAluno[i] = "Aprovado";
			} else if (mediaAluno[i] >= 6 && mediaAluno[i] < 7.5) {
				situacaoAluno[i] = "Em recuperação";
			} else if (mediaAluno[i] >= 0 && mediaAluno[i] < 6) {
				situacaoAluno[i] = "Reprovado";
			} else {
				situacaoAluno[i] = "Nota Inválida";
			}

		} // fim do for externo

		for (int i = 0; i < qtdAlunos; i++) {
			System.out.printf("As notas do aluno %s foram: \n", nomeAlunos[i]);
			for (int j = 0; j < qtdNotas; j++) {
				System.out.printf("A %dª nota foi %.2f. \n", j + 1, notasAlunos[i][j]);
			} // fim do for interno
			System.out.printf("A média dele(a) é: %.2f e a situação é %s. \n\n", mediaAluno[i], situacaoAluno[i]);
		} // fim do for externo

	} // fim do main
} // fim da classe
