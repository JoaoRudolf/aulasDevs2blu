package Veiculo;

public class Pista {

	public static void main(String[] args) {
		Automovel carro = new Automovel(0);
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		System.out.println(carro.getVelocidadeAtual());
		

//		System.out.println(carro);
//
//		Veiculo moto = new Motocicleta();
//		System.out.println(moto.acelerar());

	}

}
