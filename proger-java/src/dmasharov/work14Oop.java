package dmasharov;
// Импорт пакета
import db.DB;

public class work14Oop {

	public static void main(String[] args) {
		// ООП наследование, для полиморфизма закомментим 
		Car bmw = new Car(250.5f, 2500, "Wight", new byte[] {0, 0, 0});
		bmw.engine.setValues(true, 100);
		bmw.engine.info();
		
		Truck truck = new Truck(5600, new byte[] {100, 0, 100}, false);
		truck.setValues(250.5f, 2500, "Wight", new byte[] {0, 0, 0});
		truck.engine.setValues(false, 10000);
		truck.engine.info();
		System.out.println(truck.getValues());
		
		// Проверка применимости абстрактных классов
//		Transport transport = new Transport(250.5f, 2500, "Wight", new byte[] {0, 0, 0});

		// Анонимные классы
		Car flyCar = new Car(250.5f, 2500, "Wight", new byte[] {0, 0, 0}) {
			@Override
			public void moveObject(float speed) {
				super.moveObject(speed);
				
				this.engine.isReady(true);
				System.out.println("Машина летит");
			}
		};
		
		flyCar.moveObject(400);
		
	}

}
