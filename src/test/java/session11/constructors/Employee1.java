package session11.constructors;

public class Employee1 
{
	//Variable
	String name;
	int age;
	String dept;
	int empId;
	
	static String compName = "Unicorn Sys";
	
	public static void main(String[] args)
	{
		Employee1 e1= new Employee1();
		e1.name = "Tom";
		e1.age = 25;
		e1.dept = "QA";
		e1.empId = 101;
		
		Employee1 e2= new Employee1();  
		e2.name = "Joe";
		e2.age = 26;
		e2.dept = "Developer";
		e2.empId = 102;
		
		System.out.println("Employee 1 information");
		System.out.println("Name --->" + e1.name);
		System.out.println("Age  --->" + e1.age);
		System.out.println("Dept  --->" + e1.dept);
		System.out.println("EmpId  --->" + e1.empId);
		System.out.println("Org Name -->" + Employee1.compName);
        System.out.println("---------------------------------------------------");
		System.out.println("Employee 2 information");
		System.out.println("Name --->" + e2.name);
		System.out.println("Age  --->" + e2.age);
		System.out.println("Dept  --->" + e2.dept);
		System.out.println("EmpId  --->" + e2.empId);
		System.out.println("Org Name -->" + Employee1.compName);
		
		
		
		
		
		
	}
}
