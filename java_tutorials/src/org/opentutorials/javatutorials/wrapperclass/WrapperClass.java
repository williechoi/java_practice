package org.opentutorials.javatutorials.wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		/** 
		 * Wrapper class = provides a way to use primitive data types as reference data types
		 * reference data types contain useful methods 
		 * can be used with collections (e.g., ArrayList)
		 *
		 * primitive 	// wrapper
		 * ----------	---------
		 * boolean		// Boolean
		 * char			// Character
		 * int			// Integer
		 * double		// Double
         *
		 * !important: String is already reference data types!
		 *
		 * Autoboxing: the automatic conversion from a primitive data type to a reference data type
		 * Unboxing: the reverse of autoboxing.
		 */
		
		// Autoboxing
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		
		String e = "Hyungsuk";	// String is already a reference data type!
		
		if(a==true) {
			System.out.println("This is True!");
		}
		
		if(b=='@') {
			System.out.println("This is True!");
		}
		
		
		
		
		
		
	}

}
