import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		/* Enter any integer number as an input and the reverse the given number?
		   Enter the number:567
		   Reverse:765
		 	*/

		
		// variable declaration 
		String str =  "12345";
		int len;
		Scanner scanner = new Scanner(System.in);
		 
		
		// inputing into the program
		
		System.out.println("Please Enter an interger number to reverse.  ");
		str = scanner.nextLine();
		
		scanner.close();
		
		
		len = str.length();
		
		char[] charArr1 = str.toCharArray();
		char[] charArr2 = new char[len];
		
		
		for (int i = 0; i < len; i++) {
			
			charArr2[i]= charArr1[len-1-i];
				
			
		}
		
		
		String str2 = new String(charArr2);
		
		System.out.println("The result is "+ str2);

		
		
		
		
	}

}
