package dmasharov;

public abstract class Transport {
	
	// Модификатор доступа 
	// public (доступно везде) 
	// protected (доступно внутри самого класса и наследников) 
	// private (доступно в пределах класса)
	
//	public float speed;
//	public int weight; 
//	public String color;
//	public byte[] coordinate;
	
	// Защищенные поля
	protected float speed;
	private int weight; 
	private String color;
	private byte[] coordinate;
		
//	// Конструктор класса по умолчанию
//	public Transport() {};
	
	// Конструктор класса
	public Transport(float _speed, int _weight, String _color, byte[] _coordinate) {
		// При создании объекта будет выполнять
		System.out.println("Object created");
		setValues(_speed, _weight, _color, _coordinate);
//		System.out.println(getValues());		
	}
	
	public Transport(int _weight, byte[] _coordinate) { 
		weight = _weight;
		coordinate = _coordinate;
//		System.out.println(getValues());				
	}
	
	public Transport() {}
	
	// Создание абстрактного метода
	public abstract void moveObject(float speed);
	public abstract boolean stopObject();
	
	// Добавление методов - функций
	protected void setValues(float speed, int weight, String color, byte[] coordinate) {
		this.speed = speed;
		this.weight = weight;
		this.color = color;
		this.coordinate = coordinate;
	}
	
	// protected - доступно самому классу и наследникам
	protected String getValues() {
		String info = "Object speed: " + speed + ", Weight: " + weight + ", Color: " + color + ".\n";
		String infoCoordinate = "Coordinate:\n";
		for(int i = 0; i < coordinate.length; i++)  
				infoCoordinate += coordinate[i] + "\n";			
		
		return info + infoCoordinate;		
	}
	
	class Engine {
		
		private boolean isReady;
		private int km;
		
		public void setValues(boolean isReady, int km) {
			this.isReady = isReady;
			this.km = km;			
		}
		
		public void isReady(boolean isReady) {
			this.isReady = isReady;
		}
		
		public void info() { 
			if(isReady) 
				System.out.println("Двигатель исправен");
			else
				System.out.println("Нет, он не работает. Он проехал уже " + km + "км");
		}	
		
	}
	
}
