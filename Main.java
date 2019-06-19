public class Main {
	static  boolean runForever = true;
	static Rabbit rabbit = new Rabbit(30,10);
	public static void main(String[] args) throws InterruptedException {
		
		rabbit.sayHello();
		boolean runForever = true;

		
		moveLeft();
		
	}
  public static void moveLeft() throws InterruptedException
  {
	 
	  while (runForever == true) {
			
			System.out.println("Rabbit is at"+rabbit.printCurrentPosition());
			if(rabbit.getxPosition()>0)
			rabbit.moveLeft();
			else
			moveRight();
			Thread.sleep(1000);
		}  
  }
  public static void moveRight() throws InterruptedException
  {
	 
	  while (runForever == true) {
			
			System.out.println("Rabbit is at"+rabbit.printCurrentPosition());
			if(rabbit.getxPosition()<500)
				rabbit.moveRight();
			else 
				moveLeft();
			Thread.sleep(1000);
		}
  }
}
