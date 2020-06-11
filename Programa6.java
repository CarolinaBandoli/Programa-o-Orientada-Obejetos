import javax.swing.JOptionPane;

public class Programa6 {

	public static void main(String[] args) {

		int i = 0;

		String x = " ";
		
		for (i = 0; i <= 5; i++) {
			
			x = x + "\n* * * * * * ";
		}

		JOptionPane.showMessageDialog(null, x);

		System.exit(0);
	}

}