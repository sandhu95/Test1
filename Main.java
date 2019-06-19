public class Main {	
	public static void main(String[] args) throws InterruptedException {
		Rabbit rabbit = new Rabbit(0,10);
		rabbit.sayHello();
		boolean runForever = true;

		while (runForever == true) {
			
			System.out.println("Rabbit is at"+rabbit.printCurrentPosition());
			rabbit.moveLeft();
			Thread.sleep(1000);
		}
	}

}
