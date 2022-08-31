package main;

import java.sql.Array;

public class Main {

	public static void main(String[] args) {
		int[] myArray = new int[10];

		for (int i = 0; i <= myArray.length; i++) {
			try {
				myArray[i] = i;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Error - IndexOutOfBoundsException");
				break;
			}
		}

		for (int j : myArray) {
			System.out.println(myArray[j]);
		}

	}

}
