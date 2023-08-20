package session13;

public class LoginPage2 extends Page1
{
	//override by clicking in error  login page //add implement click then override come at down
	@Override
	public void title()
	{
		System.out.println("Login Page title------");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page URL");
		
	}

	@Override
	public void footerLink() {
		System.out.println("Login Page footer Links");
		
	}
	
	public void logo()
	{
		System.out.println("Login Page Logo");
	}
	//special method for login page class
	public void dologin()
	{
		System.out.println("Login to app");
	}
}
