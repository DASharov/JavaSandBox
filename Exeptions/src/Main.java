
public class Main {

	public static void main(String[] args) {
		int a = 0;
		try {
			int b = 7 / a;
			String s = "12fdjsfj";
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e1) {
			System.out.println("Na 0 delit nelzy");
		} catch (ArithmeticException e2) {
			System.out.println("Error");
		} catch (Exception e) {
			System.out.println("Na 0 delit nelzy");
		} finally {
			System.out.println("We are in the finally ");
		}
		System.out.println("HI");
	}

}
