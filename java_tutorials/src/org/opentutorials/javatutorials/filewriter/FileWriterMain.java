package org.opentutorials.javatutorials.filewriter;


import java.io.FileWriter;
import java.io.IOException;


public class FileWriterMain {
	
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \n Violets are blue \n Booty booty booty booty \n Rockin' everywhere!");
			writer.append("\n(A poem by Choi)");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
