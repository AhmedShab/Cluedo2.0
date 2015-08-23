package gui;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import cluedo.GameController;
import cluedo.GameController.MyMouseAction;
import cluedo.GameController.SwingAction;
public class CluedoGui {

	public JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel game_panel;
	private JPanel guess_panel;
	private CardCanvas cardView;
	private JPanel hand_panel;
	private JPanel pad_panel;
	private BoardCanvas boardView;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnGame;
	private JMenuItem mntmSaveGame;
	private JMenuItem mntmNewGame;
	private JMenuItem mntmQuit;
	private JTextArea textArea;
	private TextField textField;
	private JButton btnRollDice;
	private JButton btnSuggestion;
	private JButton btnAccusation;
	private JButton btnNextplayer;
	private JLabel lblNewLabel;
	private JLabel lblSuspects;
	private JLabel lblLocations;
	private JLabel lblWeapons;
	private JLabel lblPlayerInput;
	private JCheckBox chckbxHenry;
	private JCheckBox chckbxEileen;
	private JCheckBox chckbxHarry;
	private JCheckBox chckbxHeather;
	private JCheckBox chckbxCybil;
	private JCheckBox chckbxTolucaPrison;
	private JCheckBox chckbxHappyBurger;
	private JCheckBox chckbxLakesideAmusementPark;
	private JCheckBox chckbxLakeviewHotel;
	private JCheckBox chckbxRosewaterPark;
	private JCheckBox chckbxBrookhavenHospital;
	private JCheckBox chckbxCafeto;
	private JCheckBox chckbxHeavensNight;
	private JCheckBox chckbxRoom;
	private JCheckBox chckbxShotgun;
	private JCheckBox chckbxChainsaw;
	private JCheckBox chckbxBeamSaber;
	private JCheckBox chckbxSteelPipe;
	private JCheckBox chckbxAxe;
	private JCheckBox chckbxPistol;
	private JCheckBox chckbxMaria;
	private JTextPane textPane;

	/**
	 * Create the application.
	 */
	public CluedoGui() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("cluedo tab gui");
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 520, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		boardView = new BoardCanvas();// Board Panel.
		boardView.setBounds(10, 10, 500, 500);
		frame.getContentPane().add(boardView);
		boardView.setLayout(null);
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("Player Turn");
		tabbedPane.setBounds(10, 520, 500, 220);
		frame.getContentPane().add(tabbedPane);
		game_panel = new JPanel();
		tabbedPane.addTab("Game", null, game_panel, null);
		game_panel.setBackground(Color.WHITE);
		game_panel.setLayout(null);
		textField = new TextField();
		textArea = new JTextArea("Welcome to Cluedo");
		textArea.setBounds(10, 40, 240, 130);
		textArea.setVisible(true);
		game_panel.add(textArea);
		textField.setBounds(10, 10, 240, 25);
		game_panel.add(textField);
		btnSuggestion = new JButton("Suggestion");
		btnSuggestion.setBounds(260, 75, 120, 25);
		game_panel.add(btnSuggestion);
		btnNextplayer = new JButton("Next Player");
		btnNextplayer.setBounds(260, 145, 120, 25);
		game_panel.add(btnNextplayer);
		lblPlayerInput = new JLabel("⇦ Player Input");
		lblPlayerInput.setBounds(260, 10, 121, 25);
		game_panel.add(lblPlayerInput);
		btnRollDice = new JButton("Roll Dice");
		btnRollDice.setBounds(260, 40, 120, 25);
		game_panel.add(btnRollDice);
		btnAccusation = new JButton("Accusation");
		btnAccusation.setBounds(260, 110, 120, 25);
		game_panel.add(btnAccusation);
		lblNewLabel = new JLabel("Player");
		lblNewLabel.setBounds(393, 10, 84, 25);
		game_panel.add(lblNewLabel);
		hand_panel = new JPanel();
		tabbedPane.addTab("Hand", null, hand_panel, "Player Hand");
		tabbedPane.setEnabledAt(1, true);
		hand_panel.setLayout(null);
		cardView = new CardCanvas();
		cardView.setBounds(0, 0, 495, 190);
		hand_panel.add(cardView);
		cardView.setLayout(null);
		guess_panel = new JPanel();
		guess_panel.setToolTipText("Your best guesses");
		tabbedPane.addTab("Guesses", null, guess_panel, null);
		guess_panel.setLayout(null);
		lblSuspects = new JLabel("Suspects");
		lblSuspects.setBounds(10, 10, 70, 15);
		guess_panel.add(lblSuspects);
		lblLocations = new JLabel("Locations");
		lblLocations.setBounds(154, 10, 70, 15);
		guess_panel.add(lblLocations);
		lblWeapons = new JLabel("Weapons");
		lblWeapons.setBounds(360, 10, 70, 15);
		guess_panel.add(lblWeapons);
		chckbxHenry = new JCheckBox("Henry");
		chckbxHenry.setBounds(6, 30, 130, 15);
		guess_panel.add(chckbxHenry);
		chckbxEileen = new JCheckBox("Eileen");
		chckbxEileen.setBounds(6, 45, 129, 15);
		guess_panel.add(chckbxEileen);
		chckbxHarry = new JCheckBox("Harry");
		chckbxHarry.setBounds(6, 60, 129, 15);
		guess_panel.add(chckbxHarry);
		chckbxHeather = new JCheckBox("Heather");
		chckbxHeather.setBounds(6, 90, 129, 15);
		guess_panel.add(chckbxHeather);
		chckbxCybil = new JCheckBox("Cybil");
		chckbxCybil.setBounds(6, 75, 129, 15);
		guess_panel.add(chckbxCybil);
		chckbxTolucaPrison = new JCheckBox("Toluca Prison");
		chckbxTolucaPrison.setBounds(150, 30, 129, 15);
		guess_panel.add(chckbxTolucaPrison);
		chckbxHappyBurger = new JCheckBox("Happy burger");
		chckbxHappyBurger.setBounds(150, 45, 129, 15);
		guess_panel.add(chckbxHappyBurger);
		chckbxLakeviewHotel = new JCheckBox("Lakeview Hotel");
		chckbxLakeviewHotel.setBounds(150, 60, 140, 15);
		guess_panel.add(chckbxLakeviewHotel);
		chckbxLakesideAmusementPark = new JCheckBox("Lakeside Amusement Park");
		chckbxLakesideAmusementPark.setBounds(150, 75, 180, 15);
		guess_panel.add(chckbxLakesideAmusementPark);
		chckbxRosewaterPark = new JCheckBox("Rosewater Park");
		chckbxRosewaterPark.setBounds(150, 90, 150, 15);
		guess_panel.add(chckbxRosewaterPark);
		chckbxBrookhavenHospital = new JCheckBox("BrookHaven Hospital");
		chckbxBrookhavenHospital.setBounds(150, 105, 150, 15);
		guess_panel.add(chckbxBrookhavenHospital);
		chckbxCafeto = new JCheckBox("Cafe 5to2");
		chckbxCafeto.setBounds(150, 120, 129, 15);
		guess_panel.add(chckbxCafeto);
		chckbxHeavensNight = new JCheckBox("Heavens Night");
		chckbxHeavensNight.setBounds(150, 135, 129, 15);
		guess_panel.add(chckbxHeavensNight);
		chckbxRoom = new JCheckBox("Room 302");
		chckbxRoom.setBounds(150, 150, 129, 15);
		guess_panel.add(chckbxRoom);
		chckbxShotgun = new JCheckBox("Shotgun");
		chckbxShotgun.setBounds(356, 45, 129, 15);
		guess_panel.add(chckbxShotgun);
		chckbxChainsaw = new JCheckBox("Chainsaw");
		chckbxChainsaw.setBounds(356, 60, 129, 15);
		guess_panel.add(chckbxChainsaw);
		chckbxBeamSaber = new JCheckBox("Beam Saber");
		chckbxBeamSaber.setBounds(356, 75, 129, 15);
		guess_panel.add(chckbxBeamSaber);
		chckbxSteelPipe = new JCheckBox("Steel Pipe");
		chckbxSteelPipe.setBounds(356, 90, 129, 15);
		guess_panel.add(chckbxSteelPipe);
		chckbxAxe = new JCheckBox("Axe");
		chckbxAxe.setBounds(356, 30, 129, 15);
		guess_panel.add(chckbxAxe);
		chckbxPistol = new JCheckBox("Pistol");
		chckbxPistol.setBounds(356, 105, 129, 15);
		guess_panel.add(chckbxPistol);
		chckbxMaria = new JCheckBox("Maria");
		chckbxMaria.setBounds(6, 105, 129, 15);
		guess_panel.add(chckbxMaria);
		pad_panel = new JPanel();
		tabbedPane.addTab("Note Pad", null, pad_panel, null);
		pad_panel.setLayout(null);
		textPane = new JTextPane();
		textPane.setBounds(12, 12, 470, 170);
		pad_panel.add(textPane);
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		mntmSaveGame = new JMenuItem("Save Game");
		mnFile.add(mntmSaveGame);
		mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		mntmNewGame = new JMenuItem("New Game");
		mnGame.add(mntmNewGame);
		mntmQuit = new JMenuItem("Quit");
		mnGame.add(mntmQuit);
	}

	public void initializeComponentListeners(SwingAction saction, MyMouseAction maction) {

		/////// Initialize the JButtons////////
		btnRollDice.addActionListener(saction);
		btnSuggestion.addActionListener(saction);
		btnAccusation.addActionListener(saction);
		btnNextplayer.addActionListener(saction);





		/////// Initialize the JCheckBoxs////////
		chckbxHenry.addActionListener(saction);
		chckbxEileen.addActionListener(saction);
		chckbxHarry.addActionListener(saction);
		chckbxHeather.addActionListener(saction);
		chckbxCybil.addActionListener(saction);
		chckbxTolucaPrison.addActionListener(saction);
		chckbxHappyBurger.addActionListener(saction);
		chckbxLakesideAmusementPark.addActionListener(saction);
		chckbxLakeviewHotel.addActionListener(saction);
		chckbxRosewaterPark.addActionListener(saction);
		chckbxBrookhavenHospital.addActionListener(saction);
		chckbxCafeto.addActionListener(saction);
		chckbxHeavensNight.addActionListener(saction);
		chckbxRoom.addActionListener(saction);
		chckbxShotgun.addActionListener(saction);
		chckbxChainsaw.addActionListener(saction);
		chckbxBeamSaber.addActionListener(saction);
		chckbxSteelPipe.addActionListener(saction);
		chckbxAxe.addActionListener(saction);
		chckbxPistol.addActionListener(saction);
		chckbxMaria.addActionListener(saction);
		
	/////// Initialize the boardView////////
		boardView.addMouseListener(maction);
		
	}


	public JFrame getFrame() {
		return frame;
	}
	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}
	public JPanel getGame_panel() {
		return game_panel;
	}
	public JPanel getGuess_panel() {
		return guess_panel;
	}
	
	
	
	
	public CardCanvas getCardView() {
		return cardView;
	}
	public BoardCanvas getBoardView() {
		return boardView;
	}
	public JPanel getHand_panel() {
		return hand_panel;
	}
	public JPanel getPad_panel() {
		return pad_panel;
	}


	////////// JMenuBar getters////////////
	public JMenuBar getMenuBar() {
		return menuBar;
	}
	public JMenu getMnFile() {
		return mnFile;
	}
	public JMenu getMnGame() {
		return mnGame;
	}

	////////// JMenuItem getters////////////
	public JMenuItem getMntmSaveGame() {
		return mntmSaveGame;
	}
	public JMenuItem getMntmNewGame() {
		return mntmNewGame;
	}
	public JMenuItem getMntmQuit() {
		return mntmQuit;
	}


	////////// JTextArea getters////////////
	public JTextArea getTextArea() {
		return textArea;
	}

	////////// TextField getters////////////
	public TextField getTextField() {
		return textField;
	}


	////////// Buttons getters////////////
	public JButton getBtnRollDice() {
		return btnRollDice;
	}
	public JButton getBtnSuggestion() {
		return btnSuggestion;
	}

	public JButton getBtnAccusation() {
		return btnAccusation;
	}
	public JButton getBtnNextplayer() {
		return btnNextplayer;
	}


	////////// Labels getters////////////
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}
	public JLabel getLblSuspects() {
		return lblSuspects;
	}
	public JLabel getLblLocations() {
		return lblLocations;
	}
	public JLabel getLblWeapons() {
		return lblWeapons;
	}
	public JLabel getLblPlayerInput() {
		return lblPlayerInput;
	}



	////////// CheckBoxs getters////////////
	public JCheckBox getChckbxHenry() {
		return chckbxHenry;
	}
	public JCheckBox getChckbxEileen() {
		return chckbxEileen;
	}
	public JCheckBox getChckbxHarry() {
		return chckbxHarry;
	}
	public JCheckBox getChckbxHeather() {
		return chckbxHeather;
	}
	public JCheckBox getChckbxCybil() {
		return chckbxCybil;
	}
	public JCheckBox getChckbxTolucaPrison() {
		return chckbxTolucaPrison;
	}
	public JCheckBox getChckbxHappyBurger() {
		return chckbxHappyBurger;
	}
	public JCheckBox getChckbxLakesideAmusementPark() {
		return chckbxLakesideAmusementPark;
	}
	public JCheckBox getChckbxLakeviewHotel() {
		return chckbxLakeviewHotel;
	}
	public JCheckBox getChckbxRosewaterPark() {
		return chckbxRosewaterPark;
	}
	public JCheckBox getChckbxBrookhavenHospital() {
		return chckbxBrookhavenHospital;
	}
	public JCheckBox getChckbxCafeto() {
		return chckbxCafeto;
	}
	public JCheckBox getChckbxHeavensNight() {
		return chckbxHeavensNight;
	}
	public JCheckBox getChckbxRoom() {
		return chckbxRoom;
	}
	public JCheckBox getChckbxShotgun() {
		return chckbxShotgun;
	}
	public JCheckBox getChckbxChainsaw() {
		return chckbxChainsaw;
	}
	public JCheckBox getChckbxBeamSaber() {
		return chckbxBeamSaber;
	}
	public JCheckBox getChckbxSteelPipe() {
		return chckbxSteelPipe;
	}
	public JCheckBox getChckbxAxe() {
		return chckbxAxe;
	}
	public JCheckBox getChckbxPistol() {
		return chckbxPistol;
	}
	public JCheckBox getChckbxMaria() {
		return chckbxMaria;
	}


	////////// JTextPane getters////////////
	public JTextPane getTextPane() {
		return textPane;
	}

	public void setTextField(TextField textField) {
		this.textField = textField;
	}
	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}



}
