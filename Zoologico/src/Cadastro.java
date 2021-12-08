import java.time.LocalDate;
import java.util.Date;

public class Cadastro {

	private int codigoAnimal, idadeAnimal, qtdFilhotes3;
	private char tipoAnimal, sexo;
	private LocalDate dataChegada, dataLiberacao;
	private String apelido, padraoCorPelo;
	private boolean filhote;

	public Cadastro() {

	}

	public Cadastro(int codigoAnimal, int idadeAnimal, int qtdFilhotes3, char tipoAnimal, char sexo,
			LocalDate dataChegada, LocalDate dataLiberacao, String apelido, String padraoCorPelo, boolean filhote) {
		super();
		this.codigoAnimal = codigoAnimal;
		this.idadeAnimal = idadeAnimal;
		this.qtdFilhotes3 = qtdFilhotes3;
		this.tipoAnimal = tipoAnimal;
		this.sexo = sexo;
		this.dataChegada = dataChegada;
		this.dataLiberacao = dataLiberacao;
		this.apelido = apelido;
		this.padraoCorPelo = padraoCorPelo;
		this.filhote = filhote;
	}

	public void listarAninal() {
		System.out.println("código: " + codigoAnimal);
		System.out.println("apelido: " + apelido);
		System.out.println("tipo: " + tipoAnimal);
		System.out.println("data da chegada" + dataChegada);
	}

	public int getCodigoAnimal() {
		return codigoAnimal;
	}

	public void setCodigoAnimal(int codigoAnimal) {
		this.codigoAnimal = codigoAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public int getQtdFilhotes3() {
		return qtdFilhotes3;
	}

	public void setQtdFilhotes3(int qtdFilhotes3) {
		this.qtdFilhotes3 = qtdFilhotes3;
	}

	public char getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(char tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getPadraoCorPelo() {
		return padraoCorPelo;
	}

	public void setPadraoCorPelo(String padraoCorPelo) {
		this.padraoCorPelo = padraoCorPelo;
	}

	public boolean isFilhote() {
		return filhote;
	}

	public void setFilhote(boolean filhote) {
		this.filhote = filhote;
	}

	public LocalDate getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(LocalDate dataChegada) {
		this.dataChegada = dataChegada;
	}

	public LocalDate getDataLiberacao() {
		return dataLiberacao;
	}

	public void setDataLiberacao(LocalDate dataLiberacao) {
		this.dataLiberacao = dataLiberacao;
	}

	
}
