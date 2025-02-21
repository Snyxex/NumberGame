/*
 * 
 */
package controll;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Selectmode {

    // Declaration of variables for the window, mode, set number, and random number
    public static JFrame frame;
    public static String mode = "";
    public static int setNumber;
    public static int randomNumber;

    // Main method to start the application
    public static void main(String[] args) {
        new Selectmode();
    }

    // Method to generate a random number
    public static void random() {
        int min = 1;
        Random random = new Random();

        
            // Generate a random number between 1 and the set number (setNumber)
            randomNumber = random.nextInt(Selectmode.setNumber - min + 1);
       
    }

    // Constructor of the Selectmode class
    public Selectmode() {
        // Initialization and configuration of the window
        frame = new JFrame();
        frame.setBounds(0, 0, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Fonts for buttons and labels
        Font font_button = new Font("Verdana", Font.ITALIC, 20);
        Font font = new Font("Verdana", Font.BOLD | Font.ITALIC, 20);

        // Timer object for restarting the game
        Time restart = new Time();

        // Label for the easy mode
        JLabel label2 = new JLabel();
        label2.setBounds(25, 45, 500, 50);
        label2.setFont(font);
        frame.getContentPane().add(label2);
        label2.setText("Easy: finde Die Nummer zwischen 1 - 50");

        // Label for the normal mode
        JLabel label3 = new JLabel();
        label3.setBounds(25, 65, 550, 50);
        label3.setFont(font);
        frame.getContentPane().add(label3);
        label3.setText("Normal: finde Die Nummer zwischen 1 - 500");

        // Label for the hard mode
        JLabel label4 = new JLabel();
        label4.setBounds(25, 85, 550, 50);
        label4.setFont(font);
        frame.getContentPane().add(label4);
        label4.setText("Hard: finde Die Nummer zwischen 1 - 1000");

        // Button for the easy mode
        JButton Gamemodethree = new JButton("Easy");
        Gamemodethree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the current window, set the mode, and start the game in easy mode
                frame.dispose();
                setNumber = 50;
                random();
                new Gamemodeone();
                mode = "Easy";
                restart.restart();
                Writer.numberOfTries = 10;
            }
        });
        Gamemodethree.setFont(font_button);
        Gamemodethree.setBounds(760, 280, 400, 100);
        frame.getContentPane().add(Gamemodethree);
        frame.setVisible(true);

        // Button for the normal mode
        JButton Gamemodetwo = new JButton("Normal");
        Gamemodetwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // Close the current window, set the mode, and start the game in normal mode
                frame.dispose();
                setNumber = 500;
                random();
                new Gamemodeone();
                mode = "Normal";
                restart.restart();
                Writer.numberOfTries = 10;
            }
        });
        Gamemodetwo.setFont(font_button);
        Gamemodetwo.setBounds(760, 440, 400, 100);
        frame.getContentPane().add(Gamemodetwo);

        // Button for the hard mode
        JButton Gamemodeone = new JButton("Hard");
        Gamemodeone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the current window, set the mode, and start the game in hard mode
                frame.dispose();
                setNumber = 1000;
                random();
                new Gamemodeone();
                mode = "Hard";
                restart.restart();
                Writer.numberOfTries = 10;
            }
        });
        Gamemodeone.setFont(font_button);
        Gamemodeone.setBounds(760, 600, 400, 100);
        frame.getContentPane().add(Gamemodeone);
        frame.setVisible(true);

        // Button to display the statistics
        JButton Static = new JButton("Statistics");
        Static.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the current window and open the statistics window
                frame.dispose();
                new Statistic();
                restart.restart();
            }
        });
        Static.setFont(font_button);
        Static.setBounds(1450, 900, 400, 100);
        frame.getContentPane().add(Static);
        frame.setVisible(true);

        // Button to lock the application
        JButton closed = new JButton("Lock");
        closed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the current window and open the lock screen
                if (e.getSource() == closed) {
                    frame.dispose();
                    new Gclose();
                    restart.restart();
                }
            }
        });
        closed.setFont(font_button);
        closed.setBounds(1470, 20, 380, 100);
        frame.getContentPane().add(closed);
        frame.setVisible(true);
    }
}

