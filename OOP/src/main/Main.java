package main;
import box.Box;
import box.BoxWeight;
import test.Man;
import test.MyMath;

public class Main {

	public static void main(String[] args) {
//		Box myBox = new Box();
//		myBox.height = 10.2;
//		myBox.length = 15;
//		myBox.width = 11.3;
//		Box box2 = new Box();
//		Box box3 = new Box();
//		box2.height = 5;
//		box2.length = 5;
//		box2.width = 5;
//		box3.height = 10;
//		box3.length = 10;
//		box3.width = 10;
//		
//		double volume = myBox.height * myBox.length * myBox.width;
//		double volume2 = box2.height * box2.length * box2.width; 
//		double volume3 = box3.height * box3.length * box3.width; 
//		System.out.println("Объем коробки 1 : " + volume + "\nОбъем коробки 2 : " + volume2 + "\nОбъем коробки 3 : " + volume3);
		
		Box box1 = new Box();
		Box box2 = new Box();
		box1.setHeight(5);
		box1.setLength(5);
		box1.setWidth(5);
		box2.setHeight(10);
		box2.setLength(10);
		box2.setWidth(10);
		
//		box1.showVolume();
//		box2.showVolume();
		double volume = box1.volume();
		System.out.println(volume);
		double volume2 = box2.volume();
		System.out.println(volume2);

		Box box4 = new Box();
		box4.setDimens(15, 15, 15);
		System.out.println(box4.volume());
		
		Box box5 = new Box(10, 15, 20);
		System.out.println("Бокс5: " + box5.volume());
	// ---------------------------------------
		//Test2 test2 = new Test2();
		//int result = test2.multiple(6, 5);
		//double result = test2.multiple();
		// int result = test2.multiple(5);
		//int result = Test2.multiple(6);
		//System.out.println(result);
	
		Box box6 = new Box(10);
		Box box7 = new Box(15,20,25);
		Box box8 = new Box();
		box6.showVolume();
		box7.showVolume();
		box8.showVolume();
		
		Box box9 = new Box(10);
		Box box10 = new Box(box9);
		box9.setDimens(100, 100, 100);
		Box box11 = box9.increase(3);
		box9.showVolume();
		box11.showVolume();
		
		int result = box9.compare(box10);
		switch (result) {
		case -1:
			System.out.println("Наша коробка меньше");
			break;
		case 0:
			System.out.println("Наши коробки равны");
			break;
		case 1:
			System.out.println("Наша коробка больше");
			break;			
			
		}
		
		Box box12 = new Box(box9, box6);
		box12.showVolume();
		Box box13 = box9.newBox(box9);
		box13.showVolume();
		
		Man man = new Man("Валера", 50);
		man.setAge(33);
		man.showInfo();
		System.out.println(man.getAge());
		System.out.println(man.getName());
		
		int square = MyMath.square(20);
		System.out.println(square);
		
		double length = MyMath.length(10);
		System.out.println(length);
		
		double area = MyMath.area(10);
		System.out.println(area);
		
		length = MyMath.length(10);
		System.out.println(length);
		
		int sum = MyMath.sum(10,10,8);
		System.out.println(sum);
		
		System.out.println("----------------------------------");
		Box inheritanceBox = new Box(100, 100, 100);
		inheritanceBox.showInfo();
		BoxWeight inheritanceBoxWeight = new BoxWeight();
		inheritanceBoxWeight.showInfo();
		BoxWeight inheritanceBoxWeight2 = new BoxWeight(100, 100, 100, 50.6);
		inheritanceBoxWeight2.showInfo();
	}
	
}
