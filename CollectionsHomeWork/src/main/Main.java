package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		MyArrayListHome employeers = new MyArrayListHome();
		employeers.add("Иван");
		employeers.add("Сергей");
		employeers.add("Слава");
		employeers.add("Аркадий");
		employeers.add("Аркадий2");
		employeers.add("Аркадий3");
		employeers.add("Аркадий4");
		employeers.add("Аркадий5");
		employeers.add("Аркадий6");
		employeers.add("Аркадий7");
		employeers.add("Аркадий8");
		employeers.add("Аркадий9");
		employeers.add("Аркадий10");
		
		employeers.remove("Слава");
		employeers.remove("Сергей");
		
		
		for (int i = 0; i < employeers.getSize(); i++) {
			System.out.println(employeers.getArray(i));
		}
		
		System.out.println("-----------");

		ArrayList<String> employeesAL = new ArrayList<>();
		employeesAL.add("Сергей");
		employeesAL.add("Кристина");
		employeesAL.add("Елена");
		employeesAL.add("Виктор");
		employeesAL.add("Наталья");
		employeesAL.remove(0);
		employeesAL.remove("Наталья");
		
		for (String name : employeesAL) {
			System.out.println(name);
		}
		
		System.out.println("-----------");
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 1000; i++) { 
			numbers.add(i);
		}
		int sum = 0;
		for (int numb : numbers) {
			sum += numb;			
		}
		System.out.println(sum);
		
		System.out.println("-----------");		
		
		HashSet<String> names = new HashSet<>();
		names.add("Джон");
		names.add("Ольга");
		names.add("Женя");
		names.add("Максим");
		names.add("Ольга");
				
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-----------");		
		
		TreeSet<String> namesTree = new TreeSet<>();
		namesTree.add("Джон");
		namesTree.add("Ольга");
		namesTree.add("Женя");
		namesTree.add("Максим");
		namesTree.add("Ольга");
				
		for (String nameTree : namesTree) {
			System.out.println(nameTree);
		}
	}

}
