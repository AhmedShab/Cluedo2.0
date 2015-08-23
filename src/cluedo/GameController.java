package cluedo;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import card.Card;
import card.CharacterCard;
import card.WeaponCard;
import gui.AccusationView;
import gui.CluedoGui;
import gui.GameSetUpView;
import gui.SuggestionView;
import helper.Imagehelper;
import helper.Texthelper;

public class GameController {

	private GameModel gameModel;
	private GameSetUpView setup;
	private CluedoSetUp setUpGame;
	private AccusationView accusation;
	private SuggestionView suggestion;
	private Texthelper instructions;
	//			BoardView board;

	boolean playerRolled = false;
	int movesRemaining;
	CluedoGui gui;

	public GameController(CluedoGui gui){
		this.gui = gui;
		this.setup = new GameSetUpView();
		this.gameModel = new GameModel();
		this.setUpGame = new CluedoSetUp(gameModel);
		//		gameModel.board.printBoard();

		this.addGuiListeners();
		
		System.out.println("test github");
		System.out.println("test AhmedWork github");
		
		System.out.println("test AhmedShab github");







	}

	private void addGuiListeners(){

		SwingAction saction = new SwingAction();
		MyMouseAction maction = new MyMouseAction();
		this.gui.initializeComponentListeners(saction, maction);

		/////// Setting the game setup actions////////
		SetUpAction setUp = new SetUpAction();

		this.setup.addPlayerLinstener(setUp);
		this.setup.startGameLinstener(setUp);
		this.setup.cancelLinstener(setUp);



	}

	//		public void rollDice(){
	//			if(playerRolled == false){
	//					movesRemaining = game.getDiceRoll();
	//			}
	//			playerRolled = true;
	//		}
	//
	//		public void accusation(){
	//			boolean playerAccusation;
	//
	//			if(movesRemaining == 0){
	//
	//				game.accuasation = new Accusation();
	//				gui.InitialiseAccusationGuI(game.accusation);
	//				playerAccusation = game.checkAccusation();
	//			}
	//			if(playerAccusation == true){
	//				gui.setYou won the game.
	//			}else{
	//				game.removePlayer();
	//			}
	//			//gui.TextOutput.appendPleaseExhaust all your moves.
	//		}
	//
	//		public void suggestion(){
	//
	//			boolean playerSuggestion;
	//			if(movesRemaining == 0){
	//
	//				game.accuasation = new Accusation();
	//				gui.InitialiseAccusationGuI(game.cusation);
	//				playerAccusation = game.checkAccusation();
	//			}
	//			if(playerAccusation == true){
	//				gui.setYou won the game.
	//			}else{
	//				game.removePlayer();
	//			}
	//
	//		}
	//
	//		public void nextPlay(){}
	//


	public class SwingAction implements ActionListener{

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {

			Object whatWasClicked =  e.getSource();

			/////// Initialize the button listener////////
			if (whatWasClicked == gui.getBtnRollDice()) {

				System.out.println(e.getActionCommand() +" was clicked");
				playerRolled = true;

			}

			else if (whatWasClicked == gui.getBtnSuggestion()) {

				System.out.println(e.getActionCommand() +" was clicked");

				suggestion = new SuggestionView();
				/////// Setting the game accusation actions////////
				SuggestionAction suggestionListener = new SuggestionAction();

				suggestion.characterSuggestionLinstener(suggestionListener);
				suggestion.weaponSuggestionLinstener(suggestionListener);
				suggestion.roomSuggestionLinstener(suggestionListener);
				suggestion.confirmSuggestionListener(suggestionListener);

			}

			else if (whatWasClicked == gui.getBtnAccusation()) {

				System.out.println(e.getActionCommand() +" was clicked");

				accusation = new AccusationView();
				/////// Setting the game accusation actions////////
				AccusationAction accusationListener = new AccusationAction();

				accusation.characterAccusationLinstener(accusationListener);
				accusation.weaponAccusationLinstener(accusationListener);
				accusation.roomAccusationLinstener(accusationListener);
				accusation.confirmAccusationListener(accusationListener);

			}

			else if (whatWasClicked == gui.getBtnNextplayer()) {

				System.out.println(e.getActionCommand() +" was clicked");

			}

			/////// Initialize the checkBoxs listener////////
			if (whatWasClicked == gui.getChckbxHenry()) {
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxEileen()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxHarry()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxHeather()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxCybil()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxMaria()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxTolucaPrison()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxHappyBurger()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxLakesideAmusementPark()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxLakeviewHotel()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxRosewaterPark()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxLakeviewHotel()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxRosewaterPark()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxBrookhavenHospital()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxCafeto()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxHeavensNight()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxRoom()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxShotgun()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxChainsaw()){
				System.out.println(e.getActionCommand() +" was clicked");
			}


			else if(whatWasClicked == gui.getChckbxBeamSaber()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxSteelPipe()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxAxe()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

			else if(whatWasClicked == gui.getChckbxPistol()){
				System.out.println(e.getActionCommand() +" was clicked");
			}

		}

	}



	public class SetUpAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			Object whatWasClicked =  e.getSource();

			/////////////// Set up game listener/////////
			if(whatWasClicked == setup.getAddPlayer()){

				if(!setup.getTextFieldRealName().getText().equals("")){
					String realName = setup.getTextFieldRealName().getText();
					String charName = setup.getCharName();
					setUpGame.getPlayers().add(new Player(realName, charName));

					//// debugging purposes/////
					System.out.println("name: " + realName + "\nchar: "+ charName);
					System.out.println(setUpGame.getPlayers().size());
					//// debugging purposes/////

				}

				// Clear the text afterwards
				setup.getTextFieldRealName().setText("");


				// if maximum number of players have been added then disable the add player button 
				if(setUpGame.getPlayers().size() == 6){
					JOptionPane.showMessageDialog(null, "You reached the maximum number of players!");
					setup.getAddPlayer().setEnabled(false);
				}

				for(int i = 1; i < setUpGame.getPlayers().size(); i++){
					for (int j = i - 1; j < i; j++) {
						if(setUpGame.getPlayers().get(i).getRealName().equals(setUpGame.getPlayers().get(j).getRealName())){
							JOptionPane.showMessageDialog(null, "Name already been used!");
							setUpGame.getPlayers().remove(i);
							return;
						}

						if(setUpGame.getPlayers().get(i).getCharName().equals(setUpGame.getPlayers().get(j).getCharName())){
							JOptionPane.showMessageDialog(null, "Character already been selected!");
							setUpGame.getPlayers().remove(i);
							return;
						}
					}
				}

				// disable the radio buttons after the user selected one 
				for(JRadioButton radioChar: setup.getCharacters()){
					if(radioChar.isSelected()) {
						radioChar.setEnabled(false);
					}
				}


			}




			// Check before the game starts
			else if (whatWasClicked == setup.getStart()) {

				if(setUpGame.getPlayers().size() < 3){
					JOptionPane.showMessageDialog(null, "Minimum number of players must be 3!!");
				}


				// Start the game
				else {

					System.out.println("Start the game");
					setUpGame.dealCards();
					//					System.out.println("players: " + gameModel.getPlayers());
					gameModel.setCurrentPlayer(gameModel.getPlayers().get(0));  // make current player player the first player in the list for debugging
					System.out.println(gameModel.getMurder().toString());

					setup.getFrame().setVisible(false);


				}

			}



			// To cancel the game
			else if (whatWasClicked == setup.getCancel()) {

				System.exit(1);

			}


		}

	}

	public class AccusationAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {

			Object whatWasClicked =  e.getSource();

			/////////////// Making accusation listener /////////
			if (whatWasClicked == accusation.getCharacterAccusation()){

				/// SuspectCard
				Player currentPlayer = gameModel.getCurrentPlayer();
				Imagehelper SuspectImage = new Imagehelper();

				@SuppressWarnings("unchecked")
				String character = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				Card accusedSuspectCard  = new CharacterCard(character, SuspectImage);
				currentPlayer.setAccusationSuspect(accusedSuspectCard);

			}

			else if (whatWasClicked == accusation.getWeaponAccusation()){

				/// WeaponCard
				Player currentPlayer = gameModel.getCurrentPlayer();
				Imagehelper weaponImage = new Imagehelper();

				@SuppressWarnings("unchecked")
				String weapon = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				Card accusedSuspectCard  = new WeaponCard(weapon, weaponImage);

				currentPlayer.setAccusationWeapon(accusedSuspectCard);
			}

			else if (whatWasClicked == accusation.getRoomAccusation()){

				/// RoomCard
				Player currentPlayer = gameModel.getCurrentPlayer();
				Imagehelper roomImage = new Imagehelper();

				@SuppressWarnings("unchecked")
				String room = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				Card accusedSuspectCard  = new WeaponCard(room, roomImage);

				currentPlayer.setAccusationRoom(accusedSuspectCard);

			}

			else if (whatWasClicked == accusation.getConfirm()) {

				//// debugging purposes/////
				System.out.println(gameModel.getCurrentPlayer().getAccusationSuspect().toString());
				System.out.println(gameModel.getCurrentPlayer().getAccusationRoom().toString());
				System.out.println(gameModel.getCurrentPlayer().getAccusationWeapon().toString());
				//// debugging purposes/////

				//				if(checkCharacter.equals("") || checkRoom.equals("") || checkWeapon.equals("")){
				//
				//										JOptionPane.showMessageDialog(frame, "Please select all the options first!");
				//									}
				//
				//									else{
				//										
				//									}
				//										JOptionPane.showMessageDialog(frame, "Are you sure you want to make this accusation?");
				//
				//									}
				//								} );


				accusation.getFrame().setVisible(false);


			}

		}
	}


	public class SuggestionAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {

			Object whatWasClicked =  e.getSource();

			/////////////// Making suggestion listener /////////
			if (whatWasClicked == suggestion.getCharacterSuggestion()){

				/// SuspectCard
				Player currentPlayer = gameModel.getCurrentPlayer();
				Imagehelper SuspectImage = new Imagehelper();

				@SuppressWarnings("unchecked")
				String character = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				Card suggestedSuspectCard  = new CharacterCard(character, SuspectImage);
				currentPlayer.setSuggestedSuspect(suggestedSuspectCard);

			}

			else if (whatWasClicked == suggestion.getWeaponSuggestion()){

				/// WeaponCard
				Player currentPlayer = gameModel.getCurrentPlayer();
				Imagehelper weaponImage = new Imagehelper();

				@SuppressWarnings("unchecked")
				String weapon = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				Card suggestedSuspectCard  = new WeaponCard(weapon, weaponImage);

				currentPlayer.setSuggestedWeapon(suggestedSuspectCard);
			}

			else if (whatWasClicked == suggestion.getRoomSuggestion()){

				/// RoomCard
				Player currentPlayer = gameModel.getCurrentPlayer();
				Imagehelper roomImage = new Imagehelper();

				@SuppressWarnings("unchecked")
				String room = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				Card suggestedSuspectCard  = new WeaponCard(room, roomImage);

				currentPlayer.setSuggestedRoom(suggestedSuspectCard);

			}

			else if (whatWasClicked == suggestion.getConfirm()) {

				//// debugging purposes/////
				System.out.println(gameModel.getCurrentPlayer().getSuggestedSuspect().toString());
				System.out.println(gameModel.getCurrentPlayer().getSuggestedRoom().toString());
				System.out.println(gameModel.getCurrentPlayer().getSuggestedWeapon().toString());
				//// debugging purposes/////

				//				if(checkCharacter.equals("") || checkRoom.equals("") || checkWeapon.equals("")){
				//
				//										JOptionPane.showMessageDialog(frame, "Please select all the options first!");
				//									}
				//
				//									else{
				//										
				//									}
				//										JOptionPane.showMessageDialog(frame, "Are you sure you want to make this accusation?");
				//
				//									}
				//								} );


				suggestion.getFrame().setVisible(false);


			}

		}
	}



	/**
	 * MouseAction class to set actionListeners to components inside the GUI.
	 * @author copleyquen
	 *
	 */

	public class MyMouseAction implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub


		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("mouse was released at" + e.getPoint());

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	//	class MenuActionListener implements ActionListener {
	//		public void actionPerformed (ActionEvent actionEvent) {
	//
	//			System.out.println ("Selected: " + actionEvent.getActionCommand());
	//		}
	//	}
}
