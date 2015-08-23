package tests;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.junit.Test;

import card.Card_Class;
import cluedo.*;

/**
 *  Cluedo Test Class.
 *
 * @author copleymax && mcleankand
 * @date Wed 05 Aug 2015
 */
public class TestPlays {

	public ArrayList<Player> testPlayers;
	public ArrayList<String> testCharacters;
	public Player testCurrentPlayer;
	public Murder testTrueMurder;
	public Board testBoard;
	public ArrayList<Card_Class> testCards;

	@Test
	public void setUpTests(){
		// Initialize the game.
		File file = new File("/u/students/copleyquen/swen222workspace/Cluedo/src/Cluedo/MovementTest.txt");
		Scanner fileScan = null;
		try {
			fileScan = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		UI.startGame(fileScan);

		int diceValue = 1;
		//while (fileScan.nextLine() != null){
		int count = 0;
		while (count < 6 ){
			count++;
			UI.move(UI.currentPlayer,fileScan , diceValue);
			//System.out.println("count value now = "+count);
		}
		this.testPlayers = UI.players;
		//System.out.println("the size of test Players is :" +testPlayers.size());
		this.testCharacters = UI.characters;
		this.testCurrentPlayer = UI.currentPlayer;
		this.testTrueMurder = UI.trueMurder;
		this.testBoard = UI.board;
		this.testCards = UI.cards;
	}

	/**
	 * Test Positions of Players.
	 */
	@Test
	public void testPlayerBoardPositions(){
		testPlayers = UI.players;
		//System.out.println("the size of test Players is :" +testPlayers.size());
		//assert(testPlayers.size()>2);

		Player p1 = testPlayers.get(0);
		Player p2 = testPlayers.get(1);
		Player p3 = testPlayers.get(2);
		Player p4 = testPlayers.get(3);
		Player p5 = testPlayers.get(4);
		Player p6 = testPlayers.get(5);

		for(Player ply : testPlayers){
			System.out.println(ply.getI());
			System.out.println(ply.getJ());
		}

		assert(p1.getI() == 1);
		assert(p1.getJ() == 9);
		assert(p2.getI() == 1);
		assert(p2.getJ() == 14);
		assert(p3.getI() == 5);
		assert(p3.getJ() == 22);
		assert(p4.getI() == 16);
		assert(p4.getJ() == 1);
		assert(p5.getI() == 18);
		assert(p5.getJ() == 22);
		assert(p6.getI() == 22);
		assert(p6.getJ() == 7);
	}

	/**
	 * Test Board initialization
	 */
	@Test
	public void testNullBoard(){
		testBoard = UI.board;
		assert(testBoard != null);
	}

	/**
	 * Test Current Player Position.
	 */
	@Test
	public void testCurrentPlayerPosition(){
		testCurrentPlayer = UI.currentPlayer;
		//System.out.println("testCurrentPlayer.getI() = " +testCurrentPlayer.getI() +"testCurrentPlayer.getJ()"+ testCurrentPlayer.getJ());
		Player p1 = testCurrentPlayer;
		assert(p1.getI() == 1);
		assert(p1.getJ() == 9);

	}

	/**
	 * Test Spawn Points. Asserts the board returns correct position for Player Objects to spawn on.
	 */
	@Test
	public void testPlayerSymbols(){
		testBoard = UI.board;
		testPlayers = UI.players;
		Player p1 = testPlayers.get(0);
		Player p2 = testPlayers.get(1);
		Player p3 = testPlayers.get(2);
		Player p4 = testPlayers.get(3);
		Player p5 = testPlayers.get(4);
		Player p6 = testPlayers.get(5);

		System.out.println(p1.getSymbol());
		assert(p1.getSymbol() == '0');
		assert(p2.getSymbol() == '1');
		assert(p3.getSymbol() == '2');
		assert(p4.getSymbol() == '3');
		assert(p5.getSymbol() == '4');
		assert(p6.getSymbol() == '5');
	}

	/**
	 * Test ensures that player are returned the correct character they select at the start of game.
	 */
	@Test
	public void testPlayerSelection(){
		testPlayers = UI.players;
//		for(Player pl : testPlayers){
//			System.out.println("pl.getName()"+pl.getName()+" pl.getI()  "+pl.getI() +"   pl.getJ()" + pl.getJ());
//		}
		Player p1 = testPlayers.get(0);
		Player p2 = testPlayers.get(1);
		Player p3 = testPlayers.get(2);
		Player p4 = testPlayers.get(3);
		Player p5 = testPlayers.get(4);
		Player p6 = testPlayers.get(5);

		assert(p1.getCharName().equals("Professor Plum"));
		assert(p2.getCharName().equals("Mrs White"));
		assert(p3.getCharName().equals("Col Mustard"));
		assert(p4.getCharName().equals("Mrs Peacock"));
		assert(p5.getCharName().equals("Rev Green"));
		assert(p6.getCharName().equals("Miss Scarlet"));
	}


	/**
	 * Tests if the players contains cards in their hard after one round.
	 */
	@Test
	public void testPlayerHands(){
		testPlayers = UI.players;
		Player p1 = testPlayers.get(0);
		Player p2 = testPlayers.get(1);
		Player p3 = testPlayers.get(2);
		Player p4 = testPlayers.get(3);
		Player p5 = testPlayers.get(4);
		Player p6 = testPlayers.get(5);

		assert(p1.getHand().size() == 3);
		assert(p2.getHand().size() == 3);
		assert(p3.getHand().size() == 3);
		assert(p4.getHand().size() == 3);
		assert(p5.getHand().size() == 3);
		assert(p6.getHand().size() == 3);
	}






	/**
	 * Tests Game correctly stores and prints character names from collection.
	 * This will constrain the players to only selecting the correct players.
	 */
	@Test
	public void testCharacters(){
		testCharacters = UI.characters;
		assertnull(testCharacters.get(0));
		assertnull(testCharacters.get(1));
		assertnull(testCharacters.get(2));
		assertnull(testCharacters.get(3));
		assertnull(testCharacters.get(4));
		assertnull(testCharacters.get(5));
	}

	public boolean assertnull(String string) {
		return (string.equals(null));
	}

	/**
	 * Test to see if the current player is correct.
	 */
	@Test
	public void testCurrentPlayer(){
		testCurrentPlayer = UI.currentPlayer;
		//System.out.println("current player is "+ testCurrentPlayer.getName());
		assert(testCurrentPlayer.getCharName().equals("Professor Plum"));
	}



	/**
	 * Tests the trueMurder object is correctly initialized
	 */
	@Test
	public void testTrueMurder(){
		testTrueMurder = UI.trueMurder;
		assert(testTrueMurder.getCharacter() != null);
		assert(testTrueMurder.getRoom() != null);
		assert(testTrueMurder.getWeapon() != null);
	}


}
