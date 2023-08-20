package session10;

import session10.WebPages;

public class WebPages 
{
	String title;
	 String url;
	 String header;
	 static String logo="https://www.something.com/logoimages/logo";
	 
	 public void topPannel()
	 {
		 System.out.println("topPannel");
		 
	 }
	 public void leftPannel()
	 {
		 System.out.println("leftpannel");
	 }
	 public void footerectionPannel()
	 {
		 System.out.println("footerSecpannel");
	 }
	 public static void privacyPolicy()
	 {
		 System.out.println("privarcypolicy");
	 }
	 public static void main(String[] args)
	 {
		 WebPages page1 = new WebPages(); 
		 WebPages page2 = new WebPages();
		 //WebPages page3 = new WebPages();
		 
		 //assigning the value  to login page
		 
		 page1.title = "Login Page Title";
		 page1.header = "Welcome to the app";
		 page1.url = "https://www.something.com/Login";
		 
		 
		 //assigning the value  to homepage
		 
		 page2.title = "HomePage Title";
		 page2.header = "Welcome user";
		 page2.url = "https://www.something.com/HOMEPAGE";
		 
		 System.out.println("------Login WebPage Start----");
		 System.out.println(page1.title+ "     "+ page1.header+ "     "+page1.url);
		 page1.topPannel();
		 page1.leftPannel();
		 page1.footerectionPannel();
		 WebPages.privacyPolicy();
		 System.out.println("-------Login WebPage End-----");
		 
		 System.out.println("------HomePage Start----");
		 System.out.println(page2.title+ "     "+ page2.header+ "     "+page2.url);
		 page2.topPannel();
		 page2.leftPannel();
		 page2.footerectionPannel();
		 WebPages.privacyPolicy();
		 System.out.println("-------HomePage End-----");
		 
		 
}
}

