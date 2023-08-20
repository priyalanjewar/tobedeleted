package session9;

import java.util.Scanner;

public class UserInput
{
public static void main (String[] args)
{
	System.out.println("Please enter the factory name");
	
	// it will ask to you factory name
	
	 Scanner scanner = new Scanner(System.in);
	  String userInput = scanner.next();
	  scanner.close();
	  
	  UserDefineMethod userdefinamethod= new UserDefineMethod();
	 String factName =  userdefinamethod.factoryname(userInput);
	 System.out.println(factName);
}
}
