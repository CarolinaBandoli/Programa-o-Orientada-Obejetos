import javax.swing.JOptionPane;

public class Programa2 {

	public static void main(String[] args) {
	
		double valor1, valor2, soma, sub, mult, div;

		String entrada = JOptionPane.showInputDialog("Digite um valor: ");
		valor1 = Double.parseDouble(entrada);
		

		entrada = JOptionPane.showInputDialog("Digite outro valor: ");
		valor2 = Double.parseDouble(entrada);
		
		soma = valor1 + valor2;

		sub = valor1 - valor2;

		mult = valor1 * valor2;

		div = valor1 / valor2;

		JOptionPane.showMessageDialog(null, "Soma = " + soma + "\nSubtração = " + sub + "\nMultiplicação = " + mult +"\nDivisão = " + div);

		System.exit(0);
	}

}
