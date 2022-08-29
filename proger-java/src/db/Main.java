package db;

import dmasharov.Person;

public class Main {

	public static void main(String[] args) {
		
		Person obj1 = new Person();
		Person obj2 = new Person();
		Person obj3 = new Person();
		Person obj4 = new Person();
		Person.getCount();
		
		
//		// Значение сохраняются для всех объектов
//		Person.count = 5;
//		System.out.println(Person.count);
				
		DB db = new DB();
		
		info("G");
	}
	
	// Для JAVA это разные методы
	public static void info() {
		System.out.println("Hello");
	}
	
	public static void info(String word) {
		System.out.println(word + "!");
	}	
	
	public static void info(String word, float word2) {
		System.out.println(word + word2);
	}

}
