
public class Main {

	public static void main(String[] args) {
		Human humanIvan = new Human();
		humanIvan.age = 30;
		humanIvan.name = "��������";
		humanIvan.weight = 88.4;
		
		Human humanSergey = new Human();
		humanSergey.age = 33;
		humanSergey.name = "������������";
		humanSergey.weight = 80.7;
		
		Human humanDima = new Human();
		humanDima.age = 33;
		humanDima.name = "��������";
		humanDima.weight = 89.7;
		
		Human humanKirill = new Human();
		humanKirill.age = 5;
		humanKirill.name = "������������";
		humanKirill.weight = 25;
		
		Human humanArtem = new Human();
		humanArtem.age = 1;
		humanArtem.name = "����������";
		humanArtem.weight = 10;

		double midlleAge = (humanIvan.age + humanSergey.age + humanDima.age + humanKirill.age + humanArtem.age) / 5;
		System.out.println((int)midlleAge);
		
		
	}

}
