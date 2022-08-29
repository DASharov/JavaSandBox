
public class Dog {
	String nickname;
	String breed;
	int speed;
	
	void run() {
		for (int i = 0; i < speed; i++) { 
			System.out.println("Бегу");
		}
	}
	
	String info() {
		return "Кличка:" + nickname + " Порода:" + breed + " Скорость:" + speed;
	}
}
