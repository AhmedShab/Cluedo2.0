package cluedo;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import squares.*;

/**
 * A 2D array representation of the Cluedo playing board.
 */

public class Board {
	public static int ROWS = 25;
	public static int COLS = 24;

	private Square[][] board = new Square[ROWS][COLS];

	/**
	 * Constructor for class Board.
	 */
	public Board(){
		File f = new File("C:\\Users\\Ahmed-laptop\\Google Drive\\workspace\\A2_222\\src\\cluedo\\silentHillBoard.txt");
		parse(f);
	}

	/**
	 * Loads a board from a given file.
	 * @param file The file containing the board data.
	 */
	public void parse(File file){
		int squareWidth = 0;
		int squareHieght = 0;




		try{
			Scanner s = new Scanner(file);
			// create queues of special squares
			Queue<Character> title = titleChars();
//			Queue<String> players = startPlayers();
			Queue<String> shortcuts = shortcutRooms();
			// iterate over each row



			for(int r = 0; r<board.length; r++){
				String line = s.nextLine();
				// parse each column in row r
				squareWidth = 0;
				for(int c=0; c < board[0].length; c++){
					Point p = new Point(squareWidth,squareHieght);
					char code = line.charAt(c); // get the character in the file
					// determine the Square corresponding to the code
					Square sq = squareTypeFromCode(code, title, shortcuts, p);
					// add the square to the board
					board[r][c] = sq;
					squareWidth += 20;
				}
				squareHieght +=20;
			}
			s.close();
		} catch(IOException e){
			System.out.println("Error loading file: "+ e.getMessage());
		}
	}

	/**
	 * Creates a new square based on the code read from the file.
	 * @param code A character from the file
	 * @param title The remaining letters of 'CLUEDO'
	 * @param shortcuts The remaining shortcut rooms
	 * @return A Square corresponding to the given code.
	 */
	private Square squareTypeFromCode(char code, Queue<Character> title,
			 Queue<String> shortcuts, Point point) {
		Square sq = null;
		switch(code){
		case '/' : sq = new BlankSquare(point); break;
		case '_' : sq = new GridSquare(point); break;
		case '?' : sq = new CharSquare('?', point); break;
		case '#' : sq = new CharSquare(title.poll(), point); break;
		case '~' : sq = new ShortcutSquare(shortcuts.poll(), this, point); break;
		case '*' : sq = new StarterSquare(point); break;
		case 'K' : sq = new RoomWallSquare(CluedoSetUp.HAPPY_BURGER, point); break;
		case 'B' : sq = new RoomWallSquare(CluedoSetUp.LAKEVIEW_HOTEL, point); break;
		case 'C' : sq = new RoomWallSquare(CluedoSetUp.AMUSEMENT_PARK, point); break;
		case 'P' : sq = new RoomWallSquare(CluedoSetUp.ROSEWATER_PARK, point); break;
		case 'L' : sq = new RoomWallSquare(CluedoSetUp.BROOKHAVEN_HOSPITAL, point); break;
		case 'S' : sq = new RoomWallSquare(CluedoSetUp.CAFE_5TO2, point); break;
		case 'H' : sq = new RoomWallSquare(CluedoSetUp.HEAVENS_NIGHT, point); break;
		case 'G' : sq = new RoomWallSquare(CluedoSetUp.ROOM_302, point); break;
		case 'D' : sq = new RoomWallSquare(CluedoSetUp.TOLUCA_PRSION, point); break;
		case 'k' : sq = new RoomSquare(CluedoSetUp.HAPPY_BURGER, point); break;
		case 'b' : sq = new RoomSquare(CluedoSetUp.LAKEVIEW_HOTEL, point); break;
		case 'c' : sq = new RoomSquare(CluedoSetUp.AMUSEMENT_PARK, point); break;
		case 'p' : sq = new RoomSquare(CluedoSetUp.ROSEWATER_PARK, point); break;
		case 'l' : sq = new RoomSquare(CluedoSetUp.BROOKHAVEN_HOSPITAL, point); break;
		case 's' : sq = new RoomSquare(CluedoSetUp.CAFE_5TO2, point); break;
		case 'h' : sq = new RoomSquare(CluedoSetUp.HEAVENS_NIGHT, point); break;
		case 'g' : sq = new RoomSquare(CluedoSetUp.ROOM_302, point); break;
		case 'd' : sq = new RoomSquare(CluedoSetUp.TOLUCA_PRSION, point); break;
		}
		return sq;
	}

	/**
	 * Creates a queue containing each letter of the word CLUEDO.
	 * @return A queue containing the letters (in order) C, L,
	 * U, E, D, O
	 */
	private Queue<Character> titleChars(){
		Queue<Character> title = new LinkedList<Character>();
		title.add('C');
		title.add('L');
		title.add('U');
		title.add('E');
		title.add('D');
		title.add('O');
		return title;
	}

	/**
	 * Creates a queue containing the room at each shortcut
	 * location, in the order that they will be parsed.
	 * @return A queue containing the room at each shortcut
	 * location, in the order that they will be parsed.
	 */
	private Queue<String> shortcutRooms(){
		Queue<String> rooms = new LinkedList<String>();
		rooms.add(CluedoSetUp.CAFE_5TO2);
		rooms.add(CluedoSetUp.ROOM_302);
		rooms.add(CluedoSetUp.AMUSEMENT_PARK);
		rooms.add(CluedoSetUp.HAPPY_BURGER);
		return rooms;
	}

	/**
	 * Make a copy of the board.
	 * @return A new 2D array referencing all the same Squares as
	 * the board field.
	 */
	public void printBoard(){
		for(int r=0; r<ROWS; r++){
			for(int c=0; c<COLS; c++){
				System.out.print(board[r][c].boardChar());
				//System.out.print(board[r][c].getPoint());
			}
			System.out.println();
		}
		for(int r=0; r<ROWS; r++){
			for(int c=0; c<COLS; c++){
				//System.out.print(board[r][c].getPoint().toString());
			}
			System.out.println();
		}
	}

	/**
	 * Displays the board on the console.
	 */
//	public void draw(List<Player> players){
//		// replace squares for player positions
//		Square[][] drawBoard = copyBoard();
//		for (Player p : players){
//			drawBoard[p.row()][p.column()] = new CharSquare(p.ID());
//		}
//
//		// iterate over every row
//		for(int r=0; r<ROWS; r++){
//			// don't draw a wall if the next square is blank or a letter
//			boolean drawnBlank = false;
//			if(drawBoard[r][0] instanceof BlankSquare){
//				System.out.print(" ");
//			} else {
//				System.out.print("|");
//			}
//			// iterate over every column in r
//			for(int c=0; c<COLS; c++){
//				Square sq = drawBoard[r][c];
//				// don't draw a wall if this square is blank or a letter
//				if(sq instanceof BlankSquare || sq instanceof CharSquare){
//					if(drawnBlank){
//						System.out.print(" ");
//					}
//					System.out.print(sq.boardChar());
//					drawnBlank = true;
//					continue;
//				}
//				// if we've just drawn a blank square, draw a wall
//				if(drawnBlank){
//					System.out.print("|");
//					drawnBlank = false;
//				}
//				// print this square's symbol
//				System.out.print(sq.boardChar());
//				// draw a wall
//				System.out.print("|");
//			}
//			// print characters that are on this row
//			for (Player p : players){
//				if (p.row() == r){
//					System.out.print(" <- " + p.getName());
//				}
//			}
//			System.out.println();
//		}
//	}

	/**
	 * Returns the square at the given position.
	 * @param row The row of the desired square
	 * @param col The column of the desired square
	 * @return The Square at board[row][col]
	 */
	public Square squareAt(int row, int col){
		return board[row][col];
	}
//	public static void main(String[] args) {
//		Board b = new Board();
//		b.printBoard();
//	}
	
}
