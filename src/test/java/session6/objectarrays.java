package session6;

public class objectarrays
{
 public static void main(String[] args)
 {
	Object emp[] = new Object[5]; //0 1 2 3 4 // object type of arrays
	emp[0] ="Tom";// name
	emp[1] ="25";//age
	emp[2] ="499.99";//float/double salary
	emp[3] ="m";//gender
	emp[4] ="false";//boolean is resident of india
	
	//System.out.println(emp[0]);
	
	for(int count =0; count<emp.length; count ++)// only length of an array and length() with round bracket count the length of string ask in interview 
	{
		System.out.println((count + 1) +  "."   +emp[count]);
	}
  }
}
