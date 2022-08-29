package dmasharov;
// Подключение класса для вводимых данных
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Comment
		System.out.println("\"Hello\"\n\t\\World!\\");
		
		/*
		 Comment
		 */		
		System.out.println("Переменные и типы данных");
		// Целые числа
		int age = 24;
		System.out.println("Возраст " + age + ".");
		age = 50;
		System.out.println(age);
		
		byte ageByte = 45; // -127 - 127
		System.out.println(ageByte);
		// byte - 1 байт
		// short - 2 байт
		// int - 4 байт
		// long - 8 байт
		
		// Числа с точкой
		float num4 = 4.24f;
		double num5 = 74.52825282;
		
		// Символ
		char ch = '№';
		
		// Строки
		String userName = "Dmitriy";
		System.out.println(userName);
		
		// Булевы
		boolean isHappy = false;
		
		// Получение данных
		// Создание объекта на основании класса Scanner
		Scanner scan = new Scanner(System.in); 
		//System.out.print("Введите свое имя");
		//String usrName = scan.nextLine(); // Получение строки
		//System.out.print("Привет, " + usrName);
		
		// int num1 = scan.nextInt() // Получение числа
		
		short n1 = 50, n2 = 10;
		int res = n1 + n2;
		System.out.println("Результат " + res);
		
		res += 10;
		System.out.println("Результат " + res);
		
		Car bmw = new Car();
		bmw.setLight(true);
		bmw.blinkLight();
	}
 
}
