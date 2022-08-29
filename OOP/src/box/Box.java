package box;

public class Box {
	private double width;
	private double height;
	private double length;
	
	public Box() { 
		setWidth(0);
		setHeight(0);
		setLength(0);	
	}
	
	public Box(double width, double height, double length) { 
		this.setWidth(width);
		this.setHeight(height);
		this.setLength(length);
	}
	
	public Box(double size) {
		setWidth(size);
		setHeight(size);
		setLength(size);
	}
	
	public Box(Box box) {
		this.setWidth(box.getWidth());
		this.setHeight(box.getHeight());
		this.setLength(box.getLength());
	}
	
	public Box(Box box1, Box box2) { 
		this.setWidth(box1.getWidth() + box2.getWidth()) ;
		this.setHeight(box1.getHeight() + box2.getHeight());
		this.setLength(box1.getLength() + box2.getLength());
	}
	
	
	public void showVolume() {
		System.out.println(volume());
	}
	
	public int compare(Box box) {
		double thisVolume = volume();
		double boxVolume = box.volume();
		if (thisVolume > boxVolume) {
			return 1;
		} else if (thisVolume < boxVolume) {
			return -1;		
		} else {
			return 0;
		}
			
	}
	
	public Box increase(int i) {
		return new Box(getWidth() * i, getHeight() * i, getLength() * i);
		
	}
	
	public Box newBox(Box box) {
		return new Box(getWidth() + box.getWidth(), getHeight() + box.getHeight(), getLength() + box.getLength());
	}
	
	public double volume() {
		return getWidth() * getHeight() * getLength();
		
	}
	
	public void setDimens(double width, double height, double length) {
		this.setWidth(width);
		this.setHeight(height);
		this.setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public void showInfo() {
		System.out.println("Ширина: " + width + " Высота: " + height + " Длина: " + length);
	}
	
}
