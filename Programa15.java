import javax.swing.JOptionPane;

public class Programa15 {

	public static void main(String[] args) {

		int num, i;

		num = 1 + (int) (Math.random() * 10);

		String entrada = JOptionPane.showInputDialog("Digite um numero entre 1 e 10");
		i = Integer.parseInt(entrada);

		if (i == num) {
			JOptionPane.showMessageDialog(null, "Voc� acertou!!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� errou!!\nO n�mero era: " + num);
		}

		System.exit(0);

	}

}