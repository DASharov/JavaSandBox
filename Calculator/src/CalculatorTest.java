import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calculator = new Calculator();
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

}
