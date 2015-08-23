package cluedo;

import java.util.ArrayList;
import java.util.List;

import card.Card;
import game.Dice;

public class GameModel {

	private Player currentPlayer;
	private List<Player> players =  new ArrayList<Player>();
	private Dice dice;
	private Murder murder;
	private Board board;
	private List<Card> characterCards;
	private List<Card> roomCards;
	private List<Card> weaponCards;
	private boolean suggestionMade = false;
	private boolean accusationMade = false;



	public GameModel(){
		dice = new Dice();
		board = new Board();

	}

	public void movePlayer(){
		//		currentPlayer;
		//		currentPlayer.getLocation();



	}

	public void playerSuggestion(){

	}

	public int getDiceRoll(){
		return dice.nextRandom();
	}



	public boolean checkAccusation(){

		return false;
	}

	public boolean checkSuggestion(){
		return accusationMade;

	}


	public void removePlayer(){




	}

	public void winGame(){




	}

	public void rotatePlayers(){
		//bounds checking here.
		//		currentPlayer = players.get(next++);




	}

	public List<Player> getPlayers(){
		return players;
	}


	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Murder getMurder() {
		return murder;
	}

	public void setMurder(Murder murder) {
		this.murder = murder;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Card> getCharacterCards() {
		return characterCards;
	}

	public void setCharacterCards(List<Card> characterCards) {
		this.characterCards = characterCards;
	}

	public List<Card> getRoomCards() {
		return roomCards;
	}

	public void setRoomCards(List<Card> roomCards) {
		this.roomCards = roomCards;
	}

	public List<Card> getWeaponCards() {
		return weaponCards;
	}

	public void setWeaponCards(List<Card> weaponCards) {
		this.weaponCards = weaponCards;
	}

}
