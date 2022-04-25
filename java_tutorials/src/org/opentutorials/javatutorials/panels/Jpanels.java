package org.opentutorials.javatutorials.panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jpanels {

	public static void main(String[] args) {
		// JPanel = a GUI component that functions as a container to hold other components
		// you can add components to a panel, and you can add panels to a frame
		
		ImageIcon icon = new ImageIcon("thumbsup.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0, 0, 375, 375);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 345, 345);
		redPanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(345, 0, 345, 345);
		greenPanel.setLayout(null);		
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(Color.pink);
		pinkPanel.setBounds(0, 345, 690, 345);
		pinkPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(greenPanel);
		frame.add(pinkPanel);
		
		

	}

}
