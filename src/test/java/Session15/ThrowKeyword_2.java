package Session15;

public class ThrowKeyword_2 {
	public static void main(String[] args)
	{
//		try {
//			throw new Exception("User defined Exception")
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("An exception is defined ---.");
//		}
		
		
		String username = "Tom"; //" "//null// if we don't write anything in user name it will show null value
		if(username.equals(" ") || username.equals(null))
		{
			try
			{
				throw new Exception("blank username exception");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("The user name such be avalue not a blank space or null value");
			}
			
		}
		else
		{
			
		System.out.println("Login in with user --->"  +    username);
		}
		
	}
}

		
	
	
	


