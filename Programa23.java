import javax.swing.JOptionPane;

public class Programa23 {

	public static void main(String[] args) {

		/*
		 * 23) Um n�mero perfeito � aquele que � igual � soma de seus divisores.
		 * Exemplo, o n�mero 6 � um n�mero perfeito, pois 1 + 2 + 3 = 6 (os divisores de
		 * 6 s�o: 1, 2 e 3). Outro n�mero perfeito � 28, pois 1 + 2 + 4 + 7 + 14 = 28.
		 * 
		 * 
		 * 
		 * Crie um m�todo que receba um n�mero inteiro e retorne true ou false se esse
		 * n�mero for perfeito ou n�o, respectivamente.
		 * 
		 * 
		 * Crie um applet que, utilizando esse m�todo, exiba todos os n�meros perfeitos
		 * menores que 1000.
		 */

		int i;
		boolean resposta;
		String numerosPerfeitos = "";

		for (i = 1; i < 1000000000; i++) {

			resposta = testeNumPerfeito(i);

			System.out.println("resposta = " + resposta);

			if (resposta) {

				numerosPerfeitos = numerosPerfeitos + " " + i;

			}

		}

		JOptionPane.showMessageDialog(null, "Os n�meros perfeitos menores que 1000 s�o:\n" + numerosPerfeitos);

	}

	public static boolean testeNumPerfeito(int i) {

		boolean perfeito = true;
		int num, resto, soma = 0;

		for (num = 1; num < i - 1; num++) {

			resto = i % num;

			if (resto == 0) {

				soma = soma + num;

			}

		}

		if (i == soma) {

			perfeito = true;

		} 
		
		else {
			
			perfeito = false;
		
		}

		System.out.println("soma = " + soma);
		return perfeito;
	}

}
