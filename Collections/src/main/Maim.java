package main;

public class Maim {

	public static void main(String[] args) {
		MyArrayList employees = new MyArrayList();
		employees.add("Никита");
		employees.add("Игорь");
		employees.add("Ваня");
		employees.add("Иван");
		employees.add("Максим");
		employees.add("Ирина");	
		employees.add("Алексей");
		
		for (int i = 0; i < employees.getSize(); i++) {
			System.out.println(employees.get(i));
		}		
		
		String st = "1000";
		String st2 = "2000";
		int a = Integer.parseInt(st);
		int b = Integer.parseInt(st2);
		System.out.println(a + b);
		
		String s = "это Игорь. Он программист";
		String name = s.substring(4,9);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
	}
}
