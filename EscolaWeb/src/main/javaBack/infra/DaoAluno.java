package infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Classes.Aluno;
import Util.Conexao;
import interfaces.InterfaceDAO;

public class DaoAluno implements InterfaceDAO<Aluno> {
	
	// métodos que comunicam com o banco de dados:

	@Override
	public boolean salvar(Aluno t) {
		Connection con = Conexao.conectar();

		String sql = """
				insert into aluno(nomaluno, nommae, nompai, dataNasc, medaluno, sitaluno)
				values (?,?,?,?,?,?)
				""";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNomAluno());
			stm.setString(2, t.getNomMae());
			stm.setString(3, t.getNomPai());
			stm.setDate(4, t.getDataNasc());
			stm.setDouble(5, t.getMedAluno());
			stm.setString(6, t.getSitAluno());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Aluno t) {
		Connection con = Conexao.conectar();

		String sql = """
				update aluno 
				set nomaluno = ?,  nommae = ?, nompai = ?
				where codaluno = ?
			
				""";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNomAluno());
			stm.setString(2, t.getNomMae());
			stm.setString(3, t.getNomPai());
//			stm.setDate(4, this.dataNasc);
//			stm.setDouble(5, this.medAluno);
//			stm.setString(6, this.sitAluno);
			stm.setInt(4, t.getCodAluno());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(Aluno t) {
		Connection con = Conexao.conectar();

		String sql = "delete from aluno where codaluno = ?";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, t.getCodAluno());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Aluno consultarPeloId(int id) {
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
	}

	@Override
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
	}
	
	
}
