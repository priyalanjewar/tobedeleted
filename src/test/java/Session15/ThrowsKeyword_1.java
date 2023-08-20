package Session15;

public class ThrowsKeyword_1 {
	public static void main(String[] args) 
	{
		ThrowsKeyword_1 objRef= new ThrowsKeyword_1();
		objRef.LaunchBrowser();
		
		
	}
	public void LaunchBrowser() 
	{
		System.out.println("Launching browser.........");
		LaunchURL();//its a chain to connect to another public void
	}
	public void LaunchURL() 
	{
		System.out.println("Launching URL.............");
		try {
			Login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//its a chain 
		
	}
	public void Login() throws Exception // throws exception means to give our problem to another then you have to use another void try catch
	{
		System.out.println("Do Login..................");
		int a = 9/3;// if there is 9/0 then its show arithmetic exception come its error
	}

}
