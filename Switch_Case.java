import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int i = 1;
		double a, b;
		double soma = 0;
		double sub = 0;
		double mult = 0;
		double div = 0;
		
				

		System.out.println("\nDigite um valor");
		a = sc.nextDouble();

		System.out.println("\nDigite um valor");
		b = sc.nextDouble();

		System.out.println("\nQual operação deseja fazer?\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\0-Para sair ");
		x = sc.nextInt();
		
		//if (x==0 ) {
			// System.out.println("saída");
	//	 }

		System.out.println("\nOperação selecionada: ");
		while (x != 0) {
			
			switch (x) {
			case 1:
				soma = a + b;
				break;

			case 2:
				sub = a - b;
				break;

			case 3:
				mult = a * b;
				break;

			case 4:
				div = a / b;
				break;

			default:
				
				 
				System.out.println("\nOperação inválida, seleciona outra por favor!");
				
				break;
			}
			
			
			
			if (x == 1) {
				System.out.println("Adição = "  + soma);
			}
			if (x == 2) {
				System.out.println("Subtração = " + sub);
			}
			if (x == 3) {
				System.out.println("Multiplicação = " + mult);
			}
			if (x == 4) {
				System.out.println("Divisão = " + div);
			}
			if (x == 0) {
				System.out.println("Saida");
			}
			System.out.println("\nDigite um valor");
			a = sc.nextDouble();

			System.out.println("\nDigite um valor");
			b = sc.nextDouble();

			System.out.println("\nQual operação deseja fazer?\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n0-Para sair");
			x = sc.nextInt();	
			
			if (x==0 ) {
				 System.out.println("saída");
			 }
		}
		sc.close();

	}

}