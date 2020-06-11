import javax.swing.JOptionPane;

public class Programa8 {

	public static void main(String[] args) {

		
		
		int i = 0;
		double salario = 0;
		double media = 0;
		double soma = 0;

		while (salario != -1) {

			String entrada = JOptionPane.showInputDialog("Digite um salário:");//System.out.print("Digite um salario: ");
			salario = Double.parseDouble(entrada);//sc.nextDouble();
			
			if (salario != -1) {
				i = i + 1;
				soma = soma + salario;
			}
		}

		media = soma / i;

		JOptionPane.showMessageDialog(null, "A média do salarios é : "+ media);//System.out.print("A média dos salários é : " + media);

		System.exit(0);
	}
}
