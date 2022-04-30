package org.opentutorials.javatutorials.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		int SRC = 1;	// source pole
		int MID = 2;	// middle pole
		int DST = 3;	// destination pole

		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 개의 원판을 옮기겠습니까? ");
		int nDisk = scanner.nextInt();
		towerOfHanoi(nDisk, SRC, DST, MID);
		scanner.close();
	}
	
	public static void towerOfHanoi(int nDisk, int src, int dst, int mid)
	{	
		if(nDisk == 1) {
			move(nDisk, src, dst);
		} else if (nDisk < 1) {
			System.out.println("Wrong input!");
		}
		else {
			towerOfHanoi(nDisk-1, src, mid, dst);
			move(nDisk, src, dst);
			towerOfHanoi(nDisk-1, mid, dst, src);
		}
	}
	
	public static void move(int what, int from, int to)
	{
		System.out.println(what + "번째 원판을 " + from + "번째 막대기에서 " + to + "번째 막대기로 옮깁니다.");
	}
}
