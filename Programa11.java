import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double vetorOrdem[] = new double[10];
		int num;
		String inverso = " ";

		for (int i = 0; i <= 9; i++) {
			String entrada = JOptionPane.showInputDialog("Digite um número: ");
			vetorOrdem[i] = Double.parseDouble(entrada);
		}

		for (int i = 9; i >= 0; i--) {

			inverso = inverso  + vetorOrdem[i] + "\n ";

		}

		JOptionPane.showMessageDialog(null, inverso);

		String entrada = JOptionPane.showInputDialog("Deseja mostrar o maior e menor valor e a media? \n1-Sim ");
		num = Integer.parseInt(entrada);

		if (num == 1) {

			mostrar(vetorOrdem);

			/*
			 * metMaior(vetorOrdem); metMenor(vetorOrdem); metMedia(vetorOrdem);
			 */

		}

		else {
			JOptionPane.showMessageDialog(null, "BYE");
		}
		sc.close();
	}

	public static void mostrar(double vetorOrdem[]) {

		double maior = vetorOrdem[0];
		double menor = vetorOrdem[0];
		double media, media1 = vetorOrdem[0];

		for (int i = 0; i <= 9; i++) {

			// maior
			if (maior < vetorOrdem[i]) {

				maior = vetorOrdem[i];

			}

			// menor
			if (menor > vetorOrdem[i]) {

				menor = vetorOrdem[i];
			}

			// media
			media1 = media1 + vetorOrdem[i];
		}

		media = media1 / 10;

		JOptionPane.showMessageDialog(null,
				"Maior número: " + maior + "\nMenor número: " + menor + "\nMédia dos números: " + media);

	}

	/*
	 * /metodo maior public static double metMaior(double vetorOrdem[]) {
	 * 
	 * double maior = 0;
	 * 
	 * for (int i = 0; i <= 9; i++) {
	 * 
	 * if (maior < vetorOrdem[i]) {
	 * 
	 * maior = vetorOrdem[i];
	 * 
	 * } }
	 * 
	 * JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\n"); return
	 * maior; }
	 * 
	 * // metodo menor public static double metMenor(double vetorOrdem[]) {
	 * 
	 * double menor = vetorOrdem[0];
	 * 
	 * for (int i = 0; i <= 9; i++) {
	 * 
	 * if (menor > vetorOrdem[i]) {
	 * 
	 * menor = vetorOrdem[i]; } } JOptionPane.showMessageDialog(null,
	 * "Menor número: " + menor + "\n"); return menor; }
	 * 
	 * //metodo media public static double metMedia(double vetorOrdem[]) {
	 * 
	 * double media, media1 = 0;
	 * 
	 * for (int i = 0; i <= 9; i++) { media1 = media1 + vetorOrdem[i]; } media =
	 * media1 / 10;
	 * 
	 * JOptionPane.showMessageDialog(null, "Media: " + media + "\n"); return media;
	 * }
	 */
}
