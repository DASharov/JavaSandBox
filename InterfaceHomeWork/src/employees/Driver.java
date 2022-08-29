package employees;

public class Driver extends Employee implements CanDriving {
	public Driver(String name) {
		super(name);
	}

	@Override
	public void Driving() { 
		System.out.println("Вести машину");
	}
}
