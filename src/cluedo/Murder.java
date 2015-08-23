package cluedo;

import card.Card;

/**a Murder is a simple class representing a murder. The murder has 3 fields, for three different types of cards: a weapon
 * a character and a room. A player making a suggestion/accusation informs the UI whom makes a murder to compare
 * to the true murder contained in the board. The equals method has been overidden to aid this.
 * @author mcleankand
 *
 */
public class Murder {
	private Card character;
	private Card weapon;
	private Card room;

	public Murder(Card[] murder){
		this.character= murder[0];
		this.weapon= murder[1];
		this.room= murder[2];
	}

	public Card getCharacter() {
		return character;
	}
	public Card getWeapon() {
		return weapon;
	}
	public Card getRoom() {
		return room;
	}
	
	public String toString(){
		return "It was "+ character.getName() + " in the "+room.getName()+ " with the "+ weapon.getName();
		
	}
	
//	public void setCardInMurder(){
//		room.setMurder();
//		weapon.setMurder();
//		character.setMurder();
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((character == null) ? 0 : character.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Murder other = (Murder) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (weapon == null) {
			if (other.weapon != null)
				return false;
		} else if (!weapon.equals(other.weapon))
			return false;
		return true;
	}





}
