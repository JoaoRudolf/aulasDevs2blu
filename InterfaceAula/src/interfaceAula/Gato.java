package interfaceAula;

public class Gato implements Animal {

	@Override
	public String emitirSom() {
		String som = "miaaaaau";
		return som;
	}

	@Override
	public String tipoAlimento() {
		String tipoAlimento = "petiscos";
		return tipoAlimento;
	}

}
