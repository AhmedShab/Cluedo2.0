package squares;

import java.awt.Point;

import cluedo.*;

/**
 * Represents a 'secret passage' on the board.
 *
 */
public class ShortcutSquare extends Square {

	private String toRoom; // the room the shortcut goes to
	private int toRow; // the row this shortcut goes to
	private int toCol; // the col this shortcut goes to
	/**
	 * Constructor for class ShortcutSquare.
	 * @param toRoom The room the shortcut goes to
	 * @param board The board the shortcut is on
	 */
	public ShortcutSquare(String toRoom, Board board, Point p){
		super(true, p);
		this.toRoom = toRoom;
//		toRow = findRow(toRoom);
//		toCol = findCol(toRoom);
	}

	/**
	 * Finds the row of the shortcut in the given room
	 * @param room The room with the shortcut
	 * @return The row of the shortcut in the given room,
	 * or -1 if there is none.
	 */
//	private static int findRow(String room) {
//		switch(room){
//		case cluedo.ROSEWATERPARK : return 2;
//		case cluedo.STUDY : return 21;
//		case cluedo.LOUNGE : return 20;
//		case cluedo.CONSERVATORY : return 4;
//		default : return -1;
//		}
//	}

	/**
	 * Finds the column of the shortcut in the given room
	 * @param room The room with the shortcut
	 * @return The column of the shortcut in the given room, or
	 * -1 if there is none.
	 */
//	private static int findCol(String room) {
//		switch(room){
//		case cluedo.ROSEWATERPARK : return 4;
//		case cluedo.STUDY : return 22;
//		case cluedo.LOUNGE : return 1;
//		case cluedo.CONSERVATORY : return 22;
//		default : return -1;
//		}
//	}

	/**
	 * Gets the room this shortcut goes to.
	 * @return The name of the room at the other end of
	 * this shortcut.
	 */
	public String toRoom(){
		return this.toRoom;
	}

	/**
	 * Gets the row this shortcut leads to.
	 * @return The row of the square at the other end of
	 * this shortcut.
	 */
	public int toRow() {
		return toRow;
	}

	/**
	 * Gets the column this shortcut leads to.
	 * @return The column of the square at the other end of
	 * this shortcut.
	 */
	public int toCol() {
		return toCol;
	}

	@Override
	public char boardChar() {
		return '~';
	}

}
