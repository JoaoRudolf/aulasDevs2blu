package entidadesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import interfaces.InterfaceDAO;
import utils.Conexao;

public class DaoCliente implements InterfaceDAO<Cliente> {

	@Override
	public boolean salvar(Cliente t) {
		Connection con = Conexao.conectar();

		String sql = "insert into cliente(nome, cpf, endereco, telefone) values (?,?,?,?)";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNome());
			stm.setString(2, t.getEndereco());
			stm.setString(3, t.getEndereco());
			stm.setString(4, t.getTelefone());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Cliente t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Cliente t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente retornarUm(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	// _______________begin_retorna todos__________________________________||
	public List<Cliente> retornarTodos() {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "select * from cliente";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));	
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));		
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	// ______________end_retorna_todos______________________________||

}
