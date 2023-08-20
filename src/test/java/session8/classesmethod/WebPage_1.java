package session8.classesmethod;

public class WebPage_1
{
 //where we write the code
// It a template where logical code
//An object is an entity that comes from class
//Data members, methods variables logic and all in a class
	
	
	// Data members // variables
	
	String title="online shopping";
	String url =" https;//www.amazon.in/";
	String logo=" amazon";
	
	//Non static Method
	public void topPannel()// in non static we don't have to write static in public
	{
		//logic
		System.out.println("-----Top Pannel Start------");
		System.out.println(url);
		System.out.println("This is a top pannel of the webpage");
		System.out.println(title);
		System.out.println(logo);
		System.out.println("-------Top Pannel Start--------");
	}
	
	public void footerlinks()
	{
		//logic
		
		System.out.println("-----footerlink Pannel Start------");
		System.out.println("Footer Link 1");
		System.out.println("Footer Link 2");
		System.out.println("Footer Link 3");
		System.out.println("-------footerlink pannel End------");
		
	}
	public void center()
	{
		//logic
		
		System.out.println("-----center Pannel Start------");
		System.out.println("Mobiles");
		System.out.println("Laptops");
		System.out.println("camera");
		System.out.println("-------center pannel End------");
		
	}
	
	//method of type static// in static we write static in public
	public static void privacyPolicy()
	{
	
			//logic
			
			System.out.println("----------privacyPolicy pannel start-------");
			System.out.println("About the Business");
			System.out.println("About the Vendors");
			System.out.println("Privacy Notes");
			System.out.println("-------privacyPolicy pannel End------------");			
		
	}
//	public static void main (String[] args)
//	{
//		WebPage_1 wb = new WebPage_1();	
//		wb.topPannel();
//		wb.center();
//		wb.footerlinks();
//		privacyPolicy();//static don't need wb.
//	}
}
