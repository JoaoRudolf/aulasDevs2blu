import java.time.Month;

public class Zoologico {

	public static void main(String[] args) {
		
		Cadastro cadastro1 = new Cadastro(1234, 15, 2, 'M', 'F', null, null, "pescoçuda", "amarelo com preto", false);
		Cadastro cadastro2 = new Cadastro();
		cadastro2.setCodigoAnimal(1235);
		cadastro2.setIdadeAnimal(6);
		cadastro2.setQtdFilhotes3(0);
		cadastro2.setTipoAnimal('R');
		cadastro2.setSexo('F');
		cadastro2.setDataChegada(null);

		cadastro2.listarAninal();
	}
}
