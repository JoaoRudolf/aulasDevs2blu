package interfaceAula;

public class Modelo {

	public static void main(String[] args) {
		Animal amimal = new Boi();
		System.out.println("O boi faz " + amimal.emitirSom() + " e come " + amimal.tipoAlimento());

		Animal amimal2 = new Gato();
		System.out.println("O gato faz " + amimal2.emitirSom() + " e come " + amimal2.tipoAlimento());

	}

}
