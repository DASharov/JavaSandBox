package geometricShape;

public class Triangle extends Figure {

	private double c;
	
	public Triangle(double size) { 
		super(size, size);
		this.c = size;
	}
	
	public Triangle(double a, double b, double c) {
		super(a, b);
		this.c = c;
	}
	
	@Override
	public double area() { 		
		double p = (getA() + getB() + c) / 2;
		return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - c)); 
	}
}
