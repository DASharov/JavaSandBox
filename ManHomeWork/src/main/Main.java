package main;

public class Main {

	public static void main(String[] args) {
		
		String name;
		String post;
		int age;
		double height;		
		
		String st = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";
				
		name = st.substring(4, 8);
		post = st.substring(54, 65);
		age = Integer.parseInt(st.substring(14, 16));
		height = Double.parseDouble(st.substring(32, 38));
		
		Man man = new Man(name, post, age, height);
		System.out.println(man.getManInfo());
		
		
		

	}

}
