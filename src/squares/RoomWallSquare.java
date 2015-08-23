package squares;

import java.awt.Point;

import cluedo.*;

/**
 * Represents the wall of a certain room, which players cannot
 * walk through.
 *
 */
public class RoomWallSquare extends Square {

	private String room;
	/**
	 * Constructor for class RoomWallSquare.
	 * @param room The room this square is walling
	 */
	public RoomWallSquare(String room, Point p){
		super(false, p);
		this.room = room;
	}

	@Override
	public char boardChar() {
		switch(this.room){
		case CluedoSetUp.HAPPY_BURGER : return 'K';
		case CluedoSetUp.LAKEVIEW_HOTEL : return 'B';
		case CluedoSetUp.AMUSEMENT_PARK : return 'C';
		case CluedoSetUp.ROSEWATER_PARK : return 'P';
		case CluedoSetUp.BROOKHAVEN_HOSPITAL : return 'L';
		case CluedoSetUp.CAFE_5TO2 : return 'S';
		case CluedoSetUp.HEAVENS_NIGHT : return 'H';
		case CluedoSetUp.ROOM_302 : return 'G';
		case CluedoSetUp.TOLUCA_PRSION : return 'D';
		default : return ' ';
		}
	}


}
