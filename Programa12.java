import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa12 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double b, c, h;

		String entrada =  JOptionPane.showInputDialog("Digite o valor de do primeiro cateto: ");
		b = Double.parseDouble(entrada);

		entrada =  JOptionPane.showInputDialog("Digite o valor de do segundo cateto: ");
		c = Double.parseDouble(entrada);

		h = hipotenusa(b,c);
		
		
		JOptionPane.showMessageDialog(null,"A hipotenusa é : " + h);

		sc.close();

	}
	
	public static double hipotenusa( double b, double c ) {
		
		
		double n1 = Math.pow(b, 2) + Math.pow(c, 2);

		double a = Math.sqrt(n1);
		
		return a;

	}


}