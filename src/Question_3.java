import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		/* 
		 * Enter any decimal number as an input and convert the number to binary?
		   Enter the Decimal Number:19
	       10011
	       
		 */
		
		
		int num , i = 0;
		int[] arryNum = new int[50];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a decimail number to convert to Binary. ");
		
		num = scanner.nextInt();
		
		scanner.close();
		
		
		// performing  the binary division with a do loop
		
		do {
			arryNum[i]= num%2;
			i++;
			num = num/2;
		} while ((num)>0);
		
		
		// displaying the Result.
		
		
		for (int k = i-1; k >=0; k--) {
			System.out.print(arryNum[k]); 
		}		
	}

}		
		
		
		


