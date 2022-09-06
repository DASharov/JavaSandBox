import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator; 
	 
	@Before
		
	@org.junit.Test
	public void whenAddTenToFiveThenResultFifteen() {
		calculator = new Calculator();
		double expected = 15;
		double result = calculator.add(10, 5);
		assertEquals(expected, result, 0.001);
	}
	
	@Test
	public void when5AddTo10AsStringThenResult15() {
		calculator = new Calculator();
		double expected = 15;
		double result = calculator.add("10", "5");
		assertEquals(expected, result, 0.001);
	}
	
	@Test(expected = NumberFormatException.class)
	public void whenInputIncorrectValueThenThrowExeption() {
		calculator = new Calculator(); 
		calculator.add("uefe", "5");
		
	}

	@Test
	public void test() {
		calculator = new Calculator();
		double expected = 15;
		double result = calculator.add(10, 5);
		assertEquals(expected, result, 0.001);
		double expected2 = 150;
		double result2 = calculator.division(300, 2);
		assertEquals(expected2, result2, 0.001);
		double expected3 = 10;
		double result3 = calculator.substraction(20.5, 10.5);
		assertEquals(expected3, result3, 0.001); 
		double expected4 = 45;
		double result4 = calculator.multiplication(5, 9);
		assertEquals(expected4, result4, 0.001);
	}
	
	@After
	public void close() {
		calculator = null;
	}
	

}
