package main;

public class Man {

	private String name;
	private String post;
	private int age;
	private double height;
	
	Man(String name, String post, int age, double height) {
		this.name = name;
		this.post = post;
		this.age = age;
		this.height = height;		
	}
	
	String getManInfo() { 
		return "Сотрудник: " + name + " Должность: " + post + " Возраст: " 
				+ age + " Рост: " + height; 
	}
}
