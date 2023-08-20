package session14.FinalKeyword1;

// if you are using final you don't have to use  inheritance in program and don't use override
 final class parent
{
	public void test1()
	{
		System.out.println("This is test method in parent class 1");
	}
	public void test2()
	{
		System.out.println("This is test method in parent class 2");
	}
}
public class FinalKeyword_1_2 
{
 
//	@Override
// public void test()
// {
//	 System.out.println("This is test method in parent class");
//	}
	{
		System.out.println("This is test method in parent class");
	}	
	
	
public static void main(String[] args)
{
	parent pr= new parent();
	pr.test1();
	pr.test2();
}
}
