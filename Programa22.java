import javax.swing.JOptionPane;

public class Programa22 {

	public static void main(String[] args) {

		/*
		 * 22) Crie um aplicativo para gerar uma sequ�ncia de n�meros aleat�rios como
		 * sugest�o para um jogo da mega sena, fa�a a gera��o de n�meros (1 a 60) em um
		 * m�todo que trate repeti��o.
		 */

		int[] vetorJogo = new int[6];
		int entrada, novoSorteio;
		String jogo = "";

		entrada = JOptionPane.showConfirmDialog(null,
				"Deseja sortear uma sequ�ncia de n�meros como sugest�o para um jogo da Mega Sena?");

		if (entrada == 0) {

			jogo = aposta(vetorJogo);

			JOptionPane.showMessageDialog(null, "A sugest�o de jogo �:\n" + jogo);

		} else if (entrada == 1) {

			JOptionPane.showMessageDialog(null, "BYE");

		}

		else {

		}
		do {
			novoSorteio = JOptionPane.showConfirmDialog(null, "Deseja sortear outra sequ�ncia de n�meros ?");
			if (novoSorteio == 0) {

				jogo = aposta(vetorJogo);

				JOptionPane.showMessageDialog(null, "A sugest�o de jogo �:\n" + jogo);

			} else if (novoSorteio == 1) {

				JOptionPane.showMessageDialog(null, "BYE");

			}

			else {

			}

		} while (novoSorteio == 0);
	}

	public static String aposta(int[] vetorJogo) {

		String jogoPronto = "";

		for (int i = 0; i <= 5; i++) {

			vetorJogo[i] = 1 + (int) (Math.random() * 60);
			jogoPronto = jogoPronto + " " + vetorJogo[i];

		}

		return jogoPronto;
	}

}
