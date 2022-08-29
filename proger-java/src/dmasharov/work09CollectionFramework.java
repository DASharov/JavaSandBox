package dmasharov;
import java.util.ArrayList;
import java.util.LinkedList;

public class work09CollectionFramework {

	public static void main(String[] args) {
		// Коллкции в Java
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("---------------------");
		System.out.println("ArrayList");
		System.out.println("---------------------");
		numbers.add(5);
		numbers.add(55);
		numbers.add(1, 24);
		
//		System.out.println(numbers.size());
		
		System.out.println(numbers.get(1));
		numbers.remove(1);

//		numbers.clear();
		
		for (Integer el : numbers) {
			System.out.println(el);
		}
		
		LinkedList<Float> nums = new LinkedList<>();
		System.out.println("---------------------");
		System.out.println("LinkedList");
		System.out.println("---------------------");
		nums.add(5.5f);
		nums.add(15.5f);
		nums.add(35.5f);
		
		for (Float el : nums) {
			System.out.println(el);
		} 		
	}

}
