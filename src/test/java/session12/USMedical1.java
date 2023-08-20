package session12;

public interface USMedical1  extends WHO0
{
	int min_fee = 10; // by default static and final
	
	
	public void physioServices();// Abstract (prototype) method
	
	
	
	
	public void anocologyServices();// Abstract (prototype) method
	
	
	
	public void orthopedicServices();// Abstract (prototype) method
	
	
	
	public void radiologyServices();// Abstract (prototype) method
	
	
	public static void services_911()
	{
		System.out.println("Us------911 Services");
	}
	default void intership()
	{
		System.out.println("US-----Intership");
	}
	
}
