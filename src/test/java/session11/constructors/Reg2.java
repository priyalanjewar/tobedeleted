package session11.constructors;

public class Reg2
{
String  firstname;
String lastname;
long phoneNumber;
String emailId;
String password;
String address;
String ddmmyy;

public Reg2()
{
	System.out.println("Zero parameter const");
}

//with some value (non detail reg)
public Reg2(String firstname, String lastname, String password,long phonenumber, String emailId, String address, String ddmmyy)
{
	this.firstname = firstname;
	this.lastname = lastname;
	this.password = password;
	this.phoneNumber = phonenumber;
	this.emailId = emailId;
	this.address =address;
	this.ddmmyy = ddmmyy;
	
	
}
public void nonDetailReg()
{
	System.out.println("process  your input information with.....");
	System.out.println("Firstname  --->"  + firstname);
	System.out.println("Lastname  --->"  + lastname);
	System.out.println("Password  --->"  + password);
}


public void DetailReg()
{
	System.out.println("process  your input information with.....");
	System.out.println("Firstname  --->"  + firstname);
	System.out.println("Lastname  --->"  + lastname);
	System.out.println("Password  --->"  + password);
	System.out.println("Phonenumber  --->"  + phoneNumber);
	System.out.println("Emailid --->"  + lastname);
	System.out.println("address  --->"  + address);
	System.out.println("DOB  --->"  + ddmmyy);
	
}
}


