package entidadesDao;

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
		String sql = "insert into cliente(nome, cpf, endereco, telefone) values(?,?,?,?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNome());
			stm.setString(2, t.getCpf());
			stm.setString(3, t.getEndereco());
			stm.setString(3, t.getTelefone());
			stm.execute();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	@Override
	public boolean update(Cliente t) {
		Connection con = Conexao.conectar();		
		String sql = "update cliente set nome = ?, cpf = ?, endereco = ?, telefone = ?";
		sql += " where id = ?";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNome());
			stm.setString(2, t.getCpf());
			stm.setString(3, t.getEndereco());
			stm.setString(3, t.getTelefone());
			stm.setInt(4, t.getId());
			
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(int id) {
	    String sql = "delete from carro where id = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
		   e.printStackTrace();
		}		
		return true;
	}

	@Override
	public boolean excluir(Cliente t) {
		String sql = "delete from cliente where id = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, t.getId());
			stm.execute();
		} catch (SQLException e) {
		   e.printStackTrace();
		}		
		return true;
	}

	public Cliente retornarUm(int id) {
		Cliente cliente = null;
		String sql = "select * from cliente where id = " + id;
		try {
			PreparedStatement stm  = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
			 cliente = new Cliente(rs.getInt("id"), 
					           rs.getString("nome"),
					           rs.getString("cpf"),
					           rs.getString("endereco"),
					           rs.getString("telefone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return cliente;
	}

	@Override
	public List<Cliente> retornarTodos() {
		List<Cliente> carros = new ArrayList<>();
		String sql = "select * from cliente";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				/*Carro carro = new Carro();
				carro.setId(rs.getInt("id"));	
				carro.setPlaca(rs.getString("placa"));
				carro.setMarca(rs.getString("marca"));
				carro.setModelo(rs.getString("modelo"));
				carros.add(carro);*/
				carros.add(new Cliente(rs.getInt("id"), 
				           rs.getString("nome"),
				           rs.getString("cpf"),
				           rs.getString("endereco"),
				           rs.getString("telefone")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return carros;
	}

	
}
