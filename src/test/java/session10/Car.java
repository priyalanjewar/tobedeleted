package session10;

public class Car 
{
	String name;
	int price;
	String colour;
	
	static int Wheels = 4;// every car has 4 wheels that'swhy  we are using wheels on static that is for hole program
	
	public static void main(String[] args)
	{
		//System.out.println("--------Sports Car----------");
		 Car sportscar= new Car();
		 sportscar.name = "BMW";
		 sportscar.price = 40000;
		 sportscar.colour = "Red";
		 
		 System.out.println("--------Sports car details---------");
		 System.out.println(sportscar.name +"  " + sportscar.price +"   "+sportscar.colour+ "  " + Wheels);
		 
		Car passengerCar = new Car();
		passengerCar.name = "Swift";
		passengerCar.price = 30000;
		passengerCar.colour ="white";
		
		System.out.println("--------Passenger Car details--------");
		System.out.println(passengerCar.name+ "  " + passengerCar.price + " " + passengerCar.colour+ "  "+ Wheels);
		 
		 
		 
	}

}
