package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import cluedo.GameController;
@SuppressWarnings("serial")
public class BoardCanvas extends JPanel{
//	private GameController control;
//	private final int WIDTH;
//	private final int HEIGHT;
	public BoardCanvas(){
		//GameController game
	}
	@Override
	public Dimension getPreferredSize() {
		Dimension d = new Dimension(500,500);
		return d;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 500);
		System.out.println("printing from inside the card canvas class.");
	}
}