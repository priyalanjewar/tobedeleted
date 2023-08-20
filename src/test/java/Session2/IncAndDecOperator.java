package Session2;

public class IncAndDecOperator
{
	
	public static void main(String[] args )
	{
		// + -
		//++  increase by 1 // -- decrease by 1
		
		int a = 1;
		//a = a+1;
		int b = ++a;
		
		System.out.println(b);// 2
		
		//Pre Inc //++ before 
		
		int i = 1;
		int j = ++i;// because i is increase their that'swhy ++1 =2
		System.out.println(i);//2
		System.out.println(j);//2
		
		//post Inc // ++ means after
		
		int p = 1;
		int q = p++;//  because p=1 and java always run left to right 1++ that's why p value is 1
		System.out.println(p);//1
		System.out.println(q);//2
		
		// pre dec
		
		int m = 2;
		int n = --m;
		System.out.println(m);//1
		System.out.println(n);//1
		
		
		// post dec
		
		int c = 0;
		int d = c--;
		System.out.println(c);//-1
		System.out.println(d);//0
		
		
		
		
		int f = -1;
		int g = --f;
		System.out.println(f);//-2
		System.out.println(g);//-2
		
		char abc = 'A';
		System.out.println(++abc);// B by using chart of char// A=65 then A increase 65 became 66 and 66 value in char is B
		System.out.println(abc++);//B
		
		char xyz = 'g';
		System.out.println(--xyz);//A by using chart of char
		System.out.println(xyz--);//A
		
		System.out.println(2+xyz);//68 by using chart
		
		
	}

}
