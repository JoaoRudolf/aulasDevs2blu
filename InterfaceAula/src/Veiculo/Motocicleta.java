package Veiculo;

public class Motocicleta implements Veiculo {

	private int velocidadeAtual = 0;

	public Motocicleta() {
		// TODO Auto-generated constructor stub
	}

	public Motocicleta(int velocidadeAtual) {
		super();
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getVelocidadeAtual() {
		return "A velocidade atual é de " + velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	@Override
	public int acelerar() {
		return velocidadeAtual + 7;
	}

	@Override
	public String abastecer() {
		String abastecer = "A motocicleta  sendo abastecido";
		return abastecer;
	}

	@Override
	public String frear() {
		String frear = "A motocicleta está freando";
		return frear;
	}
}
