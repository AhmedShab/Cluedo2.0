package helper;

import cluedo.GameModel;
import gui.CluedoGui;

public class Texthelper {
	
	public Texthelper() {
	}

	public String printInvalidMove(){
		return "invalid move!";
	}
	public String printInvalidSuggestion(){
		return "You have to be in a room to make a suggestion!";
	}
	public String printInvalidAccusation(){
		return "You need to use all your moves first!";
	}
	public String printInvalidNextPlayer(){
		return "You have to finish all your moves first!";
	}
	public String printInvalidRoll(){
		return "You already rolled the dice!";
	}
	public String printError(){
		return "error!";
	}

}
