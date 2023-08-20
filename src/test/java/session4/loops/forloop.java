package session4.loops;

public class forloop
{
 public static void main(String[] args) 
 {
	 // 1 to 10
	 for(int i =10; i<=10; i++)
	 {
		 System.out.println(i);
	 }
	 
	 // 0 2 4 6 8 ...20
	 
	 for(int even = 0; even <=20; even = even +2)
	 {
		 System.out.println(even);
	 }
	  for( int j=1; j<=20; j++)
	  {
		  if(j % 2 ==0) // using % to compare with remainder
		  {
			  System.out.println(j);
		  }
	  }
 }
}
