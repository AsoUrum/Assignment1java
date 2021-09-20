import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
		/*
		 * Enter any integer number as an input and convert a given number of days in
		 * terms of Years, Weeks & Days ?
		 * Enter the number of days:756
		 * No. of years:2
		 * No. of weeks:3
		 * No. of days:5*/

	

	
	// variable declaration 
	
	int num, numOfYears, numOfWeeks, numOfDays = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	// requesting  the number of years from user
	
	System.out.print("Please enter an interger number to convert to years, weeks and days.  ");
	num = scanner.nextInt();
	
	
	scanner.close();
	
	
	// getting the number of years
	
	if (num >= 365) {
		numOfYears = num/365;	
	} else {
		numOfYears = 0;
	}
	
	// getting the number of weeks
	
	if (numOfYears ==0 && num >= 7) {
		
		numOfWeeks = num / 7;
		
	} else if(numOfYears > 0  && num >= 7) {
		
		numOfWeeks = (num -(365 * numOfYears))/7;

	}else {
		
		numOfWeeks= 0;
	}
	
	
	// getting the number of days
	
	if (numOfWeeks == 0 && numOfYears > 0 ) {
		
			numOfDays = num - (365*numOfYears);
		
		
	} else if(numOfWeeks > 0) {
		
		numOfDays = num -((365 * numOfYears)+ (7 * numOfWeeks));
		
		
	} else {
		
		numOfDays = 0;
	} 
	
	
	
	
	System.out.printf("No. of years  is %d", numOfYears);
	System.out.println("\n");
	System.out.printf("No. of weeks  is %d", numOfWeeks);
	
	System.out.println("\n");
	System.out.printf("No. of days  is %d", numOfDays);
	
	}
	
}
