package session14.Test;

import session14.Company1;

public class TestCompany3 extends Company1

{
//for protected
	public String chamgedCeoName()
	{
		Ceoname = "Mr.Tom";
		return Ceoname;
	}
	
	// for default
	//because its string 
//	public void changeCompanyName()
//	{
//		CompanyBranchName = "Unicorn";
//		return compayBranchName;
//	}
	//for private//its how error
//	public void changeRevenueOfCompany()
//	{
//		revenue = 1000;
//	}
	// for public
	public int changeEmployeeCountOfComp()
	{
		employeeCount = 250;
		return employeeCount;
	}
	public static void main (String[] arg)
	{
	TestCompany3 comp = new TestCompany3 ();
	System.out.println(comp.chamgedCeoName());
	System.out.println(comp.changeEmployeeCountOfComp());
	}
}
