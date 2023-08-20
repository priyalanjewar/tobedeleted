package session10;

public class LoginToApp 
{
 public void login()
 {
	 System.out.println("Login with Zero Parameter");
 }
 public void login(String username)
 {
	 System.out.println("Login with One Parameter UerName");
 }
 public void login(int otp)
 {
	
	 System.out.println("Login with Two Parameter Otp");
 }
 public void login(String username, String password)
 {
	 System.out.println("Login with Three Parameter uername and pasword");
 }
 public void login(long phonenum, String password)
 {
	 System.out.println("Login with One Parameter phonenum and pasword");
	
 }
 public void login( String username, long phonenum)
 {
	 System.out.println("Login with One Parameter username and phonenum");
	
 }
 public void login( String emailid, int otp)
 {
	 System.out.println("Login with One Parameter emailid and otp");
	
 }
 public static void main(String[] args)
 {
	 LoginToApp loginuser= new LoginToApp();
	 loginuser.login("fffgggg", 88888999);
	 loginuser.login("bhhhhnnnn", 0666);
 }
}
