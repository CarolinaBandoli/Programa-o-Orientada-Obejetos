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

		System.out.println("\nQual opera��o deseja fazer?\n1-Adi��o\n2-Subtra��o\n3-Multiplica��o\n4-Divis�o\0-Para sair ");
		x = sc.nextInt();
		
		//if (x==0 ) {
			// System.out.println("sa�da");
	//	 }

		System.out.println("\nOpera��o selecionada: ");
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
				
				 
				System.out.println("\nOpera��o inv�lida, seleciona outra por favor!");
				
				break;
			}
			
			
			
			if (x == 1) {
				System.out.println("Adi��o = "  + soma);
			}
			if (x == 2) {
				System.out.println("Subtra��o = " + sub);
			}
			if (x == 3) {
				System.out.println("Multiplica��o = " + mult);
			}
			if (x == 4) {
				System.out.println("Divis�o = " + div);
			}
			if (x == 0) {
				System.out.println("Saida");
			}
			System.out.println("\nDigite um valor");
			a = sc.nextDouble();

			System.out.println("\nDigite um valor");
			b = sc.nextDouble();

			System.out.println("\nQual opera��o deseja fazer?\n1-Adi��o\n2-Subtra��o\n3-Multiplica��o\n4-Divis�o\n0-Para sair");
			x = sc.nextInt();	
			
			if (x==0 ) {
				 System.out.println("sa�da");
			 }
		}
		sc.close();

	}

}