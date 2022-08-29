package dmasharov;
import java.util.Iterator;

public class work07 {

	public static void main(String[] args) {
//		// Цикл for
//		for (float i = 100; i > 10; i /= 2) {
//			System.out.println("Element: " + i);			
//		}

//		// Цикл while 
//		int i = 0; 
//		while (i <= 10) {
//			System.out.println("Element: " + i);			
//			i++;
			
//		// Цикл do, while Выполняем код, а потом проверяем условия
//		int i = 0;
//		do {
//			i++;
//			System.out.println("Element: " + i);
//		} while (i < 10); 
		
		for (int i = 5; i < 25; i += 2) {
			if (i % 3 == 0)
				continue;
			
			if (i >= 17)
				break;
			
			System.out.println("Element: " + i);
		}
	}

}
