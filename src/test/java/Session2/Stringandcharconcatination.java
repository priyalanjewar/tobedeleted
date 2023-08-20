package Session2;

public class Stringandcharconcatination {
	

	public static void main(String[] args)
	{
		
		String x = "test";
		String y = "selenium";
		
		String c = "100";
		String d = "200";
		
		 int a = 100;
		 int b = 200;
		  
		 //1.
		 
		 System.out.println(a+b);//300
		  int total = a+b;
		  
		  System.out.println(total);
		 
		 //2.
		  System.out.println(x+y);// testselenium
		  
		  //3.
		  
		  System.out.println(a+b+x);//300test
		  
		  
		  //4.
		  System.out.println(a+b+x+y);// 300testselenium
		  
		  //5.
		  System.out.println(x+y+a);//testselenium100
		  
		  //6.
		  System.out.println(x+y+a+b);// testselenium100200
		  
		  //7.
		  System.out.println(c+d);
		  
		  //use case
		  
		  
		  int Bill = 520;
		  int Tax = 30;
		  int Total1 = Bill+Tax;
		  
		  System.out.println("Food Bill is"  + Total1);//550
		  System.out.println("Food Bill is " + (Bill + Tax)); //using brackets 550
		  
		  
		  
		  //char concatenation
		  
		  char c1 ='5';     int z1 =5;
		  char c2 = '4';	int z2 = 4;
		  char c3  = 'A';	String g1 = "A";
		  char c4 = 'B';	String g2 = "B";
		  
		  // using char  concatenation from net
		  System.out.println(c1+c2);// //105
		  
		  System.out.println(z1+z2);//9
		  
		  System.out.println(c3+c4);//131
		  
		  System.out.println(g1+g2);// A+B = AB
		  
		  System.out.println(c1+c2+c3+c4+c1+c2);// java will always calculate from left to right
		  
		  System.out.println(c1+c2+g1+g2+c1+c2);//105AB54  // how its calculate  105AB + '5' = 105AB5 + c2(4) =105AB54
}	
}