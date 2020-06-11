import java.awt.Graphics;
import javax.swing.*;

public class Programa14 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		Programa14 tela = new Programa14();
		tela.setSize(400, 400); // dimensiona a tela
		tela.setVisible(true); // exibe a tela
	}

	public void paint(Graphics g) {
		super.paint(g);

		g.drawOval((int) (Math.random()*300) , (int) (Math.random()*200) , 100, 100);


	}
}