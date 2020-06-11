import javax.swing.JOptionPane;

public class Programa7 {

	public static void main(String[] args) {

		int i;
		int x;

		String ln = "\n";
		String asterisco = " ";

		for (i = 0; i <= 5; i++) {
			for (x = 0; x <= i; x++) {

				asterisco = asterisco + "*";

			}

			ln = ln + "\n" + asterisco;
			asterisco = " ";
		}

		JOptionPane.showMessageDialog(null, ln);

		System.exit(0);
	}
}