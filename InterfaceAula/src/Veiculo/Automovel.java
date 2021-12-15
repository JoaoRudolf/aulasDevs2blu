package Veiculo;

public class Automovel implements Veiculo {

	private String modeloVeiculo;
	private int velocAtual;
	private float capacTanque, litragemAtual;
	private boolean isLigado = false;

	// construtores:

	public Automovel() {

	}

	public Automovel(String modelo, float capacTanque, float litragemAtual) {
		super();
		this.modeloVeiculo = modelo;
		this.velocAtual = 0;
		this.capacTanque = capacTanque;
		this.litragemAtual = litragemAtual;
		this.isLigado = false;
		System.out.printf("Voc� acabou de criar um autom�vel de modelo %s. Basta ligar e dirigir. \n", modelo);
	}

	// _____ enum ________

	// ____________ getters e setters: ____________

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public int getVelocAtual() {
		return velocAtual;
	}

	public void setVelocAtual(int velocAtual) {
		this.velocAtual = velocAtual;
	}

	public float getCapacTanque() {
		return capacTanque;
	}

	public void setCapacTanque(float capacTanque) {
		this.capacTanque = capacTanque;
	}

	public float getLitragemAtual() {
		return litragemAtual;
	}

	public void setLitragemAtual(float litragemAtual) {
		this.litragemAtual = litragemAtual;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean ligado) {
		this.isLigado = ligado;
	}

	// _______________ m�todos: _______________

	@Override
	public void ligar() {
		if (isLigado == false && this.litragemAtual > 2) {
			this.isLigado = true;
			System.out.println("Vrrum!! O carro acabou de ser ligado!");
		} else if (isLigado == true) {
			System.out.println("O Carro j� est� ligado, senhor motorista");
		} else if (litragemAtual <= 2) {
			System.out.println("Abaste�a o carro antes de dar a partida para evitar danos � bomba de combust�vel");
		}
	}

	@Override
	public void desligar() {
		if (velocAtual == 0) {

		}

	}

	@Override
	public void acelerar() {
		if (isLigado && litragemAtual > 5 && (velocAtual + 10) < 60) {
			velocAtual += 10;
			litragemAtual--;
			informaVelocidade();
			informaLitragem();
		} else if (!isLigado) {
			System.out.println("O carro est� desligado e n�o pode ser acelerado.");
		} else if (litragemAtual <= 0) {
			System.out.println("O ve�culo est� sem combust�vel, pane seca");
		} else if (velocAtual + 10 >= 60) {
			System.out.println("N�o pode acelerar mais, sen�o ultrapassar� a velocidade m�xima.");

		}
	}

	public void frear() {
		if (velocAtual >= 10) {
			velocAtual -= 10;
		} else {
			velocAtual = 0;
		}

		if (litragemAtual > 0) {
			litragemAtual--;
			informaVelocidade();
			informaLitragem();
			if (litragemAtual <= 5) {
				System.out.println("O tanque est� na reseva, favor abastecer");
			}

		} else if (litragemAtual <= 0) {
			System.out.println("O ve�culo est� sem combust�vel, pane seca");
			velocAtual = 0;
			informaVelocidade();
			informaLitragem();
		}
	}

	private void informaVelocidade() {
		System.out.print("A velocidade atual � de " + velocAtual + " quil�metros por hora. ");
	}

	@Override
	public void abastecer() {
		litragemAtual = capacTanque;
	}

	private void informaLitragem() {
		System.out.println("Atualmente o tanque tem " + litragemAtual + " litros");
	}

}
