import javax.swing.JOptionPane;

public class Programa26 {

	public static void main(String[] args) {

		/*
		 * 26) O IMC (Índice de Massa Corporal) é um índice utilizado para calcular se
		 * uma pessoa esta abaixo de seu peso, acima do peso ou com peso normal.
		 * 
		 * 
		 * Seu cálculo segue a fórmula: IMC = peso / altura2
		 * 
		 * onde peso é o peso da pessoa em quilogramas e altura é a altura da pessoa
		 * metros.
		 * 
		 * Pessoas com IMC’s menores que 18.5 são consideradas abaixo do peso,
		 * 
		 * com IMC’s entre 18.5 e 23.5 são consideradas com peso normal e
		 * 
		 * com IMC’s acima de 23.5 são obesas.
		 * 
		 * Crie um applet que receba do usuário seu peso e sua altura.
		 * 
		 * O programa deve mostrar o IMC do usuário e se ele está com peso abaixo,
		 * normal ou acima dos padrões.
		 * 
		 * Logo após o usuário consultar um IMC o applet deve oferece a opção de
		 * calcular outro IMC ou sair do programa.
		 * 
		 * Obs.: o cálculo do IMC deve obrigatoriamente ser feito dentro de um método
		 * denominado calculaIMC,
		 * 
		 * que deve receber o peso e a altura do usuário e não possuir valor de retorno.
		 */

		double peso = 0.0;
		double altura = 0.0;
		String entrada = "";
		int novoCalculo =0 ;

		do {

			if (novoCalculo == 0) {

				entrada = JOptionPane.showInputDialog("Digite seu peso em quilogramas: ");
				peso = Double.parseDouble(entrada);

				entrada = JOptionPane.showInputDialog("Digite sua altura em metros: ");
				altura = Double.parseDouble(entrada);

			}

			calculaIMC(peso, altura);

			novoCalculo = JOptionPane.showConfirmDialog(null, "Deseja realizar outro cálculo?");
			
			if (novoCalculo == 1) {

				JOptionPane.showMessageDialog(null, "BYE");

			}

		} while (novoCalculo == 0);

	}

	public static void calculaIMC(double peso, double altura) {

		double IMC = 0.0;

		IMC = peso / Math.pow(altura, 2);

		if (IMC < 18.5) {

			JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + "\nVocê está baixo do peso ideal!");

		}

		else if (IMC >= 18.5 && IMC <= 23.5) {

			JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + "\nVocê está no peso ideal!");

		}

		else if (IMC > 23.5) {

			JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + "\nVocê está acima do peso ideal!");

		}

	}

}
