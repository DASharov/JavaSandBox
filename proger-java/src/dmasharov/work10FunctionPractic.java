package dmasharov;

public class work10FunctionPractic {

	public static void main(String[] args) {
		// Метод
		byte[] nums1 = new byte[] {5, 6, 8}; 
		int summ1 = summArray(nums1);
		System.out.println("Сумма 1: " + summ1);
		
		byte[] nums2 = new byte[] {3, 6, 1, 8, 5}; 
		int summ2 = summArray(nums2);
		System.out.println("Сумма 2: " + summ2);
		
	}
	
	public static int summArray(byte[] arr) {
		int summa = 0;
		for (byte i = 0; i < arr.length; i++) 
			summa += arr[i];		
		
		return summa;
	}
}
