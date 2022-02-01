package Classes;

import java.sql.Date;

public class Aluno {
	
	private int codAluno;
	private String nomAluno;
	private String nomMae;
	private String nomPai;
	private Date dataNasc;
	private Double medAluno;
	private String sitAluno;
	

	// construtores;
	
	public Aluno() {
    }
	
	// getters e setters?
	
    public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public String getNomAluno() {
		return nomAluno;
	}

	public void setNomAluno(String nomAluno) {
		this.nomAluno = nomAluno;
	}

	public String getNomMae() {
		return nomMae;
	}

	public void setNomMae(String nomMae) {
		this.nomMae = nomMae;
	}

	public String getNomPai() {
		return nomPai;
	}

	public void setNomPai(String nomPai) {
		this.nomPai = nomPai;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Double getMedAluno() {
		return medAluno;
	}

	public void setMedAluno(Double medAluno) {
		this.medAluno = medAluno;
	}

	public String getSitAluno() {
		return sitAluno;
	}

	public void setSitAluno(String sitAluno) {
		this.sitAluno = sitAluno;
	}


	// métodod


	public boolean incluirAluno() {
    	
    	
    	
    	
		return true;
    }

    public void alterarAluno() {
        // TODO implement here
    }

    public void excluirAluno() {
        // TODO implement here
    }

    public void consultarAluno() {
        // TODO implement here
    }

    public void listarAlunos() {
        // TODO implement here
    }

}
