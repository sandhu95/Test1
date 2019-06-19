
public class Rabbit {
	
	// -----------
	// PROPERTIES
	// -----------
	private int xPosition=0;
	private int yPosition=0;
	
	
	// -----------
	// CONSTRUCTOR 
	// ------------
	public Rabbit(int xPosition, int yPosition) 
	{
		this.xPosition=xPosition;
		this.yPosition=yPosition;
	}
	

	// -----------
	// METHODS 
	// ------------
	public String printCurrentPosition() {
		return "The current position of the rabbit is: "+ xPosition +","+yPosition;
	}

	public void sayHello() {
		System.out.println("Hello! I am a rabbit!");
	}
	public void moveRight()
	{
		xPosition=xPosition+15;
	}
	// ----------------
	// ACCESSOR METHODS
	// ----------------
	
	// Put all your accessor methods in this section.
	

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
}




