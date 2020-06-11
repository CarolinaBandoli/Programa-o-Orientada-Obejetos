import javax.swing.JOptionPane;

public class Programa18 {

	public static void main(String[] args) {

		/*
		 * 18) Crie um aplicativo que preencha um vetor de inteiros (10 posições) com
		 * números aleatórios entre 1 e 100. Tal aplicativo deve pedir para que o
		 * usuário tente adivinhar um dos números contidos no vetor. Se ele adivinhar ou
		 * não deve ser exibido.
		 */

		int[] vetor = new int[10];
		int i, num;
		int acerto = 0;
		String lista = "";

		for (i = 0; i <= 9; i++) {

			vetor[i] = 1 + (int) (Math.random() * 100);

		}

		String entrada = JOptionPane.showInputDialog("Digite um número:");
		num = Integer.parseInt(entrada);

		for (i = 0; i <= 9; i++) {

			if (num == vetor[i]) {

				acerto = num;

			}

			if (i == 0) {

				lista = lista + vetor[i];

			} else {
				lista = lista + ", " + vetor[i];

			}

		}

		if (acerto != 0) {

			JOptionPane.showMessageDialog(null, "Você acertou o número!" + acerto);

		}

		else {
			JOptionPane.showMessageDialog(null, "Você errou o número!\nOs números eram:\n" + lista);
		}
		System.exit(0);

	}

}