package interfaceAula;

public class Boi implements Animal{

	@Override
	public String emitirSom() {
		String som = "muu";
		return som;
	}

	@Override
	public String tipoAlimento() {
		String tipoAlimento = "capim";
		return tipoAlimento;
	}

}
