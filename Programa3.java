import javax.swing.JOptionPane;

public class Programa3 {

	public static void main(String[] args) {
		
		int a, b;
		
		String entrada = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		a = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o segundo valor: ");
		b = Integer.parseInt(entrada);
		
		if( a > b) {
			JOptionPane.showMessageDialog(null, "O n�mero maior � " + a);
		}
		else {
			JOptionPane.showMessageDialog(null, "O n�mero maior � " + b);
		}
		
		System.exit(0);

	}

}
