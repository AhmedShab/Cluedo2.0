package card;

import helper.Imagehelper;

public class CharacterCard extends Card{

	public CharacterCard(String name, Imagehelper image) {
		super(name, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Imagehelper getImage() {
		// TODO Auto-generated method stub
		return image;
	}

}
