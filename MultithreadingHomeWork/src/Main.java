
public class Main {

	static boolean flag = false;
	static int numb = (int) (Math.random() * 10000000);	

	public static void main(String[] args) {
		System.out.println("Random number is: " + numb);
		Thread timer = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				try {
					while (!flag) {
						System.out.println(i);
						i++;
						Thread.sleep(1000);
					}
				} catch (Exception e) {

				}
			}
		});
		timer.start();

		Thread randomHanter = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (!flag) {
						int hunt = (int) (Math.random() * 1000000);
						if (hunt == numb) {
							flag = true;
							System.out.println(hunt);
						}
					}
				} catch (Exception e) {

				}
			}
		});
		randomHanter.start();

	}

}
