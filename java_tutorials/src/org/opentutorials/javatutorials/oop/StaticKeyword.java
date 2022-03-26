package org.opentutorials.javatutorials.oop;

public class StaticKeyword {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared.
		// 			The class "Owns" the static member.
		
		Friend friend1 = new Friend("SpongeBob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("SquidWard");
		Friend friend4 = new Friend("Sandy");
		
		Friend.displayFriends();
		

	}

}
