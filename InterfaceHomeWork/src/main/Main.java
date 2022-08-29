package main;

import java.util.ArrayList;

import employees.CanCooking;
import employees.CanDriving;
import employees.Cook;
import employees.Driver;
import employees.Employee;
import employees.Programmer;

public class Main {

	public static void main(String[] args) {
		Driver driver1 = new Driver("Иван");
		Driver driver2 = new Driver("Алексей");
		Driver driver3 = new Driver("Михаил");
		Cook cook1 = new Cook("Виктор");
		Cook cook2 = new Cook("Света");
		Cook cook3 = new Cook("Галя");
		Programmer programmer1 = new Programmer("Николай");
		Programmer programmer2 = new Programmer("Евгений");
		Programmer programmer3 = new Programmer("Светлана");
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(driver1);
		employees.add(driver2);
		employees.add(driver3);
		employees.add(cook1);
		employees.add(cook2);
		employees.add(cook3);
		employees.add(programmer1);
		employees.add(programmer2);
		employees.add(programmer3);		
		for (Employee employee : employees) {
			employee.voice();
		}
		
		ArrayList<CanCooking> cooks = new ArrayList<>();
		cooks.add(cook1);
		cooks.add(cook2);
		cooks.add(cook3);
		for (CanCooking cook : cooks) { 
			cook.Cooking();
		}
		
		ArrayList<CanDriving> drivers = new ArrayList<>();
		employees.add(driver1);
		employees.add(driver2);
		employees.add(driver3);
		for (CanDriving driver : drivers) {
			driver.Driving();
		}
		
		
		
		
		
		
		
		
		
		

	}

}
