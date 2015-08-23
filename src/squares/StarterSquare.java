package squares;

import java.awt.Point;

/**
 * A square on which players may start the game.
 *
 */
public class StarterSquare extends Square {

	/**
	 * Constructor for class Square.
	 */
	public StarterSquare(Point p){
		super(true, p);
	}

	@Override
	public char boardChar() {
		return '*';
	}

}
