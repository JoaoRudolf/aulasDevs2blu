package telas;

import java.util.List;

import Classes.Disciplina;
import infra.DaoDisciplina;

public class TelaDisciplina {

	public static void criarDisciplina(String nomDics, String nomProf, int qtdAv) {
		Disciplina disciplina = new Disciplina();
		disciplina.setNomDisciplina(nomDics);
		disciplina.setNomProfessor(nomProf);
		disciplina.setQtdAvaliacoes(qtdAv);

		if (new DaoDisciplina().salvar(disciplina)) {
			System.out.println("Disciplina " + disciplina.getNomDisciplina() + " salva com sucesso");
		}

	}
	
	public static void lerTodasDisciplinas() {
		List<Disciplina> listaAluno = new DaoDisciplina().consultaTodos();
		System.out.println("Cod | nome disciplina | nome professor | qtd notas |");

		for (Disciplina a : listaAluno) {
			System.out.printf("%d | %s | %s | %s	\n", a.getCodDisciplina(), a.getNomDisciplina(), a.getNomProfessor(),
					a.getQtdAvaliacoes());
		}
		System.out.println();

		System.out.println("_______ Fim da Consulta atual_______ \n\n");

	}
	
	public static void consultarPorcod(int id) {
		Disciplina a = new DaoDisciplina().consultarPeloId(id);
		System.out.println("Cod | nome disciplina | nome professor | qtd notas |");
		System.out.printf("%d   |	%s	 |  %s     |     %d    |	\n", a.getCodDisciplina(), a.getNomDisciplina(),
				a.getNomProfessor(), a.getQtdAvaliacoes());
	}
	
	public static void chamaUpdate(int id, String nomDisc, String nomProf, int qtdAv) {
		Disciplina disciplina = new DaoDisciplina().consultarPeloId(id);
		disciplina.setNomDisciplina(nomDisc);
		disciplina.setNomProfessor(nomProf);
		disciplina.setQtdAvaliacoes(qtdAv);

		if (new DaoDisciplina().update(disciplina)) {
			System.out.println("Disciplina " + disciplina.getNomDisciplina() + " atualizada com sucesso");
		}

	}
	
	public static void chamaExcluir(int id) {
		Disciplina disciplina = new DaoDisciplina().consultarPeloId(id);
		if (new DaoDisciplina().excluir(disciplina)) {
			System.out.println("Disciplina " + disciplina.getNomDisciplina() + "excluída com sucesso");
		}
	}
}
