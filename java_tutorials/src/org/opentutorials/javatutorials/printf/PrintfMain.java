package org.opentutorials.javatutorials.printf;

public class PrintfMain {

	public static void main(String[] args) {
		// printf() = an optional method to control, format, and display text to the console window
		// % [flags] [precision] [width] [conversion-character]
		
		// formatting integer
		System.out.printf("This is a format string %d\n", 123);
		
		boolean myBoolean = true;
		char myChar = '#';
		String myString = "Bro";
		int myInt = 5566;
		double myDouble = 1000;
		
		System.out.printf("is it true? %b\n", myBoolean);
		System.out.printf("what is the selected character? -> %c\n", myChar);
		System.out.printf("String is : %s\n" , myString);
		System.out.printf("Integer for %d\n", myInt);
		System.out.printf("Double for %f\n", myDouble);
		
		// [width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s\n", myString);
		System.out.printf("Hello %-10s\n", myString);
		
		// [precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f\n", myDouble);	
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus or minus sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		System.out.printf("Add commas to myInt: %,d\n", myInt);				// add comma
		System.out.printf("you have this much money %+.2f\n", myDouble);	// plus or minus sign for a numeric value
		
	}

}
