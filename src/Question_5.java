import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		/*
			    Enter any decimal number as an input and count the number of bits set to one?
				Enter the Decimal Number:15
				No. of 1's are:4

		  */

		
		int num , i = 0, count=0;
		int[] arryNum = new int[50];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a decimail number to count the bits. ");
		
		num = scanner.nextInt();
		
		scanner.close();
		
		
		// performing  the binary division with a do loop
		
		do {
			arryNum[i]= num%2;
			i++;
			num = num/2;
		} while ((num)>0);
		
		
		// displaying the Result.
		
		
		for (int k =0 ; k < i ; k++) {
			
			if(arryNum[k]== 1) {
				
				count++;
				
			}
			
		}
		
		System.out.printf("The number of 1s are %d: ", count);
	}

		
		
		
		
		
		
		
	

}
