package cluedo;

import java.util.*;
import card.Card;
import card.CharacterCard;
import card.RoomCard;
import card.WeaponCard;
import gui.GameSetUpView;
import helper.Imagehelper;

/**
 * Represents a game of Cluedo. Stores names of all players,
 * weapons and rooms, as well as the cards in the game, and
 * the murder cards. Organises the distribution of cards.
 */
public class CluedoSetUp {
	public static final int TOTAL_NUM_CARDS = 21;

	// Characters
	public static final String HEATHER = "Heather"; // SCARLETT
	public static final String MARIA = "Maria"; // MUSTARD
	public static final String CYBIL = "Cybil";  // WHITE
	public static final String HARRY = "Harry"; // GREEN
	public static final String EILEEN = "Eileen"; // PEACOCK
	public static final String HENRY = "Henry"; // PLUM
	

	// Weapons
	public static final String SHOTGUN = "Shotgun";
	public static final String CHAINSAW = "Chainsaw";
	public static final String BEAM_SABER = "Beam Saber";
	public static final String STEEL_PIPE = "Steel Pipe";
	public static final String AXE = "Axe";
	public static final String PISTOAL = "Pistol";

	// Rooms
	public static final String HAPPY_BURGER = "Happy Burger";
	public static final String LAKEVIEW_HOTEL = "Lakeview Hotel";
	public static final String AMUSEMENT_PARK = "Lakeside Amusement Park";
	public static final String ROSEWATER_PARK = "Rosewater Park";
	public static final String BROOKHAVEN_HOSPITAL = "BrookHaven Hospital";
	public static final String CAFE_5TO2 = "Cafe 5to2";
	public static final String HEAVENS_NIGHT = "Heavens Night";
	public static final String ROOM_302 = "Room 302";
	public static final String TOLUCA_PRSION = "Toluca Prison";

	private List<Card> characterCards;
	private List<Card> roomCards;
	private List<Card> weaponCards;
	private Card[] murderCards = new Card[3];
	private List<Player> players = new ArrayList<Player>();
	private GameModel gameModel;
	//private Board board; inside game model

	/**
	 * Constructor for class GameOfCluedo
	 */
	public CluedoSetUp(GameModel gameModel){
		this.gameModel = gameModel;
		setupCards();
		setMurderCards();
		setUpGameModel();
		
	}


	private void setUpGameModel() {
		gameModel.setPlayers(players);
		gameModel.setCharacterCards(characterCards);
		gameModel.setRoomCards(roomCards);
		gameModel.setWeaponCards(weaponCards);
		gameModel.setMurder(new Murder(murderCards));
		
	}


	/**
	 * Generate a list of all cards in the game, and
	 * shuffles the order.
	 * @return A shuffled List of all game cards.
	 */
	private void setupCards(){
		
		Imagehelper image = new Imagehelper();	// dummy image 

		// add character cards
		List<Card> cCards = new ArrayList<Card>();
		cCards.add(new CharacterCard(HEATHER, image));
		cCards.add(new CharacterCard(MARIA, image));
		cCards.add(new CharacterCard(CYBIL, image));
		cCards.add(new CharacterCard(HARRY, image));
		cCards.add(new CharacterCard(EILEEN, image));
		cCards.add(new CharacterCard(HENRY, image));
		Collections.shuffle(cCards);
		this.characterCards = cCards;

		// add room cards
		List<Card> rCards = new ArrayList<Card>();
		rCards.add(new RoomCard("Happy Burger", image));
		rCards.add(new RoomCard("Lakeview Hotel", image));
		rCards.add(new RoomCard("Lakeside Amusement Park", image));
		rCards.add(new RoomCard("Rosewater Park", image));
		rCards.add(new RoomCard("BrookHaven Hospital", image));
		rCards.add(new RoomCard("Cafe 5to2", image));
		rCards.add(new RoomCard("Heavens Night", image));
		rCards.add(new RoomCard("Room 302", image));
		rCards.add(new RoomCard("Toluca Prison", image));
		Collections.shuffle(rCards);
		this.roomCards = rCards;

		// add weapon cards
		List<Card> wCards = new ArrayList<Card>();
		wCards.add(new WeaponCard("Shotgun", image));
		wCards.add(new WeaponCard("Chainsaw", image));
		wCards.add(new WeaponCard("Beam Saber", image));
		wCards.add(new WeaponCard("Steel Pipe", image));
		wCards.add(new WeaponCard("Axe", image));
		wCards.add(new WeaponCard("Pistol", image));
		Collections.shuffle(wCards);
		this.weaponCards = wCards;
	}

	/**
	 * Picks a random card from each card group (characters, rooms,
	 * weapons) and adds it to the array of murder cards.
	 */
	private void setMurderCards(){
		// choose a character card
		int randomIndex = (int) (Math.random()*(characterCards.size()-1));
		this.murderCards[0] = this.characterCards.remove(randomIndex);
		// choose a room card
		randomIndex = (int) (Math.random()*(weaponCards.size()-1));
		this.murderCards[1] = this.weaponCards.remove(randomIndex);
		// choose a weapon card
		randomIndex = (int) (Math.random()*(roomCards.size()-1));
		this.murderCards[2] = this.roomCards.remove(randomIndex);
	}

	/**
	 * Evenly deals out each type of card to every player,
	 * until there are no cards left.
	 * @param players The players in the game.
	 */
	public void dealCards() {
		Queue<Player> dealTo = new LinkedList<Player>();
		dealTo.addAll(players);
		// deal character cards
		while(!characterCards.isEmpty()){
			Player p = dealTo.poll();
			p.addCard(characterCards.remove(0));
			dealTo.add(p); // put player on end of queue
		}
		// deal weapon cards
		while(!weaponCards.isEmpty()){
			Player p = dealTo.poll();
			p.addCard(weaponCards.remove(0));
			dealTo.add(p); // put player on end of queue
		}
		// deal room cards
		while(!roomCards.isEmpty()){
			Player p = dealTo.poll();
			p.addCard(roomCards.remove(0));
			dealTo.add(p); // put player on end of queue
		}
	}

	/**
	 * Checks an accusation against the murder cards.
	 * @param accusation String array containing the character, weapon and room in that order.
	 * @return True if only if all three cards are correct
	 */
	public boolean accuse(String[] accusation){
		for (int i = 0; i < murderCards.length; i++){
			if (!accusation[i].equals(murderCards[i].getName())){
				return false;
			}
		}
		return true;
	}

	/**
	 * Testing method used when checking a correct accusation
	 * @return the murder cards
	 */
	public Card[] getMurderCards(){
		return murderCards;
	}

	/**
	 * Prints out the murderer, their weapon and room.
	 */
	public void printMurder(){
		System.out.println(murderCards[0].getName() +
				" used the " + murderCards[1].getName() +
				" in the " + murderCards[2].getName() + "!");
	}

	/**
	 * Adds all players to game.
	 * @param players The complete list of players in the game.
	 */
	public void setPlayers(List<Player> players){
		this.players = players;
	}

	/**
	 * Gets all players in the game.
	 * @return A list of all players in the game.
	 */
	public List<Player> getPlayers(){
		return this.players;
	}

	/**
	 * Determines whether there is a player at the given position.
	 * @param row The row of the position
	 * @param col The column of the position
	 * @return True if and only if there is a player at the given position.
	 */
	public boolean hasPlayerAt(int row, int col){
		for(Player p : players){
			if(p.row() == row && p.column() == col){
				return true;
			}
		}
		return false;
	}

}
