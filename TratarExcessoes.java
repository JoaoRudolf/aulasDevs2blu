
public class TratarExcessoes {

	public static void main(String[] args) {
			divisaoPorZero();
	}
	
	static void divisaoPorZero() {
		
		try {
			int x = 10;
			int y = 0;
			int z = x / y;
		} catch (Exception e) {
			System.out.println("ocorreu um erro porque: " + e.getMessage() + "\n da classe " + e.toString());
			
		}
	}
	
	
}
