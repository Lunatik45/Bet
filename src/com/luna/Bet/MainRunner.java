package com.luna.Bet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class MainRunner extends JPanel
{
	public Map map = new Map();
	
	public MainRunner()
	{
		System.out.println("Running");
		JButton button = new JButton("Test!");
		add(button);
		button.addActionListener(this::actionButton);
		button.setActionCommand("button1");
		
		JButton tester2 = new JButton("t");
		add(tester2);
		tester2.addActionListener(this::actionButton);
		tester2.setActionCommand("button2");
	}
	
	public static void main(String[] args)
	{
		JFrame mainFrame = new JFrame("Bet");
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setLayout(null);
		mainFrame.setResizable(false);
		mainFrame.setSize(new Dimension(1000, 600));
		mainFrame.setContentPane(new MainRunner());
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	private void actionButton(ActionEvent actionEvent)
	{
		if (actionEvent.getActionCommand().equals("button1"))
		{
			System.out.println("It's working :O");
		}
		
		System.out.println("pressed");
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.GREEN);
		int xpoints[] = {160, 200, 300};
		int ypoints[] = {200, 100, 150};
		int npoints = 3;
		
		g.fillPolygon(xpoints, ypoints, npoints); //Venezuela Example
		
	}
	
	public class Map
	{
		ArrayList<Territory> territories = new ArrayList<>();
		
		Map()
		{
			initializeTerritories();
			
		}

		public void initializeTerritories() {
			territories.add(new Territory(0, "Argentina"));
			territories.add(new Territory(1, "Brazil"));
			territories.add(new Territory(2, "Peru"));
			territories.add(new Territory(3, "Venezuela"));

			territories.add(new Territory(4, "Alaska"));
			territories.add(new Territory(5, "Alberta"));
			territories.add(new Territory(6, "Central America"));
			territories.add(new Territory(7, "Eastern US"));
			territories.add(new Territory(8, "Greenland"));
			territories.add(new Territory(9, "Northwestern Territory"));
			territories.add(new Territory(11, "Quebec"));
			territories.add(new Territory(12, "Western US"));

			territories.add(new Territory(13, "Great Britain"));
			territories.add(new Territory(14, "Iceland"));
			territories.add(new Territory(15, "Northern Europe"));
			territories.add(new Territory(16, "Scandinavia"));
			territories.add(new Territory(17, "Southern Europe"));
			territories.add(new Territory(18, "Ukraine"));
			territories.add(new Territory(19, "Western Europe"));

			territories.add(new Territory(20, "Congo"));
			territories.add(new Territory(21, "East Africa"));
			territories.add(new Territory(22, "Egypt"));
			territories.add(new Territory(23, "Madagascar"));
			territories.add(new Territory(24, "North Africa"));
			territories.add(new Territory(25, "South Africa"));

			territories.add(new Territory(26, "Afghanistan"));
			territories.add(new Territory(27, "China"));
			territories.add(new Territory(28, "India"));
			territories.add(new Territory(29, "Irkutsk"));
			territories.add(new Territory(30, "Japan"));
			territories.add(new Territory(31, "Kamchatka"));
			territories.add(new Territory(32, "Middle East"));
			territories.add(new Territory(33, "Mongolia"));
			territories.add(new Territory(34, "Siam"));
			territories.add(new Territory(35, "Siberia"));
			territories.add(new Territory(36, "Ural"));
			territories.add(new Territory(37, "Yakutsk"));

			territories.add(new Territory(38, "Eastern Australia"));
			territories.add(new Territory(39, "Indonesia"));
			territories.add(new Territory(40, "New Guinea"));
			territories.add(new Territory(41, "Western Australia"));

		}

	}
	
	/*
	public class Territory
	{
		int     id;
		String  name;
		int     player;
		int     troopCount;
		int[]   adjacentTerritories;
		boolean fake;
		
		Territory(String name)
		{
			this.name = name;
			
		}
		
	}
	 */
}
