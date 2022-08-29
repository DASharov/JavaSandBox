package employees;

public class Programmer extends Employee implements CanProgramming {
	public Programmer(String name) {
		super(name);
	}

	@Override
	public void writingCode() {
		System.out.println("Писать код");		
	}
	
	
}
