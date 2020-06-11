import javax.swing.JOptionPane;

public class Programa20 {

	public static void main(String[] args) {
		/*
		 * 20) Crie um applet que possua um método que receba como parâmetro uma matriz
		 * de inteiros, que deve ser 3x3 e seu preenchimento deve feito pelo usuário.
		 * Tal applet deve possuir um método que retorne um vetor formado pela primeira
		 * linha da matriz (linha 0) e outro método que retorne a soma dos elementos que
		 * estão acima da diagonal principal, com um menu para a escolha de qual método
		 * deve ser utilizado.
		 */

		int[][] matriz = new int[3][3];

		String entrada = "";
		int elemento = 0;
		int escolha = 0;
		int erro = 0;

		for (int i = 0; i <= 2; i++) {

			for (int j = 0; j <= 2; j++) {

				entrada = JOptionPane.showInputDialog("Digite o elemento a" + i + j);
				elemento = Integer.parseInt(entrada);
				matriz[i][j] = elemento;
			}

		}

		do {
			if (erro == 0) {
				entrada = JOptionPane.showInputDialog(
						"Deseja mostrar qual método?\n1-Vetor da primeira linha.\n2-Soma dos elementos acima da diagonal principal\n3-Saída");
				escolha = Integer.parseInt(entrada);
			}
			switch (escolha) {

			case 1:
				// metodo vetor 1ª linha
				String vetor = vetorLinha(matriz);

				JOptionPane.showMessageDialog(null, "O vetor formado pela 1ª linha da matriz é:\n " + vetor);
				erro = 0;
				
				break;

			case 2:
				// metodo soma

				int soma = somaDiagonal(matriz);
				JOptionPane.showMessageDialog(null, "A soma dos elemntos acima da diagonal principal é:\n " + soma);
				erro = 0;
				
				break;

			case 3:
				// saida

				JOptionPane.showMessageDialog(null, "BYE");

				break;

			default:
				// erro
				do {

					if (escolha != 1 && escolha != 2 && escolha != 3) {

						JOptionPane.showMessageDialog(null, "Opção inválida");
						entrada = JOptionPane.showInputDialog(
								"Deseja mostrar qual método?\n1-Vetor da primeira linha.\n2-Soma dos elementos acima da diagonal principal\n3-Saída");
						escolha = Integer.parseInt(entrada);
						erro = 1;

					}
					else {
						
						erro = 0;
						
					}
				} while (escolha != 1 && escolha != 2 && escolha != 3);

			}

			// entrada = JOptionPane.showInputDialog(
			// "Deseja mostrar qual método?\n1-Vetor da primeira linha.\n2-Soma dos
			// elementos acima da diagonal principal\n3-Saída");
			// escolha = Integer.parseInt(entrada);
		} while (escolha == 1 || escolha == 2);

		System.exit(0);
	}

	// metodo vetor 1ª linha

	public static String vetorLinha(int matriz[][]) {

		int[] vetor = new int[3];

		String vetorString = "";

		for (int a = 0; a <= 2; a++) {

			vetor[a] = matriz[0][a];
			vetorString = vetorString + vetor[a] + " ";
		}

		return vetorString;
	}

	// soma dos elementos acima da diagonal principal 
	
	public static int somaDiagonal(int matriz[][]) {

		int soma = 0;
		int n = 0;

		for (int a = 0; a <= 2; a++) {

			for (int b = n; b <= 2; b++) {

				soma = soma + matriz[a][b];

			}

			n = n + 1;

		}

		return soma;

	}
}
