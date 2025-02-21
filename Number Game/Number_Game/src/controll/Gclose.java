/*
 * 
 */
package controll;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class Gclose {

    // Declaration of variables for the window and the input field
	private JFrame frame;
	private JTextField textField;
	private String input = "";

    // Constructor of the Gclose class
	public Gclose() {

		// Initialization and configuration of the window
		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		// Fonts for text and buttons
		Font font = new Font("Verdana", Font.BOLD | Font.ITALIC, 20);
		Font font_button = new Font("Verdana", Font.ITALIC, 20);

		// Timer object for restarting the game
		Time restart = new Time();

		// Label for displaying the entered numbers
		JLabel textField = new JLabel();
		textField.setBounds(337, 456, 600, 50);
		textField.setFont(font);
		textField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3, true));
		frame.getContentPane().add(textField);

		// Label for displaying status messages
		JLabel label = new JLabel();
		label.setBounds(337, 390, 300, 50);
		label.setFont(font);
		frame.getContentPane().add(label);

		// Button for the number "0"
		JButton buttonzero = new JButton("0");
		buttonzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "0" to the input and update the text field
				input = input + "0";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonzero.setFont(font_button);
		buttonzero.setBounds(337, 885, 300, 100);
		frame.getContentPane().add(buttonzero);

		// Button for the number "1"
		JButton buttonone = new JButton("1");
		buttonone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "1" to the input and update the text field
				input = input + "1";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonone.setFont(font_button);
		buttonone.setBounds(635, 885, 300, 100);
		frame.getContentPane().add(buttonone);

		// Button for the number "2"
		JButton buttontwo = new JButton("2");
		buttontwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "2" to the input and update the text field
				input = input + "2";
				textField.setText(String.valueOf(input));
				restart.restart();
			}
		});
		buttontwo.setFont(font_button);
		buttontwo.setBounds(337, 790, 300, 100);
		frame.getContentPane().add(buttontwo);

		// Button for the number "3"
		JButton buttonthree = new JButton("3");
		buttonthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "3" to the input and update the text field
				input = input + "3";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonthree.setFont(font_button);
		buttonthree.setBounds(635, 790, 300, 100);
		frame.getContentPane().add(buttonthree);

		// Button for the number "4"
		JButton buttonfour = new JButton("4");
		buttonfour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "4" to the input and update the text field
				input = input + "4";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonfour.setFont(font_button);
		buttonfour.setBounds(337, 695, 300, 100);
		frame.getContentPane().add(buttonfour);

		// Button for the number "5"
		JButton buttonfive = new JButton("5");
		buttonfive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "5" to the input and update the text field
				input = input + "5";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonfive.setFont(font_button);
		buttonfive.setBounds(635, 695, 300, 100);
		frame.getContentPane().add(buttonfive);

		// Button for the number "6"
		JButton buttonsix = new JButton("6");
		buttonsix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "6" to the input and update the text field
				input = input + "6";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonsix.setFont(font_button);
		buttonsix.setBounds(337, 600, 300, 100);
		frame.getContentPane().add(buttonsix);

		// Button for the number "7"
		JButton buttonseven = new JButton("7");
		buttonseven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "7" to the input and update the text field
				input = input + "7";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonseven.setFont(font_button);
		buttonseven.setBounds(635, 600, 300, 100);
		frame.getContentPane().add(buttonseven);

		// Button for the number "8"
		JButton buttoneight = new JButton("8");
		buttoneight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Add "8" to the input and update the text field
				input = input + "8";
				textField.setText(input);
				restart.restart();
			}
		});
		buttoneight.setFont(font_button);
		buttoneight.setBounds(337, 505, 300, 100);
		frame.getContentPane().add(buttoneight);

		// Button for the number "9"
		JButton buttonnine = new JButton("9");
		buttonnine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add "9" to the input and update the text field
				input = input + "9";
				textField.setText(input);
				restart.restart();
			}
		});
		buttonnine.setFont(font_button);
		buttonnine.setBounds(635, 505, 300, 100);
		frame.getContentPane().add(buttonnine);

		// Button to delete the input
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Reset the input and update the text field
				input = "";
				textField.setText("");
				restart.restart();
			}
		});
		delete.setFont(font_button);
		delete.setBounds(935, 505, 300, 100);
		frame.getContentPane().add(delete);

		// Button to confirm the input
		JButton enter = new JButton("Enter");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Define the secure code
				String securecode = "908754";
				// Check if the input matches the secure code
				if (input.equals(securecode)) {
					// Close the current window and open the main menu
					frame.dispose();
					Gamemodeone.input="";
					new Selectmode();
					restart.restart();
				} else {
					// Display an error message
					label.setText("Wrong password");
				}
			}
		});
		enter.setFont(font_button);
		enter.setBounds(935, 600, 300, 100);
		frame.getContentPane().add(enter);
	}
}

