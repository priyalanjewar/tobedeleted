package session9;

import java.util.ArrayList;

public class SystemMethod1 

{
 static String welcomeMsg = "   Hello       ";
 public static void main(String[] args)
 {
	 System.out.println(welcomeMsg.length());
	 
	 
	ArrayList<Integer> tablefeleven =  new ArrayList<Integer>();// when you use arraylit add import you can see at top of the program 
	tablefeleven.add(1);
	tablefeleven.add(2);
	tablefeleven.add(3);
	
	for(int i =0; i<tablefeleven.size();i++)
	{
		System.out.println(tablefeleven.get(i));
	}
 }
}
