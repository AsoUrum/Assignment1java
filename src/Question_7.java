import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		
		/*
				Enter the grade of student as input, read a grade, and then display the
				equivalent description?
				Enter grade of the student:B
				Student has got marks above 60 but less than equal to 80 out of 100. 
		 * */
		
		
		
		
		
		// variable declaration
		
		char grade;
		// scanner declaration
		Scanner scanner = new Scanner(System.in);
		
		// requesting for input
		System.out.print("Please enter student grade: ");
		grade = scanner.next().charAt(0);
		
		
		// scanner closed 
		scanner.close();
		
		 // using switch control to find the  grade category 
		switch (grade) {
		case 'a':
		case 'A':
			System.out.println(" you marks is  between 90 and 100 and greather than 60.");
			break;
		case 'b':
		case 'B':
			System.out.println(" you marks is  between 80 and 90 and greather than 60.");
			break;
		case 'c':
		case 'C':
			System.out.println(" you marks is  between 70 and 80 and greather than 60.");
			break;
		case 'd':
		case 'D':
			System.out.println(" you marks is  between 60 and 70 and greather than 60.");
			break;
		default:
			System.out.println(" you marks is less than 60. which is a fail SORRY!!!");
			break;
		}

	}

}
