import javax.swing.JOptionPane;

public class Programa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resultado = "" ;
		int[][] matriz1 = {

				{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matriz2 = {

				{ 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }

		};

		resultado = somaMatriz(matriz1, matriz2);
		JOptionPane.showMessageDialog(null, "A soma é:\n" + resultado);
		;

	}

	public static String somaMatriz(int[][] matriz1, int[][] matriz2) {
		
		String somaDeMatriz = "";
		
		
		int[][] soma = new int[3][3];

		for (int i = 0; i <= 2; i++) {

			//somaDeMatriz = somaDeMatriz + "| ";
			
			for (int j = 0; j <= 2; j++) {

				soma[i][j] = matriz1[i][j] + matriz2[i][j];
				
				somaDeMatriz = somaDeMatriz + soma[i][j] + " ";
			}
			
			somaDeMatriz = somaDeMatriz + "\n";
			//somaDeMatriz = somaDeMatriz + " |\n";

		}
		return somaDeMatriz;
	}

}
