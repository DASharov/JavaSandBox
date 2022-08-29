package dmasharov;
import java.util.Scanner;

public class work06Calc {

	public static void main(String[] args) {
		System.out.println("...Вас приветствует калькулятор...");
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите первое число:");
		int num1 = scan.nextInt();
		System.out.print("Введите второе число:");
		int num2 = scan.nextInt();
		System.out.print("Введите действие:");
		String action = scan.nextLine();
		action = scan.nextLine();
		switch (action) {
		case "+":
			System.out.print("Результат:" + (num1 + num2));
			break;
		case "-":
			System.out.print("Результат:" + (num1 - num2));
			break;
		case "*":
			System.out.print("Результат:" + (num1 * num2));
			break;
		case "/":
			if (num2 != 0)
				System.out.print("Результат:" + (num1 / num2));
			else 
				System.out.print("На 0 делить нельзя!");
			break;
		default:
			System.out.print("Введено некорректное действие");
		}	
		
	}

}
