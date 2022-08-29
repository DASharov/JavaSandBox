package main;


import geometricShape.Rect;
import geometricShape.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Rect rect = new Rect(5, 10);
		Triangle triangle = new Triangle(10);
		
		System.out.println("Площадь прямоугольника = " + rect.area());
		System.out.println("Площадь треугольника = " + triangle.area());
		
		
		

	}

}
