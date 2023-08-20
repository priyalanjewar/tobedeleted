package session4.arrays;

public class arrays
{
   public static void main(String[] args)
   {
	   // we can write arrays in all three down type in interview if ask this three of array writing coding is correct you have to say 'yes'
	   
	   //declaration
//	   int[] q = new int[4]; // why 4 because it starting  from counting 0 1 2 3 4 total 5
//	   
//	   int x[] = new int[8]; //0 1 2 // [3] is the capacity of box 
//	   
//	   int []y = new int[2]; //0 1
//	   
//	   int z[]= {10,20,30};
	   
	   
	   // inisizsysotion
	   
//	   x[0]=10;
//	   x[1]=20;
//	   x[2]=30;
//	   x[4]=40;
//	   x[5]=50;
//	   x[6]=45;
//	   x[7]=45;
//	   
//	   System.out.println(x[1]); // 20
//	   System.out.println(x[0]+x[0]);// 10 + 10=20
//	   System.out.println(y.length);// its ask about capacity of y its 2
//	   
//	   for(int k=0;k<x.length;k++)
//	   {
//		   if(x[k] == 45)
//		   {
//		   System.out.println("The index position of an value is"  +   k);
//		   break;
//		   }
//	   }
//	   
//	   
//	   //example-2
//	   
//	   double  k1[] =new double[5] ;// 0 1 2 3 4 
//	   k1[0]=12.23;
//	   k1[1]= 45.67;
//	   k1[2] = 45.67;
//	   k1[3] = 50;
//	   k1[4] = 39.33;
//	   
//	  System.out.println(k1[7]);  
//	  
//	  
	  //example-3
	  
	  Object browser[] = new Object[4];
	  
	  browser[0] = "chrome";
	  browser[1] = "opera";
	  browser[2] = "firefox";
	  browser[3] = "ie";
	  
	  for(int i=0; i<browser.length; i++)
	  {
		  if (browser[i].equals("chrome"))
		  {
			 System.out.println("Launch chrome"); 
		  }
		  else if (browser[i].equals("opera"))
		  {
			  System.out.println("launch opera");
		  }
		  else if (browser[i].equals("firefox"))
		  {
			  System.out.println("launch firefox");
		  }
		  else if (browser[i].equals("ie"))
		  {
			  System.out.println("ie");
		  }
		  else
		  {
			  System.out.println("no bowser");
		  }
	  }
   }
}
	  
  
	   
	   
	   
   	   

   