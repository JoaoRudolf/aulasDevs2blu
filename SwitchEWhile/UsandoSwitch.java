package SwitchEWhile;
import javax.swing.JOptionPane;

public class UsandoSwitch {

	public static void main(String[] args) {
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o"));
		
		switch (opcao) {
		case 1:
			System.out.println("Inclus�o");
			JOptionPane.showMessageDialog(null, "op��o 1", "Op��o escolhida", opcao);
			break;
		case 2:
			System.out.println("Altera��o");
			break;
		case 3:
			System.out.println("Exclus�o");
			break;
		case 4:
			System.out.println("Consulta");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			break;
		}
	}
}
