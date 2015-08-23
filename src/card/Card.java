package card;

import helper.Imagehelper;

public abstract class Card {
	
	String name;	// The name of the card
	Imagehelper image; // The images to store each different card (e.g character, weapon and room)
	
	public Card(String name, Imagehelper image) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.image = image;
	}

	public abstract String getName();

	public abstract Imagehelper getImage();

	@Override
	public String toString() {
		return "Card [name=" + name + ", image=" + image + "]";
	}
	
	
	

}
