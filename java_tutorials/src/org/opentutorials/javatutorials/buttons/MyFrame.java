package org.opentutorials.javatutorials.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	
	JButton button;
	JLabel label;
	
	
	MyFrame() {
		
		ImageIcon icon = new ImageIcon("mouse.png");
		Image image = icon.getImage();
		Image newimg = image.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		
		ImageIcon icon2 = new ImageIcon("thumbsup.png");
		Image image2 = icon2.getImage();
		Image newimg2 = image2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(newimg2);
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 100, 150);
		label.setVisible(false);
		
		
		JButton button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(e -> label.setVisible(!label.isVisible()));
		button.setText("I am a button!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.magenta);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}
}
