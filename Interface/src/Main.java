import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Fish fish = new Fish();
		Bird bird = new Bird();
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(dog);
		animals.add(cat);
		animals.add(fish);
		animals.add(bird);
		
		for (Animal animal : animals) {
			animal.eat();
		}
		
		System.out.println("-----------------");
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
		Dog dog5 = new Dog();		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		Cat cat4 = new Cat();
		Cat cat5 = new Cat();
		Bird bird1 = new Bird();
		Bird bird2 = new Bird();		
		
		ArrayList<CanRun> animals1 = new ArrayList<>();
		animals1.add(dog1);
		animals1.add(cat1);
		animals1.add(bird1);
		animals1.add(dog2);
		animals1.add(dog3);
		
		for (CanRun animal : animals1) {
			animal.run();
		}
		
		Dog dog6 = new Dog();
		CanRun canRun = dog6;
		dog6 = (Dog) canRun;
		dog6.eat();
		
		System.out.println("-----------------");
		
		Flyable flyable = new Bird();
		flyable.fly();
		
		
		
		
		
		

	}

}
