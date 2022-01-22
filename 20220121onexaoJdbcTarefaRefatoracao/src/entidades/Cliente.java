package entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.Conexao;

public class Cliente {
	int id;
	String nome;
	String cpf;
	String endereco;
	String telefone;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Cliente(int id, String nome, String cpf, String endereco, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	// métodos abaixo transportar para a classe DaoCliente

	public List<Cliente> consultaTodos() {
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
	} // fim do consulta todos

	public void salvar() {
		Connection con = Conexao.conectar();

		String sql = "insert into cliente(nome, cpf, endereco, telefone) values (?,?,?,?)";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, this.nome);
			stm.setString(2, this.cpf);
			stm.setString(3, this.endereco);
			stm.setString(4, this.telefone);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // fim do método salvar

	public boolean excluir(int id) {
		Connection con = Conexao.conectar();

		String sql = "delete from cliente where id = ?";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	} // fim do método excluir

	public boolean update(int id) {
		Connection con = Conexao.conectar();

		String sql = "update cliente "
				+ "set nome = ?, cpf = ?, endereco = ?, telefone = ?"
				+ "where id = ?";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, this.nome);
			stm.setString(2, this.cpf);
			stm.setString(3, this.endereco);
			stm.setString(4, this.telefone);
			stm.setInt(5, id);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	} // fim do método salvar
	
	
	public Cliente consultaPeloId(int id) {
		Cliente cliente = new Cliente();
		String sql = "select * from carro where id = " + id;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setTelefone(rs.getString("telefone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
		
	} // fim do consultar

}
