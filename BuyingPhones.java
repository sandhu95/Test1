
	import java.util.Scanner;

	public class BuyingPhones {

		public static void main(String[] args) {
			System.out.println("Enter the regular price of a phone: ");
			Scanner s = new Scanner(System.in);
			double price = s.nextDouble();
			double price3=price/2.0;
			System.out.println("Phone 1 - $"+ price);
			System.out.println("Phone 2 - $"+ price);
			System.out.println("Phone 3 - $"+ price3);
		}
		

	}
