package squares;

import java.awt.Point;

/**
 * Represents a square which is essentially outside of the board:
 * the player cannot step on it, and it essentially has no function.
 *
 */
public class BlankSquare extends Square {

	/**
	 * Constructor for class BlankSquare.
	 */
	public BlankSquare(Point p) {
		super(false, p);
	}

	@Override
	public char boardChar() {
		return ' ';
	}

}
