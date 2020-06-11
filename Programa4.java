import javax.swing.JOptionPane;

public class Programa4 {

	public static void main(String[] args) {
		
		int num;
		double qdr = 0;
		
		String entrada = JOptionPane.showInputDialog("Digite um núemro: ");
		num = Integer.parseInt(entrada);
		
		while ( num >= 1 ) {
			
			qdr = Math.pow(num, 2);
			JOptionPane.showMessageDialog(null, "O quadrado de " + num + " é: " + qdr);
			num = num - 1;
		
		}
		System.exit(0);
	}

}
