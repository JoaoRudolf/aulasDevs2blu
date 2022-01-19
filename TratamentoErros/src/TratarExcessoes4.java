import javax.swing.JOptionPane;

public class TratarExcessoes4 {

	public static void main(String[] args) {
		digitaNomeIdade();
	
	}
	
	static void digitaNomeIdade() {
		String nome = JOptionPane.showInputDialog("informe o nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("informe o nome")) ;
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
