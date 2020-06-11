import javax.swing.JOptionPane;

public class Programa25 {

	public static void main(String[] args) {

		/*
		 * 25) Crie um applet que calcule a �rea das figuras geom�tricas (quadrado,
		 * ret�ngulo, tri�ngulo e c�rculo).
		 * 
		 * Como cada figura possui uma f�rmula diferente para calcular sua �rea, crie um
		 * m�todo diferente para cada uma das figuras.
		 * 
		 * 
		 * Em cada m�todo o usu�rio dever� passar ao applet somente a informa��o
		 * necess�ria, ou seja,
		 * 
		 * no m�todo para calcular a �rea do quadrado o usu�rio deve informar somente o
		 * lado,
		 * 
		 * no m�todo para calcular a �rea do tri�ngulo ele deve informar a base e a
		 * altura,
		 * 
		 * e assim sucessivamente
		 * 
		 * . Trabalhe com valores do tipo double.
		 */
		
		String entrada = "";
		int inicializador = 0;
		int erro = 0;
		// dados quadrado
		double ladoQuadrado = 0.0;
		// dados retangulo
		double baseRetangulo = 0.0;
		double alturaRetangulo = 0.0;
		// dados triangulo
		double baseTriangulo = 0.0;
		double alturaTriangulo = 0.0;
		// dados circulo
		double raioCirculo = 0.0;
		double pi = 3.14;
		// areas
		double areaRetangulo = 0.0;
		double areaTriangulo = 0.0;
		double areaCirculo = 0.0;
		double areaQuadrado = 0.0;

		JOptionPane.showMessageDialog(null, "Programa para mostrar �reas de figuras geom�tricas!");

		do {
			if (erro == 0) {
				entrada = JOptionPane.showInputDialog(
						"Menu:\n1-Calcular a �rea do quadrado.\n2-Calcular a �rea do ret�ngulo.\n3-Calcular a �rea do tri�ngulo.\n4-Calcular a �rea do c�rculo.\n5-Sair.");
				inicializador = Integer.parseInt(entrada);
			}

			switch (inicializador) {

			case 1:
				// �rea do quadrado

				entrada = JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ");
				ladoQuadrado = Integer.parseInt(entrada);

				areaQuadrado = quadrado(ladoQuadrado);

				JOptionPane.showMessageDialog(null, "A �rea do quadrado �: " + areaQuadrado);
				erro = 0;
				
				break;

			case 2:
				// �rea do retangulo

				entrada = JOptionPane.showInputDialog("Digite o valor da base do ret�ngulo: ");
				baseRetangulo = Integer.parseInt(entrada);

				entrada = JOptionPane.showInputDialog("Digite o valor da altura do ret�ngulo: ");
				alturaRetangulo = Integer.parseInt(entrada);

				areaRetangulo = retangulo(baseRetangulo, alturaRetangulo);

				JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo �: " + areaRetangulo);
				erro = 0;
				
				break;

			case 3:
				// �rea do triangulo

				entrada = JOptionPane.showInputDialog("Digite o valor da base do tri�ngulo: ");
				baseTriangulo = Integer.parseInt(entrada);

				entrada = JOptionPane.showInputDialog("Digite o valor da altura do tri�ngulo: ");
				alturaTriangulo = Integer.parseInt(entrada);

				areaTriangulo = triangulo(baseTriangulo, alturaTriangulo);

				JOptionPane.showMessageDialog(null, "A �rea do trin�ngulo �: " + areaTriangulo);
				erro = 0;
				
				break;

			case 4:
				// �rea do c�rculo

				entrada = JOptionPane.showInputDialog("Digite o valor da raio do c�rculo: ");
				raioCirculo = Integer.parseInt(entrada);

				areaCirculo = circulo(raioCirculo, pi);

				JOptionPane.showMessageDialog(null, "A �rea do c�rculo �: " + areaCirculo);
				erro = 0;
				
				break;

			case 5:
				// saida
				JOptionPane.showMessageDialog(null, "BYE");

				break;

			default:

				// erro

				do {

					if (inicializador != 1 && inicializador != 2 && inicializador != 3 && inicializador != 4
							&& inicializador != 5) {

						JOptionPane.showMessageDialog(null, "Op��o inv�lida");
						entrada = JOptionPane.showInputDialog(
								"Menu:\n1-Calcular a �rea do quadrado.\n2-Calcular a �rea do ret�ngulo.\n3-Calcular a �rea do tri�ngulo.\n4-Calcular a �rea do c�rculo.\n5-Sair.");
						inicializador = Integer.parseInt(entrada);

						erro = 1;

					} else {

						erro = 0;

					}
				} while (inicializador != 1 && inicializador != 2 && inicializador != 3 && inicializador != 4
						&& inicializador != 5);

			}

		} while (inicializador != 5);

	}
//�re do quadrado

	public static double quadrado(double ladoQuadrado) {

		double resultadoQuadrado = 0;

		resultadoQuadrado = Math.pow(ladoQuadrado, 2);

		return resultadoQuadrado;

	}

	// �rea ret�ngulo

	public static double retangulo(double baseRetangulo, double alturaRetangulo) {

		double resultadoRetangulo = 0;

		resultadoRetangulo = baseRetangulo * alturaRetangulo;

		return resultadoRetangulo;

	}

	// �rea tri�ngulo

	public static double triangulo(double baseTriangulo, double alturaTriangulo) {

		double resultadoTriangulo = 0;

		resultadoTriangulo = (baseTriangulo * alturaTriangulo) / 2;

		return resultadoTriangulo;

	}

	// �rea circulo

	public static double circulo(double raioCirculo, double pi) {

		double resultadoCirculo = 0;

		resultadoCirculo = pi * (Math.pow(raioCirculo, 2));

		return resultadoCirculo;

	}

}
