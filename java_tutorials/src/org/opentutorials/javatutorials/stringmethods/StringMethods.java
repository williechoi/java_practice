package org.opentutorials.javatutorials.stringmethods;

public class StringMethods {

	public static void main(String[] args) {
		// String = a reference data type that can store one or more characters
		// Reference data types have access to useful methods
		
		String name = "Bro";
		
		boolean result = name.equalsIgnoreCase("bro");
		System.out.println(result);
		
		int result2 = name.length(); // len(name)
		System.out.println(name + " is " + result2 + " characters long");
		
		char result3 = name.charAt(0); // name[0]
		System.out.println("the first character of " +name+ " is " + result3);
		
		int result4 = name.indexOf("o"); // name.indexof('c')
		System.out.println("o is at position " + (result4 + 1));
		
		boolean result5 = name.isEmpty(); // not name
		System.out.println("is name empty? " + result5);
		
		String result6 = name.toUpperCase(); // .upper() 
		String result7 = name.toLowerCase(); // .lower() 
		
		System.out.println("Upper case of "+name+" is "+result6);
		System.out.println("Lower case of "+name+" is "+result7);
		
		String name2 = "         Bro ";
		
		String result8 = name2.trim();	// .strip() 
		
		System.out.println("trimmed string: " + result8);
		
		String result9 = name.replace('o', 'a');
		
		System.out.println("result9: " + result9);
		
		
			
	}

}
