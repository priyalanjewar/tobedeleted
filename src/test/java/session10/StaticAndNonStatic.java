package session10;

public class StaticAndNonStatic
{
String name;// non static

static int age =25;//  static we write
public static void getname()
{
	System.out.println("getname");
}
public static void getstart()
{
	System.out.println("getstart");
}
public static void main(String[] args)
{
	getname();
	System.out.println(age);
	
//	StaticAndNonStatic objRefName = new StaticAndNonStatic();
//	objRefName.getname();
//	objRefName.name ="Tom";
//	System.out.println(objRefName.name);
//	objRefName.getstart();
//	System.out.println(objRefName.age);
	
	
	//StaticAndNonStatic objRef = new StaticAndNonStatic();
	// objRef.getname();
	// objRef = null;//we can not any value null at ow
	// objRef.getname();
	 
	
	
	
	
	
	
	
	
	
	
}
}
