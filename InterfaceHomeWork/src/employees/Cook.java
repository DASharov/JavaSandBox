package employees;

public class Cook extends Employee implements CanCooking {
	public Cook(String name) {
		super(name);
	}
	
	@Override
	public void Cooking() {
		System.out.println("Готовить");
	}
}
