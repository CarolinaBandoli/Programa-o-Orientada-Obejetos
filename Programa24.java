import javax.swing.JOptionPane;

public class Programa24 {

	public static void main(String[] args) {

		/*
		 * 24) Crie um applet que possua um método para calcular o fatorial de números
		 * inteiros.
		 * 
		 * 
		 * O usuário deverá informar um número,
		 * 
		 * o computador deverá responder qual é o fatorial deste número e
		 * 
		 * 
		 * depois perguntar se o usuário quer calcular o fatorial de outro número ou
		 * sair do programa.
		 * 
		 * 
		 * 
		 * Exemplo: fatorial de 5 = 5! = 5 * 4 * 3 * 2 * 1
		 */

		int num, fatorial;
		String stringFatorial = "";

		String entrada = JOptionPane.showInputDialog("Digite o número que deseja calcular o fatorial:");
		num = Integer.parseInt(entrada);
		
		stringFatorial = stringFatorial(num);
		fatorial = fatorial (num);
		
		JOptionPane.showMessageDialog(null, num + "! = " + stringFatorial + " = " + fatorial);

	}

	public static int fatorial(int num) {

		int resultado = 1;

		for (int i = num; i > 1; i--) {

			resultado = resultado * i;

		}

		return resultado;

	}

	public static String stringFatorial(int num) {

		String stringResultado = "";
		
		for (int i = num; i > 1; i--) {

			stringResultado = stringResultado + i + " * " ;

		}
		stringResultado = stringResultado + "1 " ;
		
		return stringResultado;

	}

}
