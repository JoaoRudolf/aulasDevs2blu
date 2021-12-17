package Veiculo;

public abstract class Veiculo {

	public abstract void ligar();
	public abstract void abastecer();
	public abstract void acelerar();
	public abstract void manterVelocidade();
	public abstract void frear();
	public abstract void desligar();
	public abstract boolean isLigado();
	public abstract int getVelocAtual();
	public abstract float getLitragemAtual();
	public abstract float getCapacTanque();
	
}
