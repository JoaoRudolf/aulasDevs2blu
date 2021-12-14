package construtorAula;

public class AlunoMain {
	
	public static void main(String[] args) {
		Aluno alu = new Aluno( (float) 6.0, (float) 7.0, (float) 7.86565, (float) 10.0);
		
		System.out.println(Math.round(alu.calculaMedia()));
	}
	
}
