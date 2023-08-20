package Session15;

public class TryCatch_2 
{
public static void main(String[] args)
{
	System.out.println("A");
	System.out.println("B");
	System.out.println("C");
	
	try
	{
	int a = 9/0;// Throwing as exception
	}
	catch(ArithmeticException e)
	{
		//Handling Exception
		e.printStackTrace();
		System.out.println("An exception occured at division at division of int a");
	}
	System.out.println("D");
	System.out.println("E");
	System.out.println("F");
	System.out.println("G");
	
}
}
