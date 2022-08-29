
public class Monstro {

	int quantityEyes;
	int quantityLegs;
	int quantityHands;
	
	Monstro() {
		quantityEyes = 2;
		quantityLegs = 2;
		quantityHands = 2;		
	}
	
	Monstro(int quantityEyes) {
		this.quantityEyes = quantityEyes;
		quantityLegs = 2;
		quantityHands = 2;			
	}
	
	Monstro(int quantityEyes, int quantityHands) {
		this.quantityEyes = quantityEyes;
		quantityLegs = 2;
		this.quantityHands = quantityHands;			
	}
	
	Monstro(int quantityEyes, int quantityHands, int quantityLegs) {
		this.quantityEyes = quantityEyes;
		this.quantityLegs = quantityLegs;
		this.quantityHands = quantityHands;			
	}
	
	void voice() {
		System.out.println("Голос");
	}
	
	void voice(int i) { 
		for (int j = 0; j < i; j++) {
			voice();
		}
	}
	
	void voice(int i, String text) { 
		for (int j = 0; j < i; j++) {
			System.out.println(text);
		}
	}
	
	void showParametrs() {
		System.out.println("Количество глаз: " + quantityEyes);
		System.out.println("Количество ног: " + quantityLegs);
		System.out.println("Количество рук: " + quantityHands);		
	}
	
}
