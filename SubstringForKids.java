
public class SubstringForKids {

	public static void main(String[] args) 
	{
		System.out.println("SUBSTRING FOR KIDS");
		String new1= substringForKids(3,5,"HelloWorld");
		System.out.println(new1);
	}
	
	public static String substringForKids(int i, int j, String x) 
	{
		String y="";
		if(i==j)
			return String.valueOf(x.charAt(i));
		if(i<j)
			for(int p=i; p<=j;p++)
			{
				y+=x.charAt(p);
			}
		return y;
	}
}
