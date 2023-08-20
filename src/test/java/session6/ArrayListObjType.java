package session6;

import java.util.ArrayList;

public class ArrayListObjType 
{
  public static void main(String[] args)
  {
	  ArrayList<Object> empInfo = new ArrayList<Object>();// object means store anything
	  empInfo.add("Tom");
	  empInfo.add("m");
	  empInfo.add(499.99);
	  empInfo.add(true);
	  
	  for( int i=0;i<empInfo.size();i++)
	  {
		  System.out.println(empInfo.get(i));
	  }
	  
	  empInfo.clear();
  }
}
