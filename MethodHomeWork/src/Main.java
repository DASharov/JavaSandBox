
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.nickname = "Грей";
		dog.breed = "Цвейгшнауцер";
		dog.speed = 5;
		
		String info = dog.info();		
		System.out.println(info);
		dog.run();	

	}

}
