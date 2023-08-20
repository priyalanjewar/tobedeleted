package session6;

public class WrapperClasses 
{
 public static void main(String[] args)
 {
	 
	 //String to Integer
	 
	  String x ="100";
	 //System.out.println(x+10);//10010
	 
	 
	 int i = Integer.parseInt(x);
	 
	 System.out.println(i+10);
	 
	 // Integer to String
	 
	 int q = 10;
	 System.out.println(q+5);//10 + 5 =15  --.105
	 String s = String.valueOf(q);//"10"
	 System.out.println(s+5);//105
	 
	 String b ="12.13";
	 System.out.println(b+10);
	 
	 Double d= Double.parseDouble(b);
	 System.out.println(d+10);
	 
//	 
//	 String amount1 = "$456";
//	 String tmp = amount1.replace("$", " ");
//int temp1 = Integer.parseInt(tmp);
//	 
//	 System.out.println(temp1+20);
	 
	 String amount2 = "$456/-";
	 String tmp1 =amount2.replace("$", "");
	 String tmp2 =amount2.replace("/-","");
	 int temp2 = Integer.parseInt(tmp2);
	 
	 System.out.println(temp2+30);
	 
	 
	 
	 
	 
	 
 }
}
