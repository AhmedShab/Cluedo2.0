package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cluedo.GameController.AccusationAction;
import cluedo.GameController.SwingAction;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import  javax.swing.JComboBox;

public class AccusationView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JFrame frame = new JFrame("Making Accusation");

	private JLabel label = new JLabel("Please select the cards to make an accusation");

	private JButton confirm = new JButton("Confirm"); 

	private JTextField characterChoice = new JTextField(15);
	private JTextField weaponChoice = new JTextField(15);
	private JTextField roomChoice = new JTextField(15);

	private String checkCharacter = "";
	private String checkWeapon = "";
	private String checkRoom = "";

	private JComboBox<String> characterAccusation = new JComboBox<String>();
	private JComboBox<String> weaponAccusation = new JComboBox<String>();
	private JComboBox<String> roomAccusation = new JComboBox<String>();

	private String[] characters = { "Henry", "Alex", "Eileen", "Harry","Cybil", "Heather"};
	private String[] weapons = { "Shotgun", "Chainsaw", "Beam Saber", "Steel Pipe","Axe", "Pistol"};
	private String[] rooms = { "Happy Burger", "Lakeview Hotel", "Lakeside Amusement Park", "Rosewater Park","BrookHaven Hospital", "Cafe 5to2","Toluca Prison","Heavens Night","Room 302"};

	public AccusationView() {
		setupFrame();
		setupComboBox();
		displayGui();
	}

	private void setupFrame() {
		frame.pack();
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 400);


	}


	private void setupComboBox() {
		
		// add characters to the comboBox
		for (String character : characters) {
			characterAccusation.addItem(character);
		}

		// add weapons to the comboBox
		for (String weapon : weapons) {
			weaponAccusation.addItem(weapon);
		}

		// add rooms to the comboBox
		for (String room : rooms) {
			roomAccusation.addItem(room);
		}

		// Display the chosen character
		characterAccusation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkCharacter = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				characterChoice.setText(checkCharacter);
			}
		});

		// Display the chosen room
		roomAccusation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkRoom = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				roomChoice.setText(checkRoom);
			}
		});

		// Display the chosen weapon
		weaponAccusation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkWeapon = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				weaponChoice.setText(checkWeapon);

			}
		});


	}

		private void displayGui() {
			setLayout(new FlowLayout());
			add(label);
			add(characterAccusation);
			add(roomAccusation);
			add(weaponAccusation);
			add(characterChoice);
			add(roomChoice);
			add(weaponChoice);
			add(confirm);
			frame.setVisible(true);
		}
		
		public JComboBox<String> getCharacterAccusation() {
			return characterAccusation;
		}

		public void setCharacterAccusation(JComboBox<String> characterAccusation) {
			this.characterAccusation = characterAccusation;
		}

		public JComboBox<String> getWeaponAccusation() {
			return weaponAccusation;
		}

		public void setWeaponAccusation(JComboBox<String> weaponAccusation) {
			this.weaponAccusation = weaponAccusation;
		}

		public JComboBox<String> getRoomAccusation() {
			return roomAccusation;
		}

		public JButton getConfirm() {
			return confirm;
		}


		public void setRoomAccusation(JComboBox<String> roomAccusation) {
			this.roomAccusation = roomAccusation;
		}


		public String getCharacterChoice() {
			return characterChoice.getText();
		}

		public String getWeaponChoice() {
			return weaponChoice.getText();
		}

		public String getRoomChoice() {
			return roomChoice.getText();
		}
		
		
		public void characterAccusationLinstener(AccusationAction characterAccusation){
			this.characterAccusation.addActionListener(characterAccusation);
		}
		
		public void weaponAccusationLinstener(AccusationAction weaponAccusation){
			this.weaponAccusation.addActionListener(weaponAccusation);
		}
		
		public void roomAccusationLinstener(AccusationAction roomAccusation){
			this.roomAccusation.addActionListener(roomAccusation);
		}
		
		public void confirmAccusationListener(AccusationAction confirm){
			this.confirm.addActionListener(confirm);
		}
		
		
		
		public JFrame getFrame() {
			return frame;
		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
		}
		

	}
