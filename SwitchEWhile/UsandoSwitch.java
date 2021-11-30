package SwitchEWhile;
import javax.swing.JOptionPane;

public class UsandoSwitch {

	public static void main(String[] args) {
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção"));
		
		switch (opcao) {
		case 1:
			System.out.println("Inclusão");
			JOptionPane.showMessageDialog(null, "opção 1", "Opção escolhida", opcao);
			break;
		case 2:
			System.out.println("Alteração");
			break;
		case 3:
			System.out.println("Exclusão");
			break;
		case 4:
			System.out.println("Consulta");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida");
			break;
		}
	}
}
