package dmasharov;

public class Person {

	// final -константа
	private static int count;
	public int health;
	
	public Person() {
		count++;		
	}
	
	public static void getCount( ) {
		System.out.println("КОличество: " + count);		
	}
	
}
