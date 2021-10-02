package SOSpackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Game extends JFrame implements ActionListener {

	private JPanel contentPane;
	boolean player1;
	boolean player2;
	GUI gui;
	int score1=0;
	int score2=0;
	Random rnd = new Random();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {

		gui = new GUI(this);
		this.add(gui);
		
	}
	

	public void whogofirst()
	{
		if (rnd.nextInt(2)==0)
		{ 
			
			player1= true;
			gui.p1first();
			
		}
		else
		{
			player2=true;
			gui.p2first();
		}
	}
	
	public void enableradio()
	{
		JRadioButton[] buttons = new JRadioButton[]{gui.human1, gui.human2, gui.simplegame, gui.genegame, gui.comp1, gui.comp2};
		for (JRadioButton btn : buttons) {
	         btn.setEnabled(true);
	    }
	}
	public void disableradio()
	{
		JRadioButton[] buttons = new JRadioButton[]{gui.human1, gui.human2, gui.simplegame, gui.genegame, gui.comp1, gui.comp2};
		for (JRadioButton btn : buttons) {
	         btn.setEnabled(false);
	    }
	}
	
	
	public int checkwinner(int assign)
	{
		int count =0;
		int horizon[]= {1,2,3,4,5,6,9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 21, 22, 25, 26, 27, 28, 29, 30, 33, 34, 35, 36, 37, 38, 41, 42, 43, 44, 45, 46, 49, 50, 51, 52, 53, 54};
		int diagonal[]= {9, 10, 11, 12, 13, 14, 17, 18, 19, 20, 21, 22, 25, 26, 27, 28, 29, 30, 33, 34, 35, 36, 37, 38, 41, 42, 43, 44, 45, 46, 49, 50, 51, 52, 53, 54};
		int diagonal2[]= {18,19,20,21,26,27,28,29,34,35,36,37,42,43,44,45};
		int diagonal3[]= {0,1,8,9};
		int diagonal4[]= {6,7,14,15};
		int diagonal5[]= {48,49,56,57};
		int diagonal6[]= {54,55,62,63};
		int diagonal7[]= {2,3,4,5,10,11,12,13};
		int diagonal8[]= {50,51,52,53,58,59,60,61};
				
				
				
		for (int a = 0; a < 62; a++)
		{
			if (a == assign) 
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+1].getText() == "O" && gui.Node[assign+2].getText() == "S" )
				{
					count++;
				}
				
			}
		}
		for (int a = 2; a < 64; a++)
		{
			if (a == assign) 
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-1].getText() == "O" && gui.Node[assign-2].getText() == "S" )
				{
					count++;
				}
				
			}
		}
		for (int a : horizon)
		{
			if (a == assign) 
			{
				if (gui.Node[assign].getText() == "O" && gui.Node[assign-1].getText() == "S" && gui.Node[assign+1].getText() == "S" )
				{
					count++;
				}
				
			}
		}
		for (int a = 0; a < 47; a++)	
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+8].getText() == "O" && gui.Node[assign+16].getText() == "S" )
				{
					count++;
				}
				
			}
				
		}
		for (int a = 16; a <64; a++)	
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-8].getText() == "O" && gui.Node[assign-16].getText() == "S" )
				{
					count++;
				}
				
			}
				
		}
		for (int a = 8; a <55; a++)	
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "O" && gui.Node[assign-8].getText() == "S" && gui.Node[assign+8].getText() == "S" )
				{
					count++;
				}
				
			}
				
		}
		
		for (int a  : diagonal)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "O" && gui.Node[assign-7].getText() == "S" && gui.Node[assign+7].getText() == "S" )
				{
					count++;
				}
				if (gui.Node[assign].getText() == "O" && gui.Node[assign-9].getText() == "S" && gui.Node[assign+9].getText() == "S" )
				{
					count++;
				}
			
			}
		}
		for (int a  : diagonal2)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-7].getText() == "O" && gui.Node[assign-14].getText() == "S" )	
				{
					count++;
				}
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-9].getText() == "O" && gui.Node[assign-18].getText() == "S" )
				{
					count++;
				}
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+7].getText() == "O" && gui.Node[assign+14].getText() == "S" )
				{
					count++;
				}
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+9].getText() == "O" && gui.Node[assign+18].getText() == "S" )
				{
					count++;
				}
					
			}
		}
		for (int a  : diagonal3)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+9].getText() == "O" && gui.Node[assign+18].getText() == "S" )
				{
					count++;
				}
					
			}
		}
		for (int a  : diagonal4)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+7].getText() == "O" && gui.Node[assign+14].getText() == "S" )
				{
					count++;
				}
					
			}
		}
		for (int a  : diagonal5)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-7].getText() == "O" && gui.Node[assign-14].getText() == "S" )
				{
					count++;
				}
					
			}
		}
		for (int a  : diagonal6)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-9].getText() == "O" && gui.Node[assign-18].getText() == "S" )
					
				{
					count++;
				}
					
			}
		}
		for (int a  : diagonal7)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+7].getText() == "O" && gui.Node[assign+14].getText() == "S")
				{
					count++;
				}
				if (gui.Node[assign].getText() == "S" && gui.Node[assign+9].getText() == "O" && gui.Node[assign+18].getText() == "S" )
				{
					count++;
				}
					
			}
		}
		for (int a  : diagonal8)
		{
			if (a == assign)
			{
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-7].getText() == "O" && gui.Node[assign-14].getText() == "S" )
				{
					count++;
				}
				if (gui.Node[assign].getText() == "S" && gui.Node[assign-9].getText() == "O" && gui.Node[assign-18].getText() == "S" )
				{
					count++;
				}
					
			}
		}
		return count;
	
	}		
		
		
		
	public void resetgame()
	{
		for (int i = 0; i <64; i++)
		{
			gui.Node[i].setText("");
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (gui.human1.isSelected() && gui.human2.isSelected() && gui.simplegame.isSelected())
		{
			disableradio();
			
			int checker;
			for (int i =0; i < 64; i++)
			{
				
				if (e.getSource() == gui.Node[i])
				{
					
					
					if (player1 && gui.S1.isSelected())
					{
						
						if(gui.Node[i].getText()== "")
						{
							gui.change1(i);
							gui.Node[i].setText("S");
							player1= false;
							player2=true;
							checker = checkwinner(i);
							if (checker != 0)
							{
								JOptionPane.showMessageDialog(gui, "player 1 wins");
								score1+= checker;
								gui.P1score.setText(String.valueOf(score1));
								resetgame();
							}
							else
							{
								continue;
							}
						}
						
					}
					else if (player1 && gui.O1.isSelected())
					{
						
						if(gui.Node[i].getText()== "")
						{
							gui.change1(i);
							gui.Node[i].setText("O");
							player1 = false;
							player2=true;
							checker = checkwinner(i);
							if (checker != 0)
							{
								JOptionPane.showMessageDialog(gui, "player 1 wins");
								score1+=checker;
								gui.P1score.setText(String.valueOf(score1));
								resetgame();
							}
							else
							{
								continue;
							}
						}
						
						
					}

					else if (player2 && gui.S2.isSelected())
					{
						
						if(gui.Node[i].getText()== "")
						{
							gui.change2(i);
							gui.Node[i].setText("S");
							player1= true;
							player2= false;
							checker = checkwinner(i);
							if (checker != 0)
							{
								JOptionPane.showMessageDialog(gui, "player 2 wins");
								score2+=checker;
								gui.P2score.setText(String.valueOf(score2));
								resetgame();
							}
							else
							{
								continue;
							}
						}
						
					}
					else if (player2 && gui.O2.isSelected())
					{
						
						if(gui.Node[i].getText()== "")
						{
							gui.change2(i);
							gui.Node[i].setText("O");
							player1 = true;
							player2=false;
							checker = checkwinner(i);
							if (checker != 0)
							{
								JOptionPane.showMessageDialog(gui, "player 2 wins");
								score2+=checker;
								gui.P2score.setText(String.valueOf(score2));
								resetgame();	
							}
							else
							{
								continue;
							}
						}
						
					}
				}
			}
			
		}
		else if (gui.human1.isSelected() && gui.human2.isSelected() && gui.genegame.isSelected())
		{
				disableradio();
				int checker1;
				for (int i =0; i < 64; i++)
				{
					if (e.getSource() == gui.Node[i])
					{
						
						if (player1 && gui.S1.isSelected())
						{
							
							if(gui.Node[i].getText()== "")
							{
								gui.change1(i);
								gui.Node[i].setText("S");
								player1= false;
								player2=true;
								checker1=checkwinner(i);
								if (checker1 != 0)
								{
									score1+=checker1;
									gui.P1score.setText(String.valueOf(score1));
								}
								else
								{
									continue;
								}	
							}
							
						}
						else if (player1 && gui.O1.isSelected())
						{
							
							if(gui.Node[i].getText()== "")
							{
								gui.change1(i);
								gui.Node[i].setText("O");
								player1 = false;
								player2=true;
								checker1=checkwinner(i);
								if (checker1 != 0)
								{
									score1+= checker1;
									gui.P1score.setText(String.valueOf(score1));
								}
								else
								{
									continue;
								}	
								
							}
							
							
						}

						else if (player2 && gui.S2.isSelected())
						{
							
							if(gui.Node[i].getText()== "")
							{
								gui.change2(i);
								gui.Node[i].setText("S");
								player1= true;
								player2= false;
								checker1=checkwinner(i);
								if (checker1 != 0)
								{
									score2 += checker1;
									gui.P2score.setText(String.valueOf(score2));
								}
								else
								{
									continue;
								}	
							}
							
						}
						else if (player2 && gui.O2.isSelected())
						{
							
							if(gui.Node[i].getText()== "")
							{
								gui.change2(i);
								gui.Node[i].setText("O");
								player1 = true;
								player2=false;
								checker1=checkwinner(i);
								if (checker1 != 0)
								{
									score2+=checker1;
									gui.P2score.setText(String.valueOf(score2));
								}
								else
								{
									continue;
								}	
							}
							
						}
						
					}
				}
		}
		
		
	}
}
