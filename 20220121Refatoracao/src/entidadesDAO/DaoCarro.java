package entidadesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entidades.Carro;
import interfaces.InterfaceDAO;
import utils.Conexao;

public class DaoCarro implements InterfaceDAO<Carro> {

	public boolean salvar(Carro t) {
		Connection con = Conexao.conectar();

		String sql = "insert into carro(placa, marca, modelo) values (?,?,?)";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getPlaca());
			stm.setString(2, t.getModelo());
			stm.setString(3, t.getMarca());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public boolean update(Carro t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(int id) {
		String sql = "delete from carro where id = ?";

		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, id);
			stm.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean excluir(Carro t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Carro retornarUm(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carro> retornarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
