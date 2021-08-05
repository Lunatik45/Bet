package com.luna.Bet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainRunner extends JPanel
{
	public MainRunner()
	{
		System.out.println("Running");
		JButton button = new JButton("Test!");
		add(button);
		button.addActionListener(this::actionButton);
	}
	
	private void actionButton(ActionEvent actionEvent)
	{
		System.out.println("It's working :O");
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
}
