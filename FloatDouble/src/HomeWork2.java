
public class HomeWork2 {

	public static void main(String[] args) {
		byte time = 15; 		
		boolean isGoodeWeather = false;
		boolean late = time >= 23 || time <= 5;
		if (late) {
			System.out.println("Спать");
		}		
		if (isGoodeWeather && !late) {
			System.out.println("Гулять");
		}
		if (!late && !isGoodeWeather) {
			System.out.println("Читать книгу");
		}
		
	}

}
