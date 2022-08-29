package dmasharov;

public class Car extends Transport implements ILight {
		
		private boolean isOn;
		//Создание объекта на основании вложенного класса в Transport
		public Engine engine = new Engine();
		
		// Конструктор класса
		public Car(float _speed, int _weight, String _color, byte[] _coordinate) {
			super(_speed, _weight, _color, _coordinate);
			
			// Если this то ищет внутри класса, super - ищет в родительском классе
	
		}
		
		public Car() {}
		
		@Override
		public void moveObject(float speed) {
			System.out.println("Наш объект двигается со стокоростью" + speed);
		}
		
		@Override
		public boolean stopObject() {
			this.speed = 0;
			return true;
		}

		@Override
		public void setLight(boolean set) {
			// TODO Auto-generated method stub
			this.isOn = set;			
		}

		@Override
		public void blinkLight() {
			// TODO Auto-generated method stub
			System.out.println("Мы моргаем фарами");
		}
	
}
