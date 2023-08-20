package session6;

import java.util.ArrayList;

public class arraylist 

{
 public static void main(String[] args)
 {
	// array list raw type 
	 // in arrayslist is use to increase the capacity automatic 
	 // no need to increase array capacity its increase automatic as long as you adding the value
	ArrayList ar = new ArrayList();
	 
	//System.out.println(ar.size());//just like an string we use length same way in arrays we have to use size
	int sizeofArrayList =  ar.size();// you haVE to use only int ....not double float long 
	System.out.println(sizeofArrayList);
	 
	
	ar.add(100);//0// after remove new position 
	ar.add(200);//1 // new position 0
	ar.add("Test");//2 //remove
	
	 System.out.println(ar.size());
	 
	 ar.add(300);//3//new position 1
	 ar.add(400);//4//new position 2
	 ar.add(600);//5// new position 3
	 
	 System.out.println(ar.size());
	 System.out.println(ar.get(2));
	 
//	 for(int i =0; i<ar.size(); i++)
//	 {
//		 System.out.println(ar.get(i));
//	 }
	 
	 // remove an any list
	 
//	 ar.remove(2);
//	 ar.remove(0);
//	 
//	 for(int i =0; i<ar.size(); i++)
//	 {
//		 System.out.println(ar.get(i));
//	 }
	 
	 // find out only test
	 
	 for(int i =0; i<ar.size(); i++)
	 {
		 if (ar.get(i).equals("Test"))
		 {
		 System.out.println("At Index Number" + i+"." +ar.get(i));// 2
		 }
	 }
	 
	 
	 
 }
}
