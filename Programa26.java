import javax.swing.JOptionPane;

public class Programa26 {

	public static void main(String[] args) {

		/*
		 * 26) O IMC (�ndice de Massa Corporal) � um �ndice utilizado para calcular se
		 * uma pessoa esta abaixo de seu peso, acima do peso ou com peso normal.
		 * 
		 * 
		 * Seu c�lculo segue a f�rmula: IMC = peso / altura2
		 * 
		 * onde peso � o peso da pessoa em quilogramas e altura � a altura da pessoa
		 * metros.
		 * 
		 * Pessoas com IMC�s menores que 18.5 s�o consideradas abaixo do peso,
		 * 
		 * com IMC�s entre 18.5 e 23.5 s�o consideradas com peso normal e
		 * 
		 * com IMC�s acima de 23.5 s�o obesas.
		 * 
		 * Crie um applet que receba do usu�rio seu peso e sua altura.
		 * 
		 * O programa deve mostrar o IMC do usu�rio e se ele est� com peso abaixo,
		 * normal ou acima dos padr�es.
		 * 
		 * Logo ap�s o usu�rio consultar um IMC o applet deve oferece a op��o de
		 * calcular outro IMC ou sair do programa.
		 * 
		 * Obs.: o c�lculo do IMC deve obrigatoriamente ser feito dentro de um m�todo
		 * denominado calculaIMC,
		 * 
		 * que deve receber o peso e a altura do usu�rio e n�o possuir valor de retorno.
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

			novoCalculo = JOptionPane.showConfirmDialog(null, "Deseja realizar outro c�lculo?");
			
			if (novoCalculo == 1) {

				JOptionPane.showMessageDialog(null, "BYE");

			}

		} while (novoCalculo == 0);

	}

	public static void calculaIMC(double peso, double altura) {

		double IMC = 0.0;

		IMC = peso / Math.pow(altura, 2);

		if (IMC < 18.5) {

			JOptionPane.showMessageDialog(null, "Seu IMC �: " + IMC + "\nVoc� est� baixo do peso ideal!");

		}

		else if (IMC >= 18.5 && IMC <= 23.5) {

			JOptionPane.showMessageDialog(null, "Seu IMC �: " + IMC + "\nVoc� est� no peso ideal!");

		}

		else if (IMC > 23.5) {

			JOptionPane.showMessageDialog(null, "Seu IMC �: " + IMC + "\nVoc� est� acima do peso ideal!");

		}

	}

}
