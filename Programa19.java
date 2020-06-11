import javax.swing.JOptionPane;

public class Programa19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 19) Crie um applet que possua um método que receba como parâmetro uma matriz
		 * de inteiros e retorne qual é seu maior elemento. Tal applet deve declarar uma
		 * matriz 4x3 e preenche-la com dados vindo do usuário.
		 */

		int[][] matriz = new int[4][3];

		int i, j;
		int elemento, maior;
		String mostrarMatriz = "";

		for (i = 0; i <= 3; i++) {

			for (j = 0; j <= 2; j++) {

				String entrada = JOptionPane.showInputDialog("Digite o elemento: " + "a" + i + j);
				elemento = Integer.parseInt(entrada);

				matriz[i][j] = elemento;

			}

		}

		for (int a = 0; a <= 3; a++) {

			for (int b = 0; b <= 2; b++) {

				mostrarMatriz = mostrarMatriz + matriz[a][b] + " ";
			}

			mostrarMatriz = mostrarMatriz + "\n";
		}

		JOptionPane.showMessageDialog(null, "A matriz 4x3 é:\n" + mostrarMatriz);

		maior = maiorElemento(matriz);
		JOptionPane.showMessageDialog(null, "O maior elemento é : " + maior);

		System.exit(0);

	}

	public static int maiorElemento(int matriz[][]) {

		int resultado = 0;

		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= 2; j++) {

				if (resultado < matriz[i][j]) {

					resultado = matriz[i][j];

				}

			}

		}
		return resultado;
	}
}
