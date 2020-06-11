import javax.swing.JOptionPane;

public class Programa21 {

	public static void main(String[] args) {


		int[] vetor = new int[15];
		int[] vetorMultiplicacao = new int[15];

		String vetorOriginal = "";
		String vetorResultado = "";

		int fator = 0;
		int escolha = 0;
		int resultado = 0;

		// montagem do vetor randomicamente

		for (int i = 0; i <= 14; i++) {

			vetor[i] = (int) (Math.random() * 10);

			vetorOriginal = vetorOriginal + " " + vetor[i];

		}

		JOptionPane.showMessageDialog(null, "O vetor montado foi:\n" + vetorOriginal);

		// entrada do fator multiplicação

		do {

			do {

				String entrada = JOptionPane.showInputDialog("Digite o fator de multiplicação (entre 0 e 9): ");
				fator = Integer.parseInt(entrada);

				if (fator < 0 || fator > 9) {
					JOptionPane.showMessageDialog(null, "Fator de multiplicação inválido!");
				}

			} while (fator < 0 || fator > 9);

			/// multiplicando o vetor

			for (int i = 0; i <= 14; i++) {

				resultado = vetor[i] * fator;

				vetorResultado = vetorResultado + " " + resultado;

			}
			JOptionPane.showMessageDialog(null, "O vetor multiplicado ficou:\n" + vetorResultado);

			do {

				String entrada = JOptionPane.showInputDialog("Deseja multiplicar por outro fator?\n1- Sim.\n2- Não. ");
				escolha = Integer.parseInt(entrada);

				if (escolha != 1 && escolha != 2) {

					JOptionPane.showMessageDialog(null, "Opção inválida!");

				}
				
				else if ( escolha == 2) {
					
					JOptionPane.showMessageDialog(null, "BYE");

				}
				
				resultado = 0;
				vetorResultado = "";
				
			} while (escolha != 1 && escolha != 2);

		} while (escolha == 1);

	}

}
