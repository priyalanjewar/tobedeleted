package session4.loops;

public class whileloop 
{
  public static void main(String[] args)
  {
	 //start with what?,condition?,increase the count
	 //while loop
	  // 1 to 10
//	  int i =1;// start point
//	  while(i<=10)// condition
//	  {
//		  // iteration
//		  System.out.println(i);
//		  i++;
//		 
//	  }
	  
	  //10 to 1
	  
	  int j =10;
	  while(j>=1)
	  {
		  System.out.println(j);
		  j--;
	  }
	  // 1 to 10 and where 5 i available print "five"
	  int k =1;// start point
	  while(k<=10)// condition
	  {
		  // iteration
		  System.out.println(k);
		  if(k == 5)
		  {
			  System.out.println("Five");
			  break;
		  }
		  	k++;
	  }
	  
	  //bill hotel 
	  
	  boolean isCashReceived = true;
	  int amount =250;
	while(isCashReceived)
	  
		{
			System.out.println("your bill pais successfully and amount is -->"  +   amount);
			System.out.println("Thankyou!!!!");
			
			isCashReceived = false;
		}
  }
}
