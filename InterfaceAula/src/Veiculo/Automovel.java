package Veiculo;

public class Automovel implements Veiculo {

	private int velocidadeAtual;

	public Automovel() {
		// TODO Auto-generated constructor stub
	}

	public Automovel(int velocidadeAtual) {

		this.velocidadeAtual = velocidadeAtual;
	}
	
	public String getVelocidadeAtual() {
		return "A velocidade atual � de " + velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	@Override
	public int acelerar() {
		velocidadeAtual +=  5;
		return velocidadeAtual;
	}

	@Override
	public String abastecer() {
		String abastecer = "O carro est� sendo abastecido";
		return abastecer;
	}

	@Override
	public String frear() {
		String frear = "O carro est� freando";
		return frear;
	}

}
