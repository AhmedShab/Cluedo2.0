package helper;

import javax.swing.ImageIcon;

public class Imagehelper {

	// Characters cards
	private ImageIcon alex =  loadImage("Alex", "resources/Cards/Characters/Alex.jpg");
	private ImageIcon henry =  loadImage("Henry", "resources/Cards/Characters/Henry.jpg");
	private ImageIcon eileen =  loadImage("Eileen", "resources/Cards/Characters/Eileen.jpg");
	private ImageIcon harry =  loadImage("Harry", "resources/Cards/Characters/Harry.jpg");
	private ImageIcon cybil =  loadImage("Cybil", "resources/Cards/Characters/Cybil.jpg");
	private ImageIcon heather =  loadImage("Heater", "resources/Cards/Characters/Heater.jpg");
	private ImageIcon maria =  loadImage("Maria", "resources/Cards/Characters/Maria.jpg");
	private ImageIcon james =  loadImage("James", "resources/Cards/Characters/James.jpg");

	//Weapon cards
	private ImageIcon shotgun =  loadImage("Shotgun", "resources/Cards/Weapons/Shotgun.jpg");
	private ImageIcon chainsaw =  loadImage("Chainsaw", "resources/Cards/Weapons/Chainsaw.jpg");
	private ImageIcon beamSaber =  loadImage("BeamSaber", "resources/Cards/Weapons/BeamSaber.jpg");
	private ImageIcon steelPipe =  loadImage("SteelPipe", "resources/Cards/Weapons/SteelPipe.jpg");
	private ImageIcon axe =  loadImage("Axe", "resources/Cards/Weapons/.jpg");
	private ImageIcon pistol =  loadImage("Pistol", "resources/Cards/Weapons/.jpg");

	//Rooms cards
	private ImageIcon happyBurger =  loadImage("HappyBurger", "resources/Cards/Rooms/HappyBurger.jpg");
	private ImageIcon lakeviewHotel =  loadImage("LakeviewHotel", "resources/Cards/Rooms/LakeviewHotel.jpg");
	private ImageIcon lakesideAmusementPark =  loadImage("LakesideAmusementPark", "resources/Cards/Rooms/LakesideAmusementPark.jpg");
	private ImageIcon rosewaterPark =  loadImage("RosewaterPark", "resources/Cards/RosewaterPark.jpg");
	private ImageIcon brookHavenHospital =  loadImage("BrookHavenHospital", "resources/Cards/BrookHavenHospital.jpg");
	private ImageIcon cafe5to2 =  loadImage("Cafe5to2", "resources/Cards/Cafe5to2.jpg");
	private ImageIcon  heavensNight =  loadImage("HeavensNight", "resources/Cards/HeavensNight.jpg");
	private ImageIcon room302 =  loadImage("Room302", "resources/Cards/Room302.jpg");
	
	//Player's token
	private ImageIcon player1 = loadImage("resources/Tokens/player1.jpg");
	private ImageIcon player2 = loadImage("resources/Tokens/player2.jpg");
	private ImageIcon player3 = loadImage("resources/Tokens/player3.jpg");
	private ImageIcon player4 = loadImage("resources/Tokens/player4.jpg");
	private ImageIcon player5 = loadImage("resources/Tokens/player5.jpg");
	private ImageIcon player6 = loadImage("resources/Tokens/player6.jpg");
	
	private ImageIcon loadImage(String cardname,String filename){
		ImageIcon image = new ImageIcon(filename);
		image.setDescription(cardname);
		return image;
	}

	private ImageIcon loadImage(String filename) {
		ImageIcon image = new ImageIcon(filename);
		return image;
	}

	public ImageIcon getAlex() {
		return alex;
	}

	public ImageIcon getHenry() {
		return henry;
	}

	public ImageIcon getEileen() {
		return eileen;
	}

	public ImageIcon getHarry() {
		return harry;
	}

	public ImageIcon getCybil() {
		return cybil;
	}

	public ImageIcon getHeather() {
		return heather;
	}

	public ImageIcon getMaria() {
		return maria;
	}

	public ImageIcon getJames() {
		return james;
	}

	public ImageIcon getShotgun() {
		return shotgun;
	}

	public ImageIcon getChainsaw() {
		return chainsaw;
	}

	public ImageIcon getBeamSaber() {
		return beamSaber;
	}

	public ImageIcon getSteelPipe() {
		return steelPipe;
	}

	public ImageIcon getAxe() {
		return axe;
	}

	public ImageIcon getPistol() {
		return pistol;
	}

	public ImageIcon getHappyBurger() {
		return happyBurger;
	}

	public ImageIcon getLakeviewHotel() {
		return lakeviewHotel;
	}

	public ImageIcon getLakesideAmusementPark() {
		return lakesideAmusementPark;
	}

	public ImageIcon getRosewaterPark() {
		return rosewaterPark;
	}

	public ImageIcon getBrookHavenHospital() {
		return brookHavenHospital;
	}

	public ImageIcon getCafe5to2() {
		return cafe5to2;
	}

	public ImageIcon getHeavensNight() {
		return heavensNight;
	}

	public ImageIcon getRoom302() {
		return room302;
	}

	public ImageIcon getPlayer1() {
		return player1;
	}

	public ImageIcon getPlayer2() {
		return player2;
	}

	public ImageIcon getPlayer3() {
		return player3;
	}

	public ImageIcon getPlayer4() {
		return player4;
	}

	public ImageIcon getPlayer5() {
		return player5;
	}

	public ImageIcon getPlayer6() {
		return player6;
	}

}
