import javax.swing.JOptionPane;

public class Programa23 {

	public static void main(String[] args) {

		/*
		 * 23) Um número perfeito é aquele que é igual à soma de seus divisores.
		 * Exemplo, o número 6 é um número perfeito, pois 1 + 2 + 3 = 6 (os divisores de
		 * 6 são: 1, 2 e 3). Outro número perfeito é 28, pois 1 + 2 + 4 + 7 + 14 = 28.
		 * 
		 * 
		 * 
		 * Crie um método que receba um número inteiro e retorne true ou false se esse
		 * número for perfeito ou não, respectivamente.
		 * 
		 * 
		 * Crie um applet que, utilizando esse método, exiba todos os números perfeitos
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

		JOptionPane.showMessageDialog(null, "Os números perfeitos menores que 1000 são:\n" + numerosPerfeitos);

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
