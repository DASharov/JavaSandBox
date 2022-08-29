package dmasharov;

import java.util.Scanner;

public class work06 {

	public static void main(String[] args) {
		// Условные конструкции if-else
		int a = 35;
		int b = 35;
		char sym1 = 'A', sym2 = 'A';
		boolean isHasCar = true;
		//if(sym1 == sym2) {
		// || или, && и 
		if (isHasCar && a ==b ) {		
			System.out.println("Да, верно!");			
		} else if (a >= b) {
			System.out.println("Second test");
		} else {
			System.out.println("Нет, не верно!");
		}
		// switch - case
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		int num = scanner.nextInt();
		switch (num) {
		case 1: 
			System.out.println("Number is 1");
			break;
		case 2: 
			System.out.println("Number is 2");
			break;
		case 5: 
			System.out.println("Number is 5");
			break;
		case 10: 
			System.out.println("Number is 10");
			break;	
		default:
			System.out.println("Default");		
		}		
		
			
	}

}
