import javax.swing.JOptionPane;

public class Programa16 {

	public static void main(String[] args) {
		
		int i, resultado;

		resultado = numAleatorio();

		String entrada = JOptionPane.showInputDialog("Digite um numero entre 1 e 10");
		i = Integer.parseInt(entrada);

		if (i == resultado) {
			JOptionPane.showMessageDialog(null, "Voc� acertou!!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� errou!!\nO n�mero era: " + resultado);
		}

		System.exit(0);
	}

	public static int numAleatorio() {

		return 1 + (int) (Math.random() * 10);

	}
}