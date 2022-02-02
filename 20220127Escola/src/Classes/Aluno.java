package Classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Util.Conexao;

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
	
	public Aluno(String nomAluno, String nomMae, String nomPai, Date dataNasc, Double medAluno,
			String sitAluno) {
		super();
		this.nomAluno = nomAluno;
		this.nomMae = nomMae;
		this.nomPai = nomPai;
		this.dataNasc = dataNasc;
		this.medAluno = medAluno;
		this.sitAluno = sitAluno;
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

	public void setSitAluno(String situacao) {
		this.sitAluno = situacao;
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



    public void salvar() {
		Connection con = Conexao.conectar();

		String sql = """
				insert into aluno(nomaluno, nommae, nompai, dataNasc, medaluno, sitaluno) 
				values (?,?,?,?,?,?)
				""";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, this.nomAluno);
			stm.setString(2, this.nomMae);
			stm.setString(3, this.nomPai);
			stm.setDate(4, this.dataNasc);
			stm.setDouble(5, this.medAluno);
			stm.setString(6, this.sitAluno);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // fim do método salvar

}
