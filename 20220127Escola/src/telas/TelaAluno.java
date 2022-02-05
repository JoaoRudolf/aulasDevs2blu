package telas;

import java.sql.Date;
import java.util.List;

import Classes.Aluno;
import infra.DaoAluno;

public class TelaAluno {

	public static void criarAluno(String nome, String nomMae, String nomPai, Date dataNasc, Double media, String situacao) {
		Aluno aluno = new Aluno();
		aluno.setNomAluno(nome);
		aluno.setNomMae(nomMae);
		aluno.setNomPai(nomPai);
		aluno.setDataNasc(dataNasc);
		aluno.setMedAluno(media);
		aluno.setSitAluno(situacao);

		if (new DaoAluno().salvar(aluno)) {
			System.out.println("Aluno " + aluno.getNomAluno() + " salvo com sucesso");
		}

	}
	
	public static void lerTodosAluno() {
		List<Aluno> listaAluno = new DaoAluno().consultaTodos();
		System.out.println("Cod | nome | nome mãe | nome pai |");

		for (Aluno a : listaAluno) {
			System.out.printf("%d | %s | %s | %s	\n", a.getCodAluno(), a.getNomAluno(), a.getNomMae(),
					a.getNomPai());
		}
		System.out.println();

		System.out.println("_______ Fim da Consulta atual_______ \n\n");

	}
	
	public static void consultarPorcod(int id) {
		Aluno a = new DaoAluno().consultarPeloId(id);
		System.out.println("Cod   | nome     |    nome mãe   |    nome pai |");
		System.out.printf("%d   |	%s	 |  %s     |     %s    |	\n", a.getCodAluno(), a.getNomAluno(),
				a.getNomMae(), a.getNomPai());
	}
	
	public static void chamaUpdate(int id, String nomealuno, String nommae, String nompai) {
		Aluno aluno = new DaoAluno().consultarPeloId(id);
		aluno.setNomAluno(nomealuno);
		aluno.setNomMae(nommae);
		aluno.setNomPai(nompai);

		if (new DaoAluno().update(aluno)) {
			System.out.println("Aluno " + aluno.getNomAluno() + " atualizado com sucesso");
		}

	}
	
	public static void chamaExcluir(int id) {
		Aluno aluno = new DaoAluno().consultarPeloId(id);
		if (new DaoAluno().excluir(aluno)) {
			System.out.println("Aluno " + aluno.getNomAluno() + "excluído com sucesso");
		}
	}
}
