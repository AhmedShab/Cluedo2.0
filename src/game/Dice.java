package game;

import java.util.Random;

public class Dice {
	Random random = new Random();
	
	public Dice() {
		// TODO Auto-generated constructor stub
	}
	
	public int nextRandom(){
		 int randomDice = (random.nextInt((6 - 1) + 1) + 1);
		 
		 return randomDice;
	}

}
