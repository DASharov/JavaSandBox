
public class Main {

	public static void main(String[] args) {
		Monstro monstr = new Monstro();
		Monstro monstr2 = new Monstro(5);
		Monstro monstr3 = new Monstro(5,6);
		Monstro monstr4 = new Monstro(5,6,7);
		
		monstr.voice();
		monstr.voice(5);
		monstr.voice(10, "Голова");
		
		monstr.showParametrs();
		monstr2.showParametrs();
		monstr3.showParametrs();
		monstr4.showParametrs();
	}

}
