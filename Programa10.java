import javax.swing.JOptionPane;

public class Programa10 {

	public static void main(String[] args) {

		int a, b, c;
		double delta;
		double x1 = 0;
		double x2 = 0;

		String entrada = JOptionPane.showInputDialog("Digite o valor de 'a' ");
		a = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite o valor de 'b' ");
		b = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite o valor de 'c' ");
		c = Integer.parseInt(entrada);

		delta = (Math.pow(b, 2)) - (4 * a * c);

		if (delta < 0) {
			JOptionPane.showMessageDialog(null,"Impossível calcular!");

		}
		else {

			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null,"As raizes sao:\nx1 = " + x1 + "\nx2 = " + x2);

		}

		System.exit(0);

	}

}