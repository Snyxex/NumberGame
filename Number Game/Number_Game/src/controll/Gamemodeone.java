


import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;



public class Gamemodeone {

    // Static variables for the main window of the game and the input/output strings
    public static JFrame frame;
    public static String finished = "";
    public static String input = "";
    private JFrame popUp;
    public static JLabel textField;
    // Constructor to initialize the game window and components
    public Gamemodeone() {
        // Timer object for restarting the game
        Time restart = new Time();
        frame = new JFrame();
        // Set the properties of the window
        frame.setBounds(0, 0, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Fonts for text and buttons
        Font font = new Font("Verdana", Font.BOLD | Font.ITALIC, 20);
        Font font_button = new Font("Verdana", Font.ITALIC, 20);

        // Initialize a random number for the game
        Selectmode.random();

        // Label for displaying the entered numbers
        textField = new JLabel();
        textField.setBounds(337, 456, 600, 50);
        textField.setFont(font);
        textField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3, true));
        frame.getContentPane().add(textField);

        // Label for displaying the number of attempts
        JLabel label = new JLabel();
        label.setBounds(337, 390, 300, 50);
        label.setFont(font);
        frame.getContentPane().add(label);

        // Label for displaying whether the guessed number is too high or too low
        JLabel label2 = new JLabel();
        label2.setBounds(337, 410, 420, 50);
        label2.setFont(font);
        frame.getContentPane().add(label2);

        // Label for displaying status messages
        JLabel label3 = new JLabel();
        label3.setBounds(337, 370, 350, 50);
        label3.setFont(font);
        frame.getContentPane().add(label3);

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
                textField.setText(input);
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
                // Convert the input to a number and compare it with the random number
                int guess = Integer.parseInt(input);
                Writer.numberOfTries--;

                // Check if the guessed number is too high, too low, or correct
                if (guess > Selectmode.randomNumber) {
                    label3.setText("Die Nummer ist zu Hoch");
                } else if (guess < Selectmode.randomNumber) {
                    label3.setText("Die Nummer ist zu Niedrig");
                } else if (guess == Selectmode.randomNumber) {
                    label3.setText("Die Nummer ist Richtig");
                }
                label.setText("Attempts: " + Writer.numberOfTries);

                if (Writer.numberOfTries >= 0) {
                    try {
                        if (guess == Selectmode.randomNumber) {
                            label2.setText("Gewonnen");
                            finished = "Gewonnen";
                            playerID();
                            input = "";
                            textField.setText("");
                        } else {
                            label2.setText("Die Nummer ist falsch");
                            input = "";
                            textField.setText("");
                        }
                    } catch (Exception z) {
                    }

                    if (Writer.numberOfTries == 0) {
                        label2.setText("Game Over! Die Numemr war: " + Selectmode.randomNumber);
                        input = "";
                        finished = "Verloren";
                        textField.setText("");
                        playerID();
                    }
                }
                restart.restart();
            }
        });
        enter.setFont(font_button);
        enter.setBounds(935, 600, 300, 100);
        frame.getContentPane().add(enter);

        // Button to display the statistics
        JButton Static = new JButton("Statistics");
        Static.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = "";
                frame.dispose();
                new Statistic();
                restart.restart();
            }
        });
        Static.setFont(font_button);
        Static.setBounds(1500, 130, 369, 100);
        frame.getContentPane().add(Static);

        // Button to return to the main menu
        JButton selectpage_button = new JButton("Hauptmenü");
        selectpage_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = "";
                new Selectmode();
                frame.dispose();
                restart.restart();
            }
        });
        selectpage_button.setFont(font_button);
        selectpage_button.setBounds(1500, 24, 369, 100);
        frame.getContentPane().add(selectpage_button);

        // Button to lock the game
        JButton close_button = new JButton("Lock");
        close_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Gclose();
                frame.dispose();
                restart.restart();
                textField.setText(" ");
            }
        });
        close_button.setFont(font_button);
        close_button.setBounds(26, 24, 369, 100);
        frame.getContentPane().add(close_button);

        // Make the window visible
        frame.setVisible(true);

        // Output the random number for debugging purposes
        System.out.println(Selectmode.randomNumber);
    }

    // Method to query the player ID after the game ends
    public void playerID() {
        JFrame frame = new JFrame();
        JPanel contentPane;
    	JTextField textField;
        frame.getContentPane().setLayout(null);
        frame.setBounds(0,0,650,400);
        
        frame.setVisible(true);
		textField = new JTextField();
		textField.setBounds(6, 6, 554, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		Time restart = new Time();
		
		JButton button_A = new JButton("A");
		button_A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"A");
			}
		});
		button_A.setBounds(0, 55, 117, 29);
		frame.getContentPane().add(button_A);
		
		JButton button_B = new JButton("B");
		button_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"B");
			}
		});
		button_B.setBounds(129, 55, 117, 29);
		frame.getContentPane().add(button_B);
		
		JButton button_C = new JButton("C");
		button_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"C");
			}
		});
		button_C.setBounds(258, 55, 117, 29);
		frame.getContentPane().add(button_C);
		
		JButton button_D = new JButton("D");
		button_D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"D");
			}
		});
		button_D.setBounds(387, 55, 117, 29);
		frame.getContentPane().add(button_D);
		
		JButton button_E = new JButton("E");
		button_E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"E");
			}
		});
		button_E.setBounds(502, 55, 117, 29);
		frame.getContentPane().add(button_E);
		
		JButton button_F = new JButton("F");
		button_F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"F");
			}
		});
		button_F.setBounds(0, 84, 117, 29);
		frame.getContentPane().add(button_F);
		
		JButton button_G = new JButton("G");
		button_G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"G");
			}
		});
		button_G.setBounds(129, 84, 117, 29);
		frame.getContentPane().add(button_G);
		
		JButton button_H = new JButton("H");
		button_H.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"H");
			}
		});
		button_H.setBounds(258, 84, 117, 29);
		frame.getContentPane().add(button_H);
		
		JButton button_I = new JButton("I");
		button_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"I");
			}
		});
		button_I.setBounds(387, 84, 117, 29);
		frame.getContentPane().add(button_I);
		
		JButton button_J = new JButton("J");
		button_J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"J");
			}
		});
		button_J.setBounds(502, 84, 117, 29);
		frame.getContentPane().add(button_J);
		
		JButton button_K = new JButton("K");
		button_K.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"K");
			}
		});
		button_K.setBounds(0, 116, 117, 29);
		frame.getContentPane().add(button_K);
		
		JButton button_L = new JButton("L");
		button_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"L");
			}
		});
		button_L.setBounds(129, 116, 117, 29);
		frame.getContentPane().add(button_L);
		
		JButton button_M = new JButton("M");
		button_M.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"M");
			}
		});
		button_M.setBounds(258, 116, 117, 29);
		frame.getContentPane().add(button_M);
		
		JButton button_N = new JButton("N");
		button_N.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"N");
			}
		});
		button_N.setBounds(387, 116, 117, 29);
		frame.getContentPane().add(button_N);
		
		JButton button_O = new JButton("O");
		button_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"O");
			}
		});
		button_O.setBounds(502, 116, 117, 29);
		frame.getContentPane().add(button_O);
		
		JButton button_Q = new JButton("Q");
		button_Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"Q");
			}
		});
		button_Q.setBounds(129, 149, 117, 29);
		frame.getContentPane().add(button_Q);
		
		JButton button_R = new JButton("R");
		button_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"R");
			}
		});
		button_R.setBounds(258, 149, 117, 29);
		frame.getContentPane().add(button_R);
		
		JButton button_S = new JButton("S");
		button_S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"S");
			}
		});
		button_S.setBounds(387, 149, 117, 29);
		frame.getContentPane().add(button_S);
		
		JButton button_T = new JButton("T");
		button_T.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"T");
			}
		});
		button_T.setBounds(502, 149, 117, 29);
		frame.getContentPane().add(button_T);
		
		JButton button_U = new JButton("U");
		button_U.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"U");
			}
		});
		button_U.setBounds(0, 181, 117, 29);
		frame.getContentPane().add(button_U);
		
		JButton button_V = new JButton("V");
		button_V.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"V");
			}
		});
		button_V.setBounds(129, 181, 117, 29);
		frame.getContentPane().add(button_V);
		
		JButton button_W = new JButton("W");
		button_W.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"W");
			}
		});
		button_W.setBounds(258, 181, 117, 29);
		frame.getContentPane().add(button_W);
		
		JButton button_X = new JButton("X");
		button_X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"X");
			}
		});
		button_X.setBounds(387, 181, 117, 29);
		frame.getContentPane().add(button_X);
		
		JButton button_Y = new JButton("Y");
		button_Y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"Y");
			}
		});
		button_Y.setBounds(502, 181, 117, 29);
		frame.getContentPane().add(button_Y);
		
		JButton button_Z = new JButton("Z");
		button_Z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText()+"Z");
				 restart.restart();
			}
		});
		button_Z.setBounds(0, 211, 117, 29);
		frame.getContentPane().add(button_Z);
		
		JButton button_P = new JButton("P");
		button_P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 restart.restart();
				 textField.setText(textField.getText()+"P");
			
			}
		});
		button_P.setBounds(0, 149, 117, 29);
		frame.getContentPane().add(button_P);
		
		JButton button_submit = new JButton("Bestätigen");
		button_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Writer.playerID = textField.getText();
                new Writer();
                frame.dispose();
                restart.restart();
                Writer.numberOfTries = 10;
                Gamemodeone.frame.dispose();
                new Gamemodeone();
			}
		});
		button_submit.setBounds(502, 222, 117, 29);
		frame.getContentPane().add(button_submit);
		
		JButton button_clear = new JButton("Löschen");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				 restart.restart();
				 }
		
		});
		button_clear.setBounds(387, 222, 117, 29);
		frame.getContentPane().add(button_clear);
    }
}
