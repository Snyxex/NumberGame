/*
 * 
 */
package controll;




import java.awt.Color;
import java.awt.Font;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.border.EmptyBorder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Statistic {

    private JFrame frame;
    private JTextField textField;
    private JTable table;
    private DefaultTableModel tableModel;
    private TableRowSorter<DefaultTableModel> sorter;

    public Statistic() {
        Font font = new Font("Verdana", Font.BOLD | Font.ITALIC, 20);
        Font font_button = new Font("Verdana", Font.ITALIC, 20);
        Time restart = new Time();
        frame = new JFrame();
        frame.setBounds(0, 0, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        Vector<Vector<String>> data = new Vector<>();
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Name");
        columnNames.add("Datum");
        columnNames.add("Zeit");
        columnNames.add("Schwierigkeitsgrad");
        columnNames.add("Ergebnis");
        columnNames.add("Score");

        try (BufferedReader br = new BufferedReader(new FileReader("Statistic_save.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Vector<String> row = new Vector<>();
                String[] parts = line.split(" ");
                row.add(parts[0]);  // Name
                row.add(parts[1]);  // Datum
                row.add(parts[2]);  // Zeit
                row.add(parts[3]);  // Schwierigkeitsgrad
                row.add(parts[4]);  // Ergebnis
                row.add(parts[5]);  // Score
                data.add(row);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error reading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        tableModel = new DefaultTableModel(data, columnNames);
        table = new JTable(tableModel);
        table.setFont(font);
        table.setBackground(Color.white);
        table.setRowHeight(30);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 1200, 1000);
        frame.getContentPane().add(scrollPane);

        sorter = new TableRowSorter<>(tableModel);
        table.setRowSorter(sorter);

        textField = new JTextField();
        textField.setBounds(1257, 75, 350, 36);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel filter = new JLabel("Geben Sie die Wörter ein um nach was zu Suchen");
        filter.setBounds(1257, 11, 600, 50);
        frame.getContentPane().add(filter);
        filter.setFont(font);

        

        JButton close_button = new JButton("Lock");
        close_button.setBounds(1550, 830, 300, 100);
        frame.getContentPane().add(close_button);
        close_button.setFont(font_button);
        close_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Gclose();
                restart.restart();
                // Add your restart logic here if needed
            }
        });

        JButton modemenue_button = new JButton("Hauptmenü");
        modemenue_button.setBounds(1550, 730, 300, 100);
        frame.getContentPane().add(modemenue_button);
        modemenue_button.setFont(font_button);
        modemenue_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add your main menu logic here
                frame.dispose();
                new Selectmode();
                restart.restart();
            }
        });

        // Adding buttons to facilitate filter input.
        JButton button_1 = new JButton("1");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
                restart.restart();
            }
        });
        button_1.setBounds(1257, 147, 89, 23);
        frame.getContentPane().add(button_1);

        JButton button_7 = new JButton("7");
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
                restart.restart();
            }
        });
        button_7.setBounds(1257, 177, 89, 23);
        frame.getContentPane().add(button_7);

        JButton button_C = new JButton("C");
        button_C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "C");
                restart.restart();
            }
        });
        button_C.setBounds(1257, 207, 89, 23);
        frame.getContentPane().add(button_C);

        JButton button_I = new JButton("I");
        button_I.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "I");
                restart.restart();
            }
        });
        button_I.setBounds(1257, 241, 89, 23);
        frame.getContentPane().add(button_I);

        // Additional buttons for entering more characters.
        JButton button_2 = new JButton("2");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
                restart.restart();
            }
        });
        button_2.setBounds(1356, 147, 89, 23);
        frame.getContentPane().add(button_2);

        JButton button_3 = new JButton("3");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
                restart.restart();
            }
        });
        button_3.setBounds(1455, 147, 89, 23);
        frame.getContentPane().add(button_3);

        JButton button_4 = new JButton("4");
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
                restart.restart();
            }
        });
        button_4.setBounds(1550, 147, 89, 23);
        frame.getContentPane().add(button_4);

        JButton button_5 = new JButton("5");
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
                restart.restart();
            }
        });
        button_5.setBounds(1649, 147, 89, 23);
        frame.getContentPane().add(button_5);

        JButton button_6 = new JButton("6");
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
                restart.restart();
            }
        });
        button_6.setBounds(1748, 147, 89, 23);
        frame.getContentPane().add(button_6);

        JButton button_8 = new JButton("8");
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
                restart.restart();
            }
        });
        button_8.setBounds(1356, 177, 89, 23);
        frame.getContentPane().add(button_8);

        JButton button_9 = new JButton("9");
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
                restart.restart();
            }
        });
        button_9.setBounds(1455, 177, 89, 23);
        frame.getContentPane().add(button_9);

        JButton button_0 = new JButton("0");
        button_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
                restart.restart();
            }
        });
        button_0.setBounds(1550, 177, 89, 23);
        frame.getContentPane().add(button_0);

        JButton button_A = new JButton("A");
        button_A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "A");
                restart.restart();
            }
        });
        button_A.setBounds(1649, 177, 89, 23);
        frame.getContentPane().add(button_A);

        JButton button_B = new JButton("B");
        button_B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "B");
                restart.restart();
            }
        });
        button_B.setBounds(1748, 177, 89, 23);
        frame.getContentPane().add(button_B);

        JButton button_D = new JButton("D");
        button_D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "D");
                restart.restart();
            }
        });
        button_D.setBounds(1356, 207, 89, 23);
        frame.getContentPane().add(button_D);

        JButton button_E = new JButton("E");
        button_E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "E");
                restart.restart();
            }
        });
        button_E.setBounds(1455, 207, 89, 23);
        frame.getContentPane().add(button_E);

        JButton button_F = new JButton("F");
        button_F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "F");
                restart.restart();
            }
        });
        button_F.setBounds(1550, 207, 89, 23);
        frame.getContentPane().add(button_F);

        JButton button_G = new JButton("G");
        button_G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "G");
                restart.restart();
            }
        });
        button_G.setBounds(1649, 207, 89, 23);
        frame.getContentPane().add(button_G);

        JButton button_H = new JButton("H");
        button_H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "H");
                restart.restart();
            }
        });
        button_H.setBounds(1748, 207, 89, 23);
        frame.getContentPane().add(button_H);

        JButton button_J = new JButton("J");
        button_J.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "J");
                restart.restart();
            }
        });
        button_J.setBounds(1356, 241, 89, 23);
        frame.getContentPane().add(button_J);

        JButton button_K = new JButton("K");
        button_K.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "K");
                restart.restart();
            }
        });
        button_K.setBounds(1455, 241, 89, 23);
        frame.getContentPane().add(button_K);

        JButton button_L = new JButton("L");
        button_L.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "L");
                restart.restart();
            }
        });
        button_L.setBounds(1550, 241, 89, 23);
        frame.getContentPane().add(button_L);

        JButton button_M = new JButton("M");
        button_M.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "M");
                restart.restart();
            }
        });
        button_M.setBounds(1649, 241, 89, 23);
        frame.getContentPane().add(button_M);

        JButton button_N = new JButton("N");
        button_N.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "N");
                restart.restart();
            }
        });
        button_N.setBounds(1748, 241, 89, 23);
        frame.getContentPane().add(button_N);

        JButton button_O = new JButton("O");
        button_O.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "O");
                restart.restart();
            }
        });
        button_O.setBounds(1356, 272, 89, 23);
        frame.getContentPane().add(button_O);

        JButton button_P = new JButton("P");
        button_P.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "P");
                restart.restart();
            }
        });
        button_P.setBounds(1455, 272, 89, 23);
        frame.getContentPane().add(button_P);

        JButton button_Q = new JButton("Q");
        button_Q.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "Q");
                restart.restart();
            }
        });
        button_Q.setBounds(1550, 272, 89, 23);
        frame.getContentPane().add(button_Q);

        JButton button_R = new JButton("R");
        button_R.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "R");
                restart.restart();
            }
        });
        button_R.setBounds(1649, 272, 89, 23);
        frame.getContentPane().add(button_R);

        JButton button_S = new JButton("S");
        button_S.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "S");
                restart.restart();
            }
        });
        button_S.setBounds(1748, 272, 89, 23);
        frame.getContentPane().add(button_S);

        JButton button_T = new JButton("T");
        button_T.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "T");
                restart.restart();
            }
        });
        button_T.setBounds(1356, 301, 89, 23);
        frame.getContentPane().add(button_T);

        JButton button_U = new JButton("U");
        button_U.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "U");
                restart.restart();
            }
        });
        button_U.setBounds(1455, 301, 89, 23);
        frame.getContentPane().add(button_U);

        JButton button_V = new JButton("V");
        button_V.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "V");
                restart.restart();
            }
        });
        button_V.setBounds(1550, 301, 89, 23);
        frame.getContentPane().add(button_V);

        JButton button_W = new JButton("W");
        button_W.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "W");
                restart.restart();
            }
        });
        button_W.setBounds(1649, 301, 89, 23);
        frame.getContentPane().add(button_W);

        JButton button_X = new JButton("X");
        button_X.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "X");
                restart.restart();
            }
        });
        button_X.setBounds(1748, 301, 89, 23);
        frame.getContentPane().add(button_X);

        JButton button_Y = new JButton("Y");
        button_Y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "Y");
                restart.restart();
            }
        });
        button_Y.setBounds(1356, 330, 89, 23);
        frame.getContentPane().add(button_Y);

        JButton button_Z = new JButton("Z");
        button_Z.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "Z");
                restart.restart();
            }
        });
        button_Z.setBounds(1455, 330, 89, 23);
        frame.getContentPane().add(button_Z);

        JButton button_space = new JButton("Space");
        button_space.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " ");
                restart.restart();
            }
        });
        button_space.setBounds(1550, 330, 287, 23);
        frame.getContentPane().add(button_space);

        JButton button_del = new JButton("Delete");
        button_del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 restart.restart();
                textField.setText("");
            }
        });
        button_del.setBounds(1839, 147, 89, 23);
        frame.getContentPane().add(button_del);
        
        JButton button_reset = new JButton("Stats Reset");
        button_reset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 restart.restart();
        		stats_reset();
        	}
        });
        button_reset.setFont(new Font("Verdana", Font.ITALIC, 20));
        button_reset.setBounds(1550, 932, 300, 100);
        frame.getContentPane().add(button_reset);
        
        JButton button_enter = new JButton("Enter");
        button_enter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 restart.restart();
        	}
        });
        button_enter.setBounds(1839, 177, 89, 23);
        frame.getContentPane().add(button_enter);

        frame.setVisible(true);
    }




 public void stats_reset() {
	    JFrame frame_reset = new JFrame();
		frame_reset.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_reset.setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame_reset.setVisible(true);
		frame_reset.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBounds(137, 23, 150, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Time restart = new Time();
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
				 restart.restart();
			}
		});
		button_1.setBounds(19, 75, 117, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
				 restart.restart();
			}
		});
		button_2.setBounds(147, 75, 117, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
				 restart.restart();
			}
		});
		button_3.setBounds(290, 75, 117, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
				 restart.restart();
			}
		});
		button_4.setBounds(19, 124, 117, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
				 restart.restart();
			}
		});
		button_5.setBounds(19, 179, 117, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
				 restart.restart();
			}
		});
		button_6.setBounds(147, 124, 117, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
				 restart.restart();
			}
		});
		button_7.setBounds(147, 179, 117, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
				 restart.restart();
			}
		});
		button_8.setBounds(290, 124, 117, 29);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
				 restart.restart();
			}
		});
		button_9.setBounds(290, 179, 117, 29);
		contentPane.add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
				 restart.restart();
			}
		});
		button_0.setBounds(147, 220, 117, 29);
		contentPane.add(button_0);
		
		JButton button_enter = new JButton("Enter");
		button_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text = textField.getText();
				if(text.equals("786543")) {
					try {
						FileWriter writer = new FileWriter("Statistic_save.txt");
						writer.write("");
						writer.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					new Statistic();
				}else {
					textField.setText("Falsche Eingabe");
					
				}
				 restart.restart();
			}
		});
		button_enter.setBounds(290, 220, 117, 29);
		contentPane.add(button_enter);
		
		JButton button_clear = new JButton("Clear");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				 restart.restart();
			}
		});
		button_clear.setBounds(19, 220, 117, 29);
		contentPane.add(button_clear);
	}
 
}
