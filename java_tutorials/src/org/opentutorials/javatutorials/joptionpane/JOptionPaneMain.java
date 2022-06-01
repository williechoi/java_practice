package org.opentutorials.javatutorials.joptionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneMain {

	public static void main(String[] args) {
		// 	JOptionPane = 	pop up a standard dialog box that prompts users for a value
		//					or informs them of something.
		
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!!", "title", JOptionPane.ERROR_MESSAGE);
//		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("What is your name? :");
		
		String[] responses = {"No, You're awesome", "thank you!", "*blush*"};
		
		ImageIcon icon = new ImageIcon("rhino.png");
		JOptionPane.showOptionDialog(
				null, 
				"You are awesome!", 
				"secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0
				);
		
		System.out.println("Hello, " + name);
	}

}
