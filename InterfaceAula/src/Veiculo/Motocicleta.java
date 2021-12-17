package Veiculo;

public class Motocicleta extends Veiculo {

	private String modeloMoto;
	private int velocAtual;
	private float capacTanque, litragemAtual;
	private boolean isLigado = false;

	// construtores:

	public Motocicleta() {

	}

	public Motocicleta(String modelo, float capacTanque, float litragemAtual) {
		super();
		this.modeloMoto = modelo;
		this.velocAtual = 0;
		this.capacTanque = capacTanque;
		this.litragemAtual = litragemAtual;
		this.isLigado = false;
		System.out.printf("Voc� acabou de criar uma motocicleta de modelo %s. Basta ligar e pilotar. \n", modelo);
	}

	// _____ enum ________

	// ____________ getters e setters: ____________

	public String getModeloMoto() {
		return modeloMoto;
	}

	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto = modeloMoto;
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
			System.out.println("B�eeim!! A moto acabou de ser ligada!");
		} else if (isLigado == true) {
			System.out.println("A moto j� est� ligada, senhor motociclista");
		} else if (litragemAtual <= 2) {
			System.out.println("Abaste�a a moto antes de dar a partida para evitar danos � bomba de combust�vel");
		}
	}

	@Override
	public void abastecer() {
		litragemAtual = capacTanque;
		System.out.println("Tanque cheio, carteira vazia =)");
	}

	@Override
	public void desligar() {
		if (velocAtual == 0) {
			isLigado = false;
			System.out.println("Carro desligado.");
		} else {
			System.out.println("O carro s� pode ser desligado se estiver parado!");
		}
		informaVelocidade();
		informaLitragem();

	}

	@Override
	public void acelerar() {
		if (isLigado && litragemAtual > 5 && (velocAtual + 10) < 60) {
			velocAtual += 10;
			litragemAtual--;
			informaVelocidade();
			informaLitragem();
		} else if (!isLigado) {
			System.out.println("A moto est� desligada e n�o pode ser acelerada.");
		} else if (litragemAtual <= 0) {
			System.out.println("A moto est� sem combust�vel, pane seca");
		} else if (velocAtual + 10 >= 60) {
			System.out.println("N�o pode acelerar mais, sen�o ultrapassar� a velocidade m�xima.");

		}
	}

	@Override
	public void manterVelocidade() {
		if (isLigado && litragemAtual > 0) {
			litragemAtual--;
			informaVelocidade();
			informaLitragem();
			if (litragemAtual <= 5) {
				System.out.println("O tanque est� na reseva, favor abastecer");

			}
		} else if (litragemAtual == 0) {
			System.out.println("O ve�culo est� sem combust�vel, pane seca");
		}
	}

	public void frear() {
		if (isLigado && velocAtual >= 10) {
			velocAtual -= 10;
		} else {
			velocAtual = 0;
		}

		if (isLigado && litragemAtual > 0) {
			litragemAtual--;
			informaVelocidade();
			informaLitragem();
			if (litragemAtual <= 5) {
				System.out.println("O tanque est� na reseva, favor abastecer");
			}

		} else if (litragemAtual <= 0) {
			System.out.println("A moto est� sem combust�vel, pane seca");
			velocAtual = 0;
			informaVelocidade();
			informaLitragem();
		} else if (!isLigado) {
			System.out.println("A moto est� desligada e n�o pode ser freado" + ".");
		}
	}

	private void informaVelocidade() {
		System.out.print("A velocidade atual � de " + velocAtual + " quil�metros por hora. ");
	}

	private void informaLitragem() {
		System.out.println("Atualmente o tanque tem " + litragemAtual + " litros");
	}

}
