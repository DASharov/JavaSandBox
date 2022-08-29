package dmasharov;

public class Truck extends Transport {
	
	private boolean isLoaded;
	
	//Создание объекта на основании вложенного класса в Transport
	public Engine engine = new Engine();
		
	public Truck(int weight, byte[] coordinate) { 
		// Передача в класс родитель 2 параметра
		super(weight, coordinate);		
	}
	
		public Truck(int weight, byte[] coordinate, boolean isLoaded) { 
		// Передача в класс родитель 2 параметра
		super(weight, coordinate);	
		this.isLoaded = isLoaded;
	}
	
	// Указание аннотации, если передаем 4 параметра применим иначе коммент
//	@Override
	public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
		// Передаем в родительский метод параметры
		super.setValues(speed, weight, color, coordinate);
		this.isLoaded = isLoaded;		
	}
	
	@Override
	protected String getValues() {
		 System.out.println(super.getValues());
		 return getLoaded();  
	}
	
	@Override
	public void moveObject(float speed) {
		System.out.println("Наш объект двигается со стокоростью" + speed);
	}
	
	@Override
	public boolean stopObject() {
		this.speed = 0;
		return true;
	}
	
	public void setLoaded(boolean loaded) { 
		isLoaded = loaded;
	}
	
	public String getLoaded() {
		if(isLoaded)
			return "Грузовик загружен ";
		else 
			return "Грузовик не загружен";
	}

}
