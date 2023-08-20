package session6;

// only in ArrayList
import java.util.ArrayList;// use have to write this line if its not come when we write = new than we click it come automatic

public class arraylistgentype 
{
 public static void main(String[] args)
 {
	ArrayList<String> usernames = new ArrayList<String>();// generatictype means store particular datatype
	 
	 usernames.add("Tom");//0
	 usernames.add("Peter");//1
	 usernames.add("mark");//2
	 
	 for(int z=0;z<usernames.size();z++)
	 {
		 System.out.println(usernames.get(z));
	 }
	 
	 /////////////////////////////////////////////////
	 
	 ArrayList<Integer> marklist = new ArrayList<Integer>();//when we use ArrayList we have to use always Datatype in starting word capital ex. int- Integer// double- Double
	 marklist.add(13);
	 marklist.add(14);
	 marklist.add(19);
	 marklist.add(20);
	 
	 for(int i =0; i<marklist.size();i++)
	 {
		 System.out.println(marklist.get(i));
	 }
	 
 }
}
