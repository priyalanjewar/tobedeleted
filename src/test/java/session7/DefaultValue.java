package session7;

public class DefaultValue 
{
	//global variable
	public static String str;
	public static int i;
	public static double d;
	public static boolean b;
	public static char c;
	public static byte z;
	
	//local variable
public static void main(String[] args)
{
	System.out.println(str);//null
	System.out.println(i);//0
	System.out.println(d);//0.00
	System.out.println(b);//false
	System.out.println(c);//print empty space will be show
	System.out.println(z);//0
	
	int p=12;
	System.out.println(p);//121
	
	int div1= 9/3;
	System.out.println(div1);//3
	
	int div2=0/3;
	System.out.println(div2);//0
	
	//int div3=9/0;//its output show exception because there at down 0  not divided by 0
	//System.out.println(div3);//infinite
	
	
	
	
	
}
}
