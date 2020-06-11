import javax.swing.JOptionPane;

public class Programa25 {

	public static void main(String[] args) {

		/*
		 * 25) Crie um applet que calcule a área das figuras geométricas (quadrado,
		 * retângulo, triângulo e círculo).
		 * 
		 * Como cada figura possui uma fórmula diferente para calcular sua área, crie um
		 * método diferente para cada uma das figuras.
		 * 
		 * 
		 * Em cada método o usuário deverá passar ao applet somente a informação
		 * necessária, ou seja,
		 * 
		 * no método para calcular a área do quadrado o usuário deve informar somente o
		 * lado,
		 * 
		 * no método para calcular a área do triângulo ele deve informar a base e a
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

		JOptionPane.showMessageDialog(null, "Programa para mostrar áreas de figuras geométricas!");

		do {
			if (erro == 0) {
				entrada = JOptionPane.showInputDialog(
						"Menu:\n1-Calcular a área do quadrado.\n2-Calcular a área do retângulo.\n3-Calcular a área do triângulo.\n4-Calcular a área do círculo.\n5-Sair.");
				inicializador = Integer.parseInt(entrada);
			}

			switch (inicializador) {

			case 1:
				// área do quadrado

				entrada = JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ");
				ladoQuadrado = Integer.parseInt(entrada);

				areaQuadrado = quadrado(ladoQuadrado);

				JOptionPane.showMessageDialog(null, "A área do quadrado é: " + areaQuadrado);
				erro = 0;
				
				break;

			case 2:
				// área do retangulo

				entrada = JOptionPane.showInputDialog("Digite o valor da base do retângulo: ");
				baseRetangulo = Integer.parseInt(entrada);

				entrada = JOptionPane.showInputDialog("Digite o valor da altura do retângulo: ");
				alturaRetangulo = Integer.parseInt(entrada);

				areaRetangulo = retangulo(baseRetangulo, alturaRetangulo);

				JOptionPane.showMessageDialog(null, "A área do retângulo é: " + areaRetangulo);
				erro = 0;
				
				break;

			case 3:
				// área do triangulo

				entrada = JOptionPane.showInputDialog("Digite o valor da base do triângulo: ");
				baseTriangulo = Integer.parseInt(entrada);

				entrada = JOptionPane.showInputDialog("Digite o valor da altura do triângulo: ");
				alturaTriangulo = Integer.parseInt(entrada);

				areaTriangulo = triangulo(baseTriangulo, alturaTriangulo);

				JOptionPane.showMessageDialog(null, "A área do trinângulo é: " + areaTriangulo);
				erro = 0;
				
				break;

			case 4:
				// área do círculo

				entrada = JOptionPane.showInputDialog("Digite o valor da raio do círculo: ");
				raioCirculo = Integer.parseInt(entrada);

				areaCirculo = circulo(raioCirculo, pi);

				JOptionPane.showMessageDialog(null, "A área do círculo é: " + areaCirculo);
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

						JOptionPane.showMessageDialog(null, "Opção inválida");
						entrada = JOptionPane.showInputDialog(
								"Menu:\n1-Calcular a área do quadrado.\n2-Calcular a área do retângulo.\n3-Calcular a área do triângulo.\n4-Calcular a área do círculo.\n5-Sair.");
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
//áre do quadrado

	public static double quadrado(double ladoQuadrado) {

		double resultadoQuadrado = 0;

		resultadoQuadrado = Math.pow(ladoQuadrado, 2);

		return resultadoQuadrado;

	}

	// área retângulo

	public static double retangulo(double baseRetangulo, double alturaRetangulo) {

		double resultadoRetangulo = 0;

		resultadoRetangulo = baseRetangulo * alturaRetangulo;

		return resultadoRetangulo;

	}

	// área triângulo

	public static double triangulo(double baseTriangulo, double alturaTriangulo) {

		double resultadoTriangulo = 0;

		resultadoTriangulo = (baseTriangulo * alturaTriangulo) / 2;

		return resultadoTriangulo;

	}

	// área circulo

	public static double circulo(double raioCirculo, double pi) {

		double resultadoCirculo = 0;

		resultadoCirculo = pi * (Math.pow(raioCirculo, 2));

		return resultadoCirculo;

	}

}
