package org.opentutorials.javatutorials.simplegui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SimpleGUI {

	public static void main(String[] args) {
		// Simple Java GUI
		// JFrame = a GUI window to add component to
		
		/*
		JFrame frame = new JFrame();		// creates a frame
		frame.setTitle("JFrame title goes here");	// sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(false); 			// prevent frame from being resized
		frame.setSize(420, 420);			// sets the x-dimension, and y-dimension of frame
		frame.setVisible(true);				// make frame visible
		
		ImageIcon image = new ImageIcon("wing.ico");	// create an ImageIcon
		frame.setIconImage(image.getImage());			// change icon of frame
		frame.getContentPane().setBackground(new Color(0x00FFFF)); // change background color
		*/
		MyFrame myframe = new MyFrame();
		
	}

}
