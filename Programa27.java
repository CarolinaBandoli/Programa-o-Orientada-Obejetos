import javax.swing.JOptionPane;

public class Programa27 {

	public static void main(String[] args) {

		/*
		 * 27) Escreva um applet com cada uma das tarefas seguintes em métodos
		 * diferentes:
		 * 
		 * - Calcular a parte inteira do quociente quando o inteiro A é dividido pelo
		 * inteiro B.
		 * 
		 * 
		 * 
		 * - Calcular o resto inteiro quando o inteiro A é dividido pelo inteiro B.
		 * 
		 * 
		 * 
		 * 
		 * - Utilizar os métodos criados anteriormente para escrever os dígitos de um
		 * inteiro entre 1 e 99999, separados por dois espaços. Ex: para o número 4532,
		 * escrever na tela: 4 5 3 2
		 * 
		 */
		int inteiroQuociente;
		int repetir;
		int num;
		String decompor = "";
		int numero;
		int a = 10000;
		int b = 1000;
		int c = 100;
		int d = 10;
		int e = 1;

		do {

			num = 1 + (int) (Math.random() * 99999);
			numero = num;

			// dezena de milhar
			if (num <= 99999 && num >= a) {

				inteiroQuociente = quociente(num, a);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, a);

				inteiroQuociente = quociente(num, b);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, b);

				inteiroQuociente = quociente(num, c);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, c);

				inteiroQuociente = quociente(num, d);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, d);

				inteiroQuociente = quociente(num, e);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, e);

				JOptionPane.showMessageDialog(null, "A decomposição de " + numero + " é:\n" + decompor);

			}

			// milhar
			else if (num <= 9999 && num >= b) {

				inteiroQuociente = quociente(num, b);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, b);

				inteiroQuociente = quociente(num, c);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, c);

				inteiroQuociente = quociente(num, d);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, d);

				inteiroQuociente = quociente(num, e);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, e);

				JOptionPane.showMessageDialog(null, "A decomposição de " + numero + " é:\n" + decompor);

			}

			// centena
			else if (num <= 999 && num >= c) {

				inteiroQuociente = quociente(num, c);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, c);

				inteiroQuociente = quociente(num, d);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, d);

				inteiroQuociente = quociente(num, e);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, e);

				JOptionPane.showMessageDialog(null, "A decomposição de " + numero + " é:\n" + decompor);

			}

			// dezena
			else if (num <= 99 && num >= d) {

				inteiroQuociente = quociente(num, d);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, d);

				inteiroQuociente = quociente(num, e);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, e);

				JOptionPane.showMessageDialog(null, "A decomposição de " + numero + " é:\n" + decompor);

			}

			// unidade
			else if (num <= 9 && num >= e) {

				inteiroQuociente = quociente(num, e);
				decompor = decompor + inteiroQuociente + "  ";
				num = resto(num, e);

				JOptionPane.showMessageDialog(null, "A decomposição de " + numero + " é:\n" + decompor);

			}

			// rotina nova separação
			repetir = JOptionPane.showConfirmDialog(null, "Deseja realizar outro cálculo?");
			decompor = "";

			if (repetir == 1) {

				JOptionPane.showMessageDialog(null, "BYE");

			}

		} while (repetir == 0);

	}

	public static int quociente(int num, int faixa) {

		int resultadoQuociente = 0;

		resultadoQuociente = num / faixa;

		return resultadoQuociente;

	}

	public static int resto(int num, int faixa) {

		int resultadoResto = 0;

		resultadoResto = num % faixa;

		return resultadoResto;

	}

}
