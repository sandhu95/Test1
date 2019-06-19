public class Main {	
	public static void main(String[] args) throws InterruptedException {
		Rabbit rabbit = new Rabbit(20,10);
		rabbit.sayHello();
		boolean runForever = true;

		while (runForever == true) {
			
			System.out.println("Rabbit is at"+rabbit.printCurrentPosition());
			if(rabbit.getxPosition()>0)
			rabbit.moveLeft();
			else
			break;
			Thread.sleep(1000);
		}
		while (runForever == true) {
			
			System.out.println("Rabbit is at"+rabbit.printCurrentPosition());
			rabbit.moveRight();
			Thread.sleep(1000);
		}
	}

}
