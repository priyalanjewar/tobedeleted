package session9;

public class UserDefineMethod 
{
 //1. No input no output
	
	public void test()
	{
		System.out.println("This is a test method");
	}
	
	//2.no input some output
	//Ex-1 //string
	public String nameofCountry()
	{
	 String CountryName = "India";
	 return CountryName;
	 
	}
	//Ex-2//string array
	public String[] listOfStudents()
	{
		System.out.println("Student list-");
		String names[] = new String[3];
		names[0] = "Steve";
		names[1] = "Tom";
		names[2] = "john";
		return names;
	}
	
	// 3. Some input some output
	// EX-1
	public int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	//Ex-2
	
	public String factoryname(String nameOfFactory)
	{
	
		if(nameOfFactory.equals("nike"))
			{
				String fact1 = "nike";
				System.out.println("This is a nike factory");
				return fact1;
			}
		else if (nameOfFactory.equals("puma"))
			{
				String fact2 = "Puma";
				System.out.println("This is a puma factory");
				return fact2;
		
			}
		String errormsg = "No factory with this name exists";
			return errormsg;
	
	}
	public String CountryCap(String nameOfCountry)
	{
		if(nameOfCountry.equals("India"))
		{
			String indcap = "New Delhi";
			return  indcap;
			
		}
		return nameOfCountry;
	}
	public static void main(String[] args)
	{
		UserDefineMethod userdefinamethod = new UserDefineMethod();
		userdefinamethod.test();
		
		String studentlist[] = userdefinamethod.listOfStudents();
		System.out.println(studentlist[2] + " ");
		
		for(int i = 0; i< studentlist.length;i++)
			System.out.println(studentlist[i]);
		
	
			int total = userdefinamethod.add(10,20);
			System.out.println(total);
			  System.out.println(userdefinamethod.add(50,20));
			  
			  
			  String opOfFactMethod = userdefinamethod.factoryname("nike");
			  System.out.println(opOfFactMethod);
			  
			  System.out.println(userdefinamethod.CountryCap("India"));
		
	}
}
