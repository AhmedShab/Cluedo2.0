package gui;
import helper.Imagehelper;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class CardCanvas extends JPanel{
	private Image img;
	//private Player currentPlayer;
	private Imagehelper helper;
	//private GameController controller;
	//private final int WIDTH = 40;
	public CardCanvas(){
		Imagehelper ih = new Imagehelper();
		//this.img = ih.ALEX;
		this.helper = ih;
		//controller = g;
	}
	@Override
	public Dimension getPreferredSize() {
		Dimension d = new Dimension(495,190);
		return d;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		//g.setColor(Color.BLACK);
		g.fillRect(0, 0, 495, 190);
//		if(currentPlayer != null){// method required here to loop through and then print player cards.
//
//		}
		//g.drawImage(helper.eileen.getImage(), 0, 0,50,100, this);
//		g.drawImage(helper.cardBackground.getImage(),0,0,495,190,this);
//		g.drawImage(img,0,0,60,190,this);
//		g.drawImage(img,60,0,60,190,this);
//		g.drawImage(img,120,0,60,190,this);
//		g.drawImage(img,180,0,60,190,this);
//		g.drawImage(img,240,0,60,190,this);
//		g.drawImage(img,300,0,60,190,this);
//		g.drawImage(img,360,0,60,190,this);
		//list = controller.getHand();
		System.out.println("printing from inside the card canvas class.");
	}
	public Imagehelper getHelper() {
		return helper;
	}
	public void setHelper(Imagehelper helper) {
		this.helper = helper;
	}
}
//g.setColor(Color.RED);
//g.fillRect(0,0,12,fuelY);
//g.setColor(Color.GRAY);
//g.fillPolygon(ground);
//g.setColor(Color.BLUE);
//g.translate(landerXCoord,landerYCoord); // moves the lander
//g.fillPolygon(landerXS, landerYS, landerXS.length);