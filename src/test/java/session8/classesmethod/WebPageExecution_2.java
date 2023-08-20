package session8.classesmethod;

public class WebPageExecution_2 
{
  public static void main(String[] args)
  {
	  WebPage_1 ObjRef = new WebPage_1();
	  System.out.println(ObjRef.logo);
	  
	  ObjRef.footerlinks();
	 	
	  ObjRef.topPannel();
	  ObjRef.center();
	  ObjRef.footerlinks();
	  WebPage_1.privacyPolicy();
	  
	  System.out.println(ObjRef.title);

	  System.out.println(ObjRef.url);
	  
	  //System.out.println(WebPage_1.logo);
  }
}

