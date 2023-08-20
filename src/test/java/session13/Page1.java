package session13;

public abstract class Page1 
{
public Page1()
{
	System.out.println("Page const-------");
	
}
public abstract void title();//abstract method/prototype method
public abstract void url();//abstract method/prototype method
public abstract void footerLink();//abstract method/prototype method


//Non static method
public void logo()
{
	System.out.println("Page.....Logo");
}
public final static void privacyPolicy()
{
	System.out.println("Page----- PrivacyPolicy");
}
}
