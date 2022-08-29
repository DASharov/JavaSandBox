package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Коллекция из 10 чисел
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		// Коллекция из 10 имен
		ArrayList<String> names = new ArrayList<>();
		names.add("Кирилл");
		names.add("Артем");
		names.add("Наташа");
		names.add("Саша");
		names.add("Марина");
		names.add("Миша");
		names.add("Соня");
		names.add("Таня");
		names.add("Надя");
		names.add("Валя");
		
		// Коллекция состоящая из 1 и 2 коллекций
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i++) { 
			result.add(numbers.get(i) + " - " + names.get(i));
		}
		
		// Печать 3 коллекции
		for (String res : result) {
			System.out.println(res);
		}
	}

}
