package Session3;

public class conditionaloperators 
{

	public static void main(String[] args)
	{
		//conditional operators
		// 1. ==
		//2. >
		//3.<
		//.>=
		//4.<=
		//6.!=
		//7.&&
		//8. ||
		
		
		int a = 10;
		int b =20;
		
		if(b>a)

			{
		
				System.out.println("b is greater than a");
			}
		else
			{
				System.out.println("a is greater than b");
			}
		
		
		//==
		
		if(b == a)
		{
			System.out.println("b and a are equal");
			
		}
		else if (b>a)
		{
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("b is less than a");
		}
		
		// >=
		if (b >= a)
		{
			System.out.println("b i greater than a or eual to a");
			
		}
		else
		{
			System.out.println("b is less than a");
		}
		
		//hotel example //! not operator
		
		int total =100;
		if(!(total == 0))
		{
			System.out.println(" You are eligible for 10% discount");// true statement
		}
		else
		{
			System.out.println(" You are not eligible for 10% discount ");// false statement
		}
		
		// death code
		if (true)
		{
			System.out.println("hello There");
		}
		else
		{
			System.out.println("Good Bye");// yellow line means death statement

		}
		
		
		
		// nested if
		
		int num = 15;
		if(num>=10)
		{
			if (num ==15)
			{
				System.out.println("Number is 15");
			}
			if (num ==17)
			{
				System.out.println("Number i 17");
			}
		}
		else
			{
				System.out.println("Number is less than or equal to 10");
			}
		
		// nested else if
		
		int number = 10; //40 50
		
		if(number ==10)
		{
			System.out.println("number is 10");// 10
		}
		else if (number ==20)
		{
			System.out.println("number is 20");// if number =20 run 20 answer
		
		}
		else if (number ==30)
		{
			System.out.println(" number is 30");//if number =30 run 30 answer
		}
		else
		{
			System.out.println("number i not found");// if less than 10 than answer is number is not found
		}
		
		
		
		
		//WAp to find highest from 3 number
		
		int x = 100;
		int y = 200;
		int z = 300;
		
		// && operator
		if (x > y && x>z )// for &&  1. true + true = true  // 2. false + true = false // 3. true + false = false //4. false + false = false
		
		{ 
			System.out.println("x is highest number");
		}
		else if(y>z)
		{
			System.out.println("y is highest number");
		}
		else 
		{
		 System.out.println("z is highest number");	
		}
		
		// || operator   //1. t + t = t // 2. f + t =t // 3. t + f = t// 4. f + f =f // t means true // f means false
		String userName ="jeff";
		
		if(userName =="Tom" || userName == "peter")
		{
			System.out.println("Hi developer " + userName);
			System.out.println("How may help you?");
		}
		else if(userName == "steve" || userName == "joe")
		{
			System.out.println("Hi tester == + userName");
			System.out.println("how may i help you?");
		}
		else
		{
			System.out.println("Hi there" + userName);
			System.out.println("How may i help you");
		}
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
