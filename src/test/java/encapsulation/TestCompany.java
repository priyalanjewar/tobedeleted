package encapsulation;

public class TestCompany
{
public static void main(String[] args)
{
	Company1 c = new Company1();
	
	c.setname("Alphabet Corp");
	System.out.println(c.name);
	System.out.println(c.getname());
	
	c.setlogo("https://www.alphabrts.com/logo");
	System.out.println(c.logo);
	System.out.println(c.getlog0());
	
	c.setEmpCount(1000);
	System.out.println("Company Emp count is-----");
	System.out.println(c.EmpCount);
	System.out.println(c.getEmpCount());
	
	c.setSearchEngine("Google");
	System.out.println("Company using a serach engine");
	System.out.println(c.getSearchEngine());
	

	c.setRevenue(1_00_00_0000);
	System.out.println("Company revenue");
	System.out.println(c.getRevenue());
}
}
