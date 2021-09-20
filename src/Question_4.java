import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		/* 
		 * Enter any character as an input and check if a given character is vowel or consonant?
		 * 
		 * */
		
		
		
		
		// declaring variables 
		char  aChar;
		char[] arrayVowels = {'a','e','i','o','u','A','E','i','O','U'};
		int len = arrayVowels.length;
		String flag = new String();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Please enter a character to valided if its is vavowel or consonant. ");
		aChar = scanner.next().charAt(0);
		
		
		scanner.close();
	
		
		for(int i = 0; i < len; i++) {
			
			if(arrayVowels[i] == aChar) {
				
				flag = "Vowels";
			}
			else {
				
				flag = "Cosonant";
				
			}	
		}
		System.out.printf("The character entered  %s is a %s.", aChar, flag);
	}

}
