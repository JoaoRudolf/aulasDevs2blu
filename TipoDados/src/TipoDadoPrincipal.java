import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TipoDadoPrincipal {

	public TipoDadoPrincipal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		String nome;
		int idade;
		char sexo;
		float salario;
		double salarioAnual;
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento  = formatador.parse("24/11/1988");;
		String dataNasc = formatador.format(dataNascimento);



		nome = "joao";
		idade = 45;
		sexo = 'M';
		salario = 1000.00f;
		salarioAnual = 12000;
		
		
		System.out.println("O " + nome + " tem " + idade + " anos, é do sexo " + sexo + " e recebe " + salario + " e por ano " + salarioAnual);
		System.out.println(dataNasc);
		System.out.println(dataNascimento);

		
	}

}
