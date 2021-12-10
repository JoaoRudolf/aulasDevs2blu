package Principal;
import java.time.LocalDate;
import java.time.Month;

import generos.Animal;
import generos.Mamifero;
import generos.Reptil;

public class Zoologico {

	public static void main(String[] args) {
		
		Mamifero girafa = new Mamifero(1234, 15, 2, 'F', LocalDate.of(2020, 05, 05), LocalDate.of(2021, Month.AUGUST, 02), "Pescoçuda", "amarelo com preto", false);	
		Mamifero cavalo = new Mamifero(1355, 15, 2, 'M', LocalDate.of(2015, Month.AUGUST, 05), LocalDate.of(20212, Month.AUGUST, 02), "Pangaré", "marrom", false);

		girafa.listarAninal();
		System.out.println();
		cavalo.listarAninal();
		
		Reptil teste = new Reptil();
		
//		Mamifero gato = new Mamifero();
//		Animal cachorro = new Mamifero();
	}
}
