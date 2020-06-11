import java.awt.Graphics;
import javax.swing.*;

public class Programa13 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		Main tela = new Main();
		tela.setSize(400, 400); // dimensiona a tela
		tela.setVisible(true); // exibe a tela
	}

	public void paint(Graphics g) {
		super.paint(g);

		for (int i = 0; i <= 9; i++) {

			g.drawOval(50 + (10*i), 50, 100, 100);
			
		}

	}
}