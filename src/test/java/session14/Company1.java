package session14;

public class Company1
{
	private int revenue = 50_000;// its private use only inside a class
	protected String Ceoname = "Mr.Thomas";
	String CompanyBranchName = "Unicorn System Berlin";
	public int employeeCount =300;
	
	public static void main(String[] args)
	{
	Company1 comp	= new Company1();
	System.out.println("comp Rev  --->"  +  comp.revenue);
	System.out.println("comp ceoName  --->"  +  comp.Ceoname);
	System.out.println("comp BranchName  --->"  +  comp.CompanyBranchName);
	System.out.println("comp employeeCount  --->"  +  comp.employeeCount);
	}

}
