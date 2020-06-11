import javax.swing.JOptionPane;

public class Programa9 {

	public static void main(String[] args) {


		int km, lt;
		float kml;
		int x;

		String entrada = JOptionPane.showInputDialog("Digite quantos quilometros foram percorridos: ");
		km = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog("Digite quantos litros foram gastos: ");
		lt = Integer.parseInt(entrada);
		
		kml = km / lt;

		JOptionPane.showMessageDialog(null,"\nForam percorridos " + kml + " km por litro");

		entrada = JOptionPane.showInputDialog("\nDeseja fazer outra operação? \n1 - Sim \n2 - Não");
		x = Integer.parseInt(entrada);

		if (x == 1) {

			while (x != 2) {

				entrada = JOptionPane.showInputDialog("Digite quantos quilometros foram percorridos: ");
				km = Integer.parseInt(entrada);

				entrada = JOptionPane.showInputDialog("Digite quantos litros foram gastos: ");
				lt = Integer.parseInt(entrada);

				kml = km / lt;

				JOptionPane.showMessageDialog(null,"\nForam percorridos " + kml + " km por litro");

				entrada = JOptionPane.showInputDialog("\nDeseja fazer outra operação? \n1 - Sim \n2 - Não");
				x = Integer.parseInt(entrada);

			}

		}

		else if (x == 2) {
			JOptionPane.showMessageDialog(null,"Saida");
		}
		else {
			JOptionPane.showMessageDialog(null,"Opção inválida");
		}
		

		JOptionPane.showMessageDialog(null,"Bye");

		System.exit(0);
	}

}