import javax.swing.JOptionPane;

public class Programa22 {

	public static void main(String[] args) {

		/*
		 * 22) Crie um aplicativo para gerar uma sequência de números aleatórios como
		 * sugestão para um jogo da mega sena, faça a geração de números (1 a 60) em um
		 * método que trate repetição.
		 */

		int[] vetorJogo = new int[6];
		int entrada, novoSorteio;
		String jogo = "";

		entrada = JOptionPane.showConfirmDialog(null,
				"Deseja sortear uma sequência de números como sugestão para um jogo da Mega Sena?");

		if (entrada == 0) {

			jogo = aposta(vetorJogo);

			JOptionPane.showMessageDialog(null, "A sugestão de jogo é:\n" + jogo);

		} else if (entrada == 1) {

			JOptionPane.showMessageDialog(null, "BYE");

		}

		else {

		}
		do {
			novoSorteio = JOptionPane.showConfirmDialog(null, "Deseja sortear outra sequência de números ?");
			if (novoSorteio == 0) {

				jogo = aposta(vetorJogo);

				JOptionPane.showMessageDialog(null, "A sugestão de jogo é:\n" + jogo);

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
