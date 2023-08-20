package Session15;

public class TryCatch_4 {
	
	static int x = 9;
	static int y = 3;
	public static void main(String[] args)
	
	{
		
	TryCatch_4 tc= new TryCatch_4();
	tc.division(x, y);
	
	}
		public void division(int Ny,int Dy) {
		try{
			int division = Ny/Dy;
			System.out.println("The division of input --->"  +Ny+ "and" +Dy+ "is --->" + division);
			}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("An exception occurs while having the division");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("An exception occurs while having the division");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An exception occurs while having the division");
		}
		
	}
	

}
