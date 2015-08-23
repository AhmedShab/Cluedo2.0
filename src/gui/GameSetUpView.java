package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import cluedo.GameController.SetUpAction;

/**
 * Deals with creating the user interface for the game setup
 * @author Ahmed
 *
 */
public class GameSetUpView extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final JFrame frame = new JFrame("Cluedo Game setup");


	private JLabel label = new JLabel("Enter your name and select a character");

	private JButton addPlayer = new JButton("Add Player");
	private JButton cancel = new JButton("Cancel");
	private JButton start = new JButton("Start");

	private String charName = "";
	private JLabel lableName = new JLabel("Name: ");
	private JTextField textFieldRealName = new JTextField(8);

	private JRadioButton radio1 = new JRadioButton("Henry");
	private JRadioButton radio2 = new JRadioButton("Eileen");
	private JRadioButton radio3 = new JRadioButton("Harry");
	private JRadioButton radio4 = new JRadioButton("Cybil");
	private JRadioButton radio5 = new JRadioButton("Heather");
	private JRadioButton radio6 = new JRadioButton("Maria");
	private JRadioButton[] characters;

	public GameSetUpView(){
		setUpWindow();
	}


	private void setUpWindow() {


		//Add list of character to display
		characters = new JRadioButton[]{radio1, radio2, radio3, radio4, radio5, radio6};


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		frame.add(this);
		add(label);
		add(lableName);
		add(textFieldRealName);


		for (JRadioButton radioButton : characters) {
			add(radioButton);
		}

		add(addPlayer);
		add(cancel);
		add(start);

		setUpRadioButton();
		//		setUpButton();
		//		setUpTextField();
		frame.setLocationRelativeTo(null);
		frame.setSize(240, 400);
		frame.setVisible(true);

	}




	// Make all the a group button for the characters so that they can only select one radio button when the user click on one
	private void setUpRadioButton() {
		ButtonGroup group = new ButtonGroup();
		ActionListener e = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton radio = (JRadioButton) e.getSource();
				if (radio == radio1) {
					charName = radio1.getText();
				} else if (radio == radio2) {
					charName = radio2.getText();
				}  else if (radio == radio3) {
					charName = radio3.getText();
				}  else if (radio == radio4) {
					charName = radio4.getText();
				}  else if (radio == radio5) {
					charName = radio5.getText();
				}  else if (radio == radio6) {
					charName = radio6.getText();
				} else {
				}
			}
		};

		// each radio button have a different action
		for(JRadioButton radio: characters)
			radio.addActionListener(e);
		for(JRadioButton radio: characters)
			group.add(radio);

	}


	public String getCharName() {
		return charName;
	}


	public void setCharName(String charName) {
		this.charName = charName;
	}


	public void addPlayerLinstener(SetUpAction addPlayer){
		this.addPlayer.addActionListener(addPlayer);
	}

	public void startGameLinstener(SetUpAction startGame){
		this.start.addActionListener(startGame);
	}
	
	public void cancelLinstener(SetUpAction cancel){
		this.cancel.addActionListener(cancel);
	}


	public JButton getAddPlayer() {
		return addPlayer;
	}


	public void setAddPlayer(JButton addPlayer) {
		this.addPlayer = addPlayer;
	}


	public JTextField getTextFieldRealName() {
		return textFieldRealName;
	}


	public void setTextFieldRealName(JTextField textFieldRealName) {
		this.textFieldRealName = textFieldRealName;
	}


	public JButton getStart() {
		return start;
	}


	public void setStart(JButton start) {
		this.start = start;
	}


	public JRadioButton[] getCharacters() {
		return characters;
	}


	public void setCharacters(JRadioButton[] characters) {
		this.characters = characters;
	}


	public JButton getCancel() {
		return cancel;
	}


	public void setCancel(JButton cancel) {
		this.cancel = cancel;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	
	

}
