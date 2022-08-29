package dmasharov;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		short num1, num2;
		int result;
		
		System.out.println("Введите первое число");
		num1 = scan.nextShort();
		System.out.println("Введите второе число");
		num2 = scan.nextShort();
		//result = num1 + num2; 
		System.out.println("Результат сложения " + (num1 + num2));
		System.out.println("Результат вычитания " + (num1 - num2));
		System.out.println("Результат умножения " + (num1 * num2));
		System.out.println("Результат деления " + (num1 / num2));
	}

}
