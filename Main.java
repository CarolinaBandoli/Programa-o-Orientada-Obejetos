import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;
		double delta;
		double x1 = 0;
		double x2 = 0;

		System.out.println("Digite o valor de 'a' ");
		a = sc.nextInt();

		System.out.println("Digite o valor de 'b' ");
		b = sc.nextInt();

		System.out.println("Digite o valor de 'c' ");
		c = sc.nextInt();

		delta = (Math.pow(b, 2)) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Impossível calcular!");

		}
		else {

			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raizes sao:\nx1 = " + x1 + "\nx2 = " + x2);

		}

		sc.close();

	}

}