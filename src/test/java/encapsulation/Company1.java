package encapsulation;

public class Company1 
{
 public String name;
 public String logo;
 public int EmpCount;
 public String searchEngine;
 public int revenue;// company turnover
 
 // getter and setter
 
 public String getname()
 {
	 return name;
 }
 public void setname(String name)
 {
	 this.name = name;
 }
 public String getlog0()
 {
	 return logo;
 }
 public void setlogo(String logo)
 {
	 this.logo = logo;
 }
 public int getEmpCount()
 
 {
	 return EmpCount;
 }
 public void setEmpCount(int EmpCount)
 {
	 int addMoreEmp = 10 + EmpCount;
	 EmpCount =    addMoreEmp;
 }
 public String getSearchEngine()
 {
	 return logo;
 }
 public void setSearchEngine(String searchEngine)
 {
	 this.searchEngine = searchEngine;
	 
 }
 public String getRevenue()
 {
	 return logo;
 }
 public void setRevenue( int rev)
 
 
 
 
 
 
 
 
 
 
 
 {
	 int revToPublic = rev - 1000;
	this.revenue = revToPublic; 
 }
}
