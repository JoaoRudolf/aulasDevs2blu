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

//___________ construtores_______________________

	public Aluno() {
	}

	public Aluno(int codAluno, String nomAluno, String nomMae, String nomPai) {
		super();
		this.codAluno = codAluno;
		this.nomAluno = nomAluno;
		this.nomMae = nomMae;
		this.nomPai = nomPai;
	}

	public Aluno(int codAluno, String nomAluno, String nomMae, String nomPai, Date dataNasc, Double medAluno,
			String sitAluno) {
		super();
		this.codAluno = codAluno;
		this.nomAluno = nomAluno;
		this.nomMae = nomMae;
		this.nomPai = nomPai;
		this.dataNasc = dataNasc;
		this.medAluno = medAluno;
		this.sitAluno = sitAluno;
	}

	public Aluno(String nomAluno, String nomMae, String nomPai, Date dataNasc, Double medAluno, String sitAluno) {
		super();
		this.nomAluno = nomAluno;
		this.nomMae = nomMae;
		this.nomPai = nomPai;
		this.dataNasc = dataNasc;
		this.medAluno = medAluno;
		this.sitAluno = sitAluno;
	}

//____________getters e setters____________________

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

	public void setSitAluno(String situacao) {
		this.sitAluno = situacao;
	}

}
