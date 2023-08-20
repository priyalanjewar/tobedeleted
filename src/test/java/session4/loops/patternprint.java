package session4.loops;

public class patternprint 
{
 public static void main(String[] args)
 {
	//when you have to print star like this the things by making square to this down start in square box row and column
	 //*
	 //**
	 //***
	 //****
	 
	 for(int i =1;i<=4; i++)
	 {
		 for(int j=1; j<=i; i++)
		 {
			 System.out.print("*"); // there is in code println is not there because when we have tp print in same line then ln is not used
		 }
		 System.out.println(); //this code only shift the cursor into the next line
	 }
	 
 }
}
