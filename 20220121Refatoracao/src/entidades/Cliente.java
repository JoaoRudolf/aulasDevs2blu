package entidades;

public class Cliente  {
	
	private int id;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	
	
	//===============begin_constructors================================================||
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String cpf, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	
	public Cliente(int id, String nome, String cpf, String endereco, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	//=================_end_constructors_==============================================||

	
	//===========_begin_getters_and_setters============================================||	
	
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
	
	//========end_getters_and_setters===============================================||
	

	
}
