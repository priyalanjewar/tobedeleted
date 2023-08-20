package session5;

public class stringmanupulations
{

	public static void main(String[] args)
	
	{
		// find a char at some specific index value
		
		String str2 ="I am learning String in java";
		char charName = str2.charAt(2);
		System.out.println("At 2nd index position the char avaiable is"  + str2.charAt(2));
		System.out.println(str2.length());
		//System.out.println(str2.charAt(48));// when string out of bound then its show excepatation show
		
		String str3 ="hello there";
		System.out.println(str3.length());
		int indexPosition =str3.indexOf("e");
		System.out.println("Index position of char e is -->" +  indexPosition);
		System.out.println("Index position of char e  2nd occuranceis -->" + str3.indexOf('e', 2));
		System.out.println("Index position of char e  2nd occuranceis -->" + str3.indexOf('e', str3.indexOf('e')+1));
		System.out.println(str3.indexOf('z'));// when the character is not at statement ex hell there than that character output is always -1 ask in interview
		
		 
		String str4 ="GitHub is acquired by ms by your 2018";
		System.out.println(str4.indexOf("by"));
		System.out.println(str4.indexOf("apple"));//-1
		
		String str5 =" MY NAME is CANNOT DEXTOP appliCATIONs";
		System.out.println(str5.toUpperCase());// convert all statement into capital letter
		
		String str6 =" MY NAME is CANNOT DEXTOP appliCATIONs";
		System.out.println(str6.toLowerCase());// convert all statement into small  letter
		
		String str7 =" ...........MY NAME is CANNOT DEXTOP appliCATIONs";
		String trimmedVersion = str7.trim();
		System.out.println(trimmedVersion);
		
		String str8 ="12/05/1988";//12:05:1988 or 12#05#1988
		System.out.println(str8.replace('/','#'));
		
		String str9 =" MY NAME is CANNOT DEXTOP appliCATIONs";
		System.out.println(str9.contains("MY"));// MY
		
		String str10 =" The transition number us -- 4545454@@@6767";
		System.out.println(str10.substring(27));
	
		String str11 ="Your transition is->  ab666666 Thankyou!!";
		System.out.println(str11.substring(20, 30));
		
		String statement1 ="Java is platform independepent";
		String statement2 ="java is platform independepent";
		String statement3 ="Java is platform independepent";
		
		System.out.println(statement1.equals(statement3));//true all same
		System.out.println(statement1.equals(statement2));//false because small j is in statement
		
		String str13 =" Java is basied on oop";
		System.out.println(str13);
		String words[] = str13.split(" ");// print statement spelling in different different line
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i] + words[i]);//print every charter 2 time
		}
		
		String str14 =" Good Bye";// Bye Good
		String[] revWords = str14.split("");
		System.out.println(revWords[1] + "  " + revWords[0]);
		
		
		
		
		
		
		
	}

	private static int split(String string) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	}

