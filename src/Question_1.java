import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		/* Enter any three integer numbers as an input and find the biggest of three
		numbers and sort them?*/
		
		// variable declaration
		int num1,num2,num3, max =0 , min =0, mid =0;
		
		Scanner scanner = new Scanner(System.in);
		
		// requesting import from user
		
		System.out.print("Please enter 3 interger numbe.  ");
		
		num1= scanner.nextInt();
		num2= scanner.nextInt();
		num3 =scanner.nextInt();
		
		scanner.close();
		
		// condition to determine the biggest number 
	
		 if (num1> num2) {
			 if (num1>num3) {
				 
				 max = num1;
				 min =(num2 < num3)? num2 : num3;
				 if (!(num2==min) &&  !(num2==max) && !(num2==num3)) {
					mid = num2 ;
				}else  {mid=num3;}
				 
			}
			
		}else if (num2>num3) {
			 
			 max = num2;
			 min =(num1 < num3)? num1 : num3;
			 if (!(num1==min) &&  !(num1==max) && !(num1==num3)) {
					mid =num1 ;
				}else  {mid=num3;}
			 
		}else if (num3>num1) {
			
			 max = num3;
			 min =(num2 < num1)? num2 : num1;
			 if (!(num2==min) &&  !(num2==max) && !(num2==num1)) {
					mid =num2 ;
				}else {
					
					mid=num1;
				}
			 		
		}
		 
		System.out.println( "The biggest number  is "+ max  +"\n");
		System.out.println("The numbers sorted in ascending order " + min + " "+ mid + " "+  max+"\n");
		System.out.println("The numbers sorted in descending order " + max + " "+ +mid + " "+ min+ "\n");
		
	}

}
