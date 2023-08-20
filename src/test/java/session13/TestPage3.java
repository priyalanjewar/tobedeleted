package session13;

public class TestPage3
{
public static void main(String[] args) {
//Page1 p	= new Page1();// its an abstract method used its show error
	
	
	System.out.println("-----------------------");
	
LoginPage2 lp	= new LoginPage2();
lp.title();
lp.url();
lp.footerLink();
lp.dologin();
Page1.privacyPolicy();
lp.logo();
System.out.println("----------------");


 Page1 p = new LoginPage2();
 p.title();
 p.url();
 p.footerLink();
 //p.dologin not allowed
 Page1.privacyPolicy();

}
}
