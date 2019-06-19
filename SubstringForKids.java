
public class SubstringForKids {

	public static void main(String[] args) 
	{
		System.out.println("SUBSTRING FOR KIDS");
		String new1= substringForKids(3,3,"HelloWorld");
		System.out.println(new1);
	}
	
	public static String substringForKids(int i, int j, String x) 
	{
		if(i==j)
			return String.valueOf(x.charAt(i));
		return "";
	}
}
