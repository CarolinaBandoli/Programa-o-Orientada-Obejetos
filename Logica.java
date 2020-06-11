import java.util.Scanner;

public class Logica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i;
		int x;

		for (i = 0; i <= 5; i++) {
			for (x = 0; x <= i; x++) {

				System.out.print("*");

			}
			System.out.println(" ");
		}

		sc.close();
	}

}