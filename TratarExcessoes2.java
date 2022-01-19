
public class TratarExcessoes2 {

	public static void main(String[] args) {
		carros();
		

	}

	static void carros() {
		String[] vagas = { "Fusca", "Kombi", "TL", "Brasilia" };
		try {
			System.out.println(vagas[4]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fim do programa");
	}
	
	



}
