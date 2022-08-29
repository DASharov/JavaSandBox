package box;

public class BoxWeight extends Box {
	private double weight;
	
	public BoxWeight() {
		super();
		this.weight = 0.0;
	}
	
	public BoxWeight(double width, double height, double length, double weight) {
		super(width, height, length);
		this.weight = weight; 
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Ширина: " + super.getWidth() + " Высота: " + super.getHeight() + " Длина: " + super.getLength() + " Масса: " + weight);
	}

}
