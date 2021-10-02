package SOSpackage;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JPanel implements ActionListener {

	/**
	 * Create the panel.
	 */
	Game game;
	JButton[] Node = new JButton[64];
	JPanel Grid = new JPanel();
	JLabel greenturn = new JLabel("");
	JLabel redturn = new JLabel("");
	JRadioButton S1 = new JRadioButton("S");
	JRadioButton O1 = new JRadioButton("O");
	JRadioButton S2 = new JRadioButton("S");
	JRadioButton O2 = new JRadioButton("O");
	ButtonGroup SO1 = new ButtonGroup();
	ButtonGroup SO2 = new ButtonGroup();
	ButtonGroup mode = new ButtonGroup();
	ButtonGroup p2= new ButtonGroup();
	ButtonGroup p1 = new ButtonGroup();
	JButton newgame = new JButton("New Game");
	JButton P1score = new JButton("0");
	JButton P2score = new JButton("0");
	JRadioButton comp1 = new JRadioButton("Computer");
	JRadioButton human1 = new JRadioButton("Human");
	JRadioButton human2 = new JRadioButton("Human");
	JRadioButton comp2 = new JRadioButton("Computer");
	JRadioButton simplegame = new JRadioButton("Simple Game");
	JRadioButton genegame = new JRadioButton("General Game");
	public GUI(Game parentGame) {
		
		game = parentGame;
		setLayout(null);
		
		JLabel Title = new JLabel("Benjamin Nguyen SOS Game");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Title.setBounds(282, 105, 529, 52);
		add(Title);
		
		
		human1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		human1.setBounds(23, 267, 172, 59);
		add(human1);
		

		S1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		S1.setBounds(55, 329, 172, 59);
		add(S1);
		
		
		
		O1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		O1.setBounds(55, 401, 172, 59);
		add(O1);
		
		
		comp1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		comp1.setBounds(23, 475, 172, 59);
		add(comp1);
		
		
		human2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		human2.setBounds(893, 267, 172, 59);
		add(human2);
		
		
		S2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		S2.setBounds(934, 329, 172, 59);
		add(S2);
		
		
		O2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		O2.setBounds(934, 401, 172, 59);
		add(O2);
		
		
		comp2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		comp2.setBounds(893, 475, 172, 59);
		add(comp2);
		
		
		simplegame.setFont(new Font("Tahoma", Font.PLAIN, 26));
		simplegame.setBounds(306, 164, 234, 59);
		add(simplegame);
		
		genegame.setFont(new Font("Tahoma", Font.PLAIN, 26));
		genegame.setBounds(581, 164, 195, 59);
		add(genegame);
		
		Grid.setForeground(Color.WHITE);
		Grid.setSize(470, 476);
		Grid.setLocation(306, 231);
		Grid.setLayout(new GridLayout(8,8));
		Grid.setBackground(new Color(150, 150, 150));
		
		for (int i = 0; i <64; i++)
		{
			Node[i]= new JButton();
			Grid.add(Node[i]);
			Node[i].setFocusable(false);
			Node[i].setFont(new Font("Tahoma", Font.PLAIN, 31));
			Node[i].addActionListener(this);
		}
		add(Grid);
		JButton replay = new JButton("Replay");
		replay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.enableradio();
				initial();
				game.resetgame();
				game.whogofirst();
				
			}
		});
		replay.setFont(new Font("Tahoma", Font.PLAIN, 30));
		replay.setBounds(878, 768, 172, 67);
		add(replay);
		
		
		newgame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initial();
				game.enableradio();
				game.resetgame();
				game.whogofirst();
				P1score.setText("0");
				P2score.setText("0");
			}
		});
		newgame.setFont(new Font("Tahoma", Font.PLAIN, 28));
		newgame.setBounds(878, 861, 172, 67);
		add(newgame);
		
		
		
		
		greenturn.setFont(new Font("Tahoma", Font.PLAIN, 30)); greenturn.setBounds(39, 630, 188, 44); add(greenturn);
		redturn.setFont(new Font("Tahoma", Font.PLAIN, 30)); redturn.setBounds(862, 630, 188, 44); add(redturn);
		
		p1.add(human1); p1.add(comp1);
		
		p2.add(human2); p2.add(comp2);
		
		SO1.add(S1); SO1.add(O1);
		
		SO2.add(S2); SO2.add(O2);
		
		mode.add(simplegame); mode.add(genegame);
 
 JLabel P1 = new JLabel("Player 1");
 P1.setFont(new Font("Tahoma", Font.PLAIN, 33));
 P1.setBounds(39, 108, 140, 52);
 add(P1);
 
 
 P1score.setFont(new Font("Tahoma", Font.PLAIN, 30));
 P1score.setBounds(55, 164, 89, 61);
 add(P1score);
 
 JLabel P2 = new JLabel("Player 2");
 P2.setFont(new Font("Tahoma", Font.PLAIN, 33));
 P2.setBounds(896, 108, 140, 52);
 add(P2);
 
 P2score.setFont(new Font("Tahoma", Font.PLAIN, 30));
 P2score.setBounds(912, 162, 89, 61);
 add(P2score);
	
	}
	
	public void initial()
	{
		redturn.setText("");
		greenturn.setText("");
		SO1.clearSelection();
		SO2.clearSelection();
		

	}
	
	public void p1first()
	{
		greenturn.setText("Green Turn");
		greenturn.setForeground(new Color(0,255,0));
	}
	public void p2first()
	{
		redturn.setText("Red Turn");
		redturn.setForeground(new Color(255,0,0));
	}
	public void change1(int c)
	{
		redturn.setText("Red Turn");
		greenturn.setText("");
		redturn.setForeground(new Color(255,0,0));
		Node[c].setForeground(new Color(0, 255, 0));
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			game.actionPerformed(e);
		
		
	}

	public void change2(int d)
	{
		greenturn.setText("Green Turn");
		redturn.setText("");
		greenturn.setForeground(new Color(0,255,0));
		Node[d].setForeground(new Color(255, 0, 0));
	}
}
