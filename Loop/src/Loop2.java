
public class Loop2 {

	public static void main(String[] args) {
		int i = 1;
		int temp = 0;
		float result;
		while (i <= 100) {
			temp += i;
			i++;
		}
		result = temp / i;
		System.out.println(result);
	}

}
