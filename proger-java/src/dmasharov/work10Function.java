package dmasharov;

public class work10Function {

	public static void main(String[] args) {
		// Функции внутри класса - методы
		info("Hello");
		String java = "Java";
		info(java);
		
		short num, num2;
		num = 5;
		num2 = 7;
		summa(num, num2);
		
		info("Возвращаемый результат");
		int result = summaOut(num, num2);
		info(String.valueOf(result));
		
	}
	// Новый метод
	public static void summa(short a, short b) {
		int res = a + b;
		String result = "Результат:" + res;
		info(result);			
	}
	
	// Новый метод
	public static void info (String word) {
		System.out.print(word);
		System.out.println("!");		
	}

	// Новый метод
	public static int summaOut(short a, short b) {
		int res = a + b;
		String result = "Результат:" + res;
		return res;
	}	
	
}
