package infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Classes.Disciplina;
import Util.Conexao;
import interfaces.InterfaceDAO;

public class DaoDisciplina implements InterfaceDAO<Disciplina> {

	@Override
	public boolean salvar(Disciplina t) {
		Connection con = Conexao.conectar();

		String sql = """
				insert into disciplina(nomdisciplina, nomprofessor, qtdavaliacoes)
				values (?,?,?)
				""";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNomDisciplina());
			stm.setString(2, t.getNomProfessor());
			stm.setInt(3, t.getQtdAvaliacoes());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Disciplina t) {
//		Connection con = Conexao.conectar();
//
//		String sql = """
//				update aluno 
//				set nomaluno = ?,  nommae = ?, nompai = ?
//				where codaluno = ?
//			
//				""";
//
//		try {
//			PreparedStatement stm = con.prepareStatement(sql);
//			stm.setString(1, t.getNomAluno());
//			stm.setString(2, t.getNomMae());
//			stm.setString(3, t.getNomPai());
////			stm.setDate(4, this.dataNasc);
////			stm.setDouble(5, this.medAluno);
////			stm.setString(6, this.sitAluno);
//			stm.setInt(4, t.getCodAluno());
//			stm.execute();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return true;
	}

	@Override
	public boolean excluir(Disciplina t) {
//		Connection con = Conexao.conectar();
//
//		String sql = "delete from aluno where codaluno = ?";
//
//		try {
//			PreparedStatement stm = con.prepareStatement(sql);
//			stm.setInt(1, t.getCodAluno());
//			stm.execute();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return true;
	}

	@Override
	public Disciplina consultarPeloId(int id) {
		Disciplina aluno = new Disciplina();
//		String sql = "select * from aluno where codaluno = " + id;
//		try {
//			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
//			ResultSet rs = stm.executeQuery();
//			if (rs.next()) {
//				aluno.setCodAluno(rs.getInt("codaluno"));
//				aluno.setNomAluno(rs.getString("nomaluno"));
//				aluno.setNomMae(rs.getString("nommae"));
//				aluno.setNomPai(rs.getString("nompai"));
//				aluno.setDataNasc(rs.getDate("datanasc"));
//				aluno.setMedAluno(rs.getDouble("medaluno"));
//				aluno.setSitAluno(sql);				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return aluno;
	}

	@Override
	public List<Disciplina> consultaTodos() {
		List<Disciplina> disciplinas = new ArrayList<>();
		String sql = "select * from disciplina";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				Disciplina disciplina = new Disciplina();
				disciplina.setCodDisciplina(rs.getInt("coddisciplina"));
				disciplina.setNomDisciplina(rs.getString("nomdisciplina"));
				disciplina.setNomProfessor(rs.getString("nomprofessor"));
				disciplina.setQtdAvaliacoes(rs.getInt("qtdavaliacoes"));
				disciplinas.add(disciplina);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return disciplinas;
	}

}
