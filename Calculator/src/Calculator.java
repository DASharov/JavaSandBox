
public class Calculator {
	double add(double a, double b) {
		return a + b;
	}

	double substraction(double a, double b) {
		return a - b;
	}

	double division(double a, double b) {
		if (b != 0) {
			return a / b;
		} else {
			return 0;
		}
	}

	double multiplication(double a, double b) {
		return a * b;
	}
}
