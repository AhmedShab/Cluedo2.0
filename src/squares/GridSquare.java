package squares;

import java.awt.Point;

/**
 * Represents a basic, 'empty' square on the board which a player
 * may step on. Has no function other than to be 'walked' on.
 *
 */
public class GridSquare extends Square {

	//private player;
	/**
	 * Constructor for class GridSquare.
	 */
	public GridSquare(Point point){
		super(true, point);
	}

	@Override
	public char boardChar() {
		return '_';
	}

}
