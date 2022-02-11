package Classes;

import java.sql.Date;

public class Matricula {
    private int codAluno;
    private int codDisciplina;
    private Date dtMatricula;
    private char statusMatricula;

    // construtores:
    
    public Matricula() {
		// TODO Auto-generated constructor stub
	}
    
    // getters e setters
    
    public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public Date getDtMatricula() {
		return dtMatricula;
	}

	public void setDtMatricula(Date dtMatricula) {
		this.dtMatricula = dtMatricula;
	}

	public char getStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(char statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
    
	
	// métodos:
    
    
    public void incluirMatricula() {
        // TODO implement here
    }


    public void excluirMatricula() {
        // TODO implement here
    }


    public void consultarMatricula() {
        // TODO implement here
    }


    public void listarMatriculas() {
        // TODO implement here
    }

	

    
    
    
}