
public class Main {

	public static void main(String[] args) {
		Worker worker = new Worker("Иван", "программист", 50000);
		String info = worker.getInfoAboutWorker(12);
		System.out.println(info);
		

	}

}
