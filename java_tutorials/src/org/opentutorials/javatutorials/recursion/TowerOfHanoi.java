package org.opentutorials.javatutorials.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		int SRC = 1;	// source pole
		int MID = 2;	// middle pole
		int DST = 3;	// destination pole

		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ������ �ű�ڽ��ϱ�? ");
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
		System.out.println(what + "��° ������ " + from + "��° ����⿡�� " + to + "��° ������ �ű�ϴ�.");
	}
}
