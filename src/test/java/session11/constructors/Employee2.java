package session11.constructors;

public class Employee2 
{
	//Variable
		String name;
		int age;
		String dept;
		int empId;
		
		static String compName = "Unicorn Sys";
		private static Employee2 e3;
		private static Employee2 e4;
		
		
		public Employee2(String name, int empId)
		{
			this.name = name;// we are using this because this show we have to take value from up from variable 
			this.empId = empId;// equal to after value taken from bracket
			
			
		}
		public Employee2(String name, int age, String dept, int empId )
		{
			this.name = name;
			this.age = age;
			this.dept = dept;
			this.empId = empId;
			
		}
		public static void main(String[] args)
		{
			Employee2 e1= new Employee2("Tom",101);
			Employee2 e2 = new Employee2("Pat",102);
			Employee2.e3 = new Employee2("Steve", 35,"QA", 103);
			Employee2.e4 = new Employee2("Pat", 36,"Dev", 104);		
			
			
			System.out.println("----------------");
			System.out.println("Emp1 Name  --->"+  e1.name    + "Emp empId --->" + e1.empId);
			System.out.println("Emp1 Name  --->"+  e2.name      + "Emp empId --->" + e2.empId);
			System.out.println("Emp1 Name  --->"+  e3.name      + "Emp1 age --->"+ e3.age + "Emp1 dept--->" + e3.dept + "Emp empId --->" + e3.empId);
			System.out.println("Emp1 Name  --->"+  e4.name       + "Emp1 age --->"+ e4.age + "Emp1 dept--->" + e4.dept + "Emp empId --->" + e4.empId);
		}
		
		

}
