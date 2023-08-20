package session12;

public class TestHospitals
{
	public static void main(String[] args)

{
	ApolloHospitals4 ap = new ApolloHospitals4();
	ap.ambulanceServices();
	ap.emergencyService();
	ap.anocologyServices();
	ap.ENTServices();
	ap.radiologyervices();
	System.out.println(USMedical1.min_fee);
	USMedical1.services_911();
	ap.intership();
	
	System.out.println("-----------------");
	
	//top casting
	
	USMedical1 us = new ApolloHospitals4();
	us.anocologyServices();
	us.orthopedicServices();
	us.radiologyServices();
	us.intership();
	System.out.println(USMedical1.min_fee);
	USMedical1.services_911();
	
	//down casting
	
	//its not allowed
	
	//ApolloHospitals4 ap1= new USMedical1();
	
}
}