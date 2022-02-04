package Classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.Conexao;

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

//___________métododos___________________

	public void update(int id, String nomAluno, String nomMae, String nomPai) {
		Connection con = Conexao.conectar();

		String sql = """
				update aluno 
				set nomaluno = ?,  nommae = ?, nompai = ?
				where codaluno = ?
			
				""";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, nomAluno);
			stm.setString(2, nomMae);
			stm.setString(3, nomPai);
//			stm.setDate(4, this.dataNasc);
//			stm.setDouble(5, this.medAluno);
//			stm.setString(6, this.sitAluno);
			stm.setInt(4, id);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // fim do método update
	
	public boolean excluir(int id) {
		Connection con = Conexao.conectar();

		String sql = "delete from aluno where codaluno = ?";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	} // fim do método excluir

	public boolean salvar() {
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
			return false;
		}
		return true;
	} // fim do método salvar

	public List<Aluno> consultaTodos() {
		List<Aluno> alunos = new ArrayList<>();
		String sql = "select * from aluno";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setCodAluno(rs.getInt("codaluno"));
				aluno.setNomAluno(rs.getString("nomAluno"));
				aluno.setNomMae(rs.getString("nomMae"));
				aluno.setNomPai(rs.getString("nomPai"));
				aluno.setDataNasc(rs.getDate("dataNasc"));
				aluno.setMedAluno(rs.getDouble("medaluno"));
				aluno.setSitAluno(rs.getString("sitAluno"));
				alunos.add(aluno);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return alunos;
	} // fim do consulta todos
	
	public Aluno consultaPeloId(int id) {
		Aluno aluno = new Aluno();
		String sql = "select * from aluno where codaluno = " + id;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				aluno.setCodAluno(rs.getInt("codaluno"));
				aluno.setNomAluno(rs.getString("nomaluno"));
				aluno.setNomMae(rs.getString("nommae"));
				aluno.setNomPai(rs.getString("nompai"));
				aluno.setDataNasc(rs.getDate("datanasc"));
				aluno.setMedAluno(rs.getDouble("medaluno"));
				aluno.setSitAluno(sql);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aluno;
		
	} // fim do consultar por id

}
