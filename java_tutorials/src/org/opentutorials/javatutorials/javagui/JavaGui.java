package org.opentutorials.javatutorials.javagui;
import javax.swing.JOptionPane;

public class JavaGui {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your Name:");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		JOptionPane.showMessageDialog(null, "you are " + age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age:"));
		JOptionPane.showMessageDialog(null, "you are " + height + " cm tall");
	}

}
