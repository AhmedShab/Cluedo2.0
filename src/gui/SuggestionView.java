package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cluedo.GameController.SuggestionAction;

public class SuggestionView extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JFrame frame = new JFrame("Making Suggestion");

	private JLabel label = new JLabel("Please select the cards to make a suggestion");

	private JButton confirm = new JButton("Confirm"); 

	private JTextField characterChoice = new JTextField(15);
	private JTextField weaponChoice = new JTextField(15);
	private JTextField roomChoice = new JTextField(15);

	private String checkCharacter = "";
	private String checkWeapon = "";
	private String checkRoom = "";

	private JComboBox<String> characterSuggestion = new JComboBox<String>();
	private JComboBox<String> weaponSuggestion = new JComboBox<String>();
	private JComboBox<String> roomSuggestion = new JComboBox<String>();

	private String[] characters = { "Henry", "Alex", "Eileen", "Harry","Cybil", "Heather"};
	private String[] weapons = { "Shotgun", "Chainsaw", "Beam Saber", "Steel Pipe","Axe", "Pistol"};
	private String[] rooms = { "Happy Burger", "Lakeview Hotel", "Lakeside Amusement Park", "Rosewater Park","BrookHaven Hospital", "Cafe 5to2","Lounge","Heavens Night","Room 302"};

	public SuggestionView() {
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
			characterSuggestion.addItem(character);
		}

		// add weapons to the comboBox
		for (String weapon : weapons) {
			weaponSuggestion.addItem(weapon);
		}

		// add rooms to the comboBox
		for (String room : rooms) {
			roomSuggestion.addItem(room);
		}

		// Display the chosen character
		characterSuggestion.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				checkCharacter = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				characterChoice.setText(checkCharacter);
			}
		});

		// Display the chosen room
		roomSuggestion.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				checkRoom = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
				roomChoice.setText(checkRoom);
			}
		});

		// Display the chosen weapon
		weaponSuggestion.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
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
		add(characterSuggestion);
		add(roomSuggestion);
		add(weaponSuggestion);
		add(characterChoice);
		add(roomChoice);
		add(weaponChoice);
		add(confirm);
		frame.setVisible(true);
	}
	
	public void characterSuggestionLinstener(SuggestionAction characterSuggestion){
		this.characterSuggestion.addActionListener(characterSuggestion);
	}
	
	public void weaponSuggestionLinstener(SuggestionAction weaponSuggestion){
		this.weaponSuggestion.addActionListener(weaponSuggestion);
	}
	
	public void roomSuggestionLinstener(SuggestionAction roomSuggestion){
		this.roomSuggestion.addActionListener(roomSuggestion);
	}
	
	public void confirmSuggestionListener(SuggestionAction confirm){
		this.confirm.addActionListener(confirm);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public JComboBox<String> getCharacterSuggestion() {
		return characterSuggestion;
	}

	public JComboBox<String> getWeaponSuggestion() {
		return weaponSuggestion;
	}

	public JComboBox<String> getRoomSuggestion() {
		return roomSuggestion;
	}

	public JButton getConfirm() {
		return confirm;
	}
	
	


}
