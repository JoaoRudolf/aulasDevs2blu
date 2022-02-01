package Classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Util.Conexao;

public class MenuPrincipal {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + sdf.format(data));

	}
	
	static void testeConexao() {
		if (Conexao.conectar() != null) {
			System.out.println("conectado");
		} else {
			System.out.println("erro ao conectar");
		}
	}
	
	

}
