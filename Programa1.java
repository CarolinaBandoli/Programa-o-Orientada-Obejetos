import javax.swing.JOptionPane;

public class Programa1 {

	public static void main(String[] args) {

		String nome;
		int idade;

		String entrada = JOptionPane.showInputDialog("Digite seu nome: ");
		nome =  (entrada);

		entrada = JOptionPane.showInputDialog("Digite seu idade: ");
		idade = Integer.parseInt(entrada);

		JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + " \nSua idade é:  " + idade);

		System.exit(0);

	}

}
