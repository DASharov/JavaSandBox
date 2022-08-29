package dmasharov;
import java.util.Scanner;

public class work08Array {

	public static void main(String[] args) {
//		// Массивы данных
//		int[] nums = new int[5];
//		nums[0] = 40;
//		nums[1] = 41;
//		nums[2] = 42;
//		nums[3] = 43;
//		nums[4] = 44;
//		int res = nums[2] + nums[3];
//		System.out.println(res);
//	
//		float[] nums2 = new float[] {5.0f, 6.45f, 89.8f};
//		System.out.println(nums2[2]);
//		
//		// Вывод информации из массива
//		
//		for (byte i = 0; i < nums.length; i++)
//			System.out.println("Element: " + nums[i]);
//----------------------------------------------------------------		
//		int[] arr = new int[4];
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Введите число...");
//			int value = scan.nextInt();
//			arr[i] = value;
//		}
//		
//		// Поиск минимального значения в массиве
//		int min = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min)
//				min = arr[i]; 
//		}
//		System.out.println("Минимальный эллемент: " + min);
//----------------------------------------------------------------	
		// Многомерные массиывы данных
		char[][] syms = new char[2][2];
		syms[0][0] = 't';
		System.out.println(syms[0][0]);
		
		byte[][] nums = new byte[][] {
			{5,7},
			{7,3},
			{2,0},
		};
		
		nums[1][1] = 24;
		System.out.println(nums[1][1]);
				
		for (byte i = 0; i < nums.length; i++) {			
			for (byte j = 0; j < 2; j++) {
				System.out.print(" " + nums[i][j] + " ");	
			} 
			System.out.println();
		}
		
		
		
	}

}
