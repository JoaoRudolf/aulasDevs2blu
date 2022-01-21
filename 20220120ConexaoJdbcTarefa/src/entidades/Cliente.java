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
	
	public void excluir(int id) {
		Connection con = Conexao.conectar();

		String sql = "delete from cliente where id = ?";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // fim do método excluir
	
	public void atualizar() {
		Connection con = Conexao.conectar();

		String sql = "update cliente set (?) = (?) where ";

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
	
	

}
