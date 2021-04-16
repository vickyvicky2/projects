mport java.util.Scanner;
import java.util.Random;

public class Password {

	public static void main(String[] args) {

		
		// Create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		// Call 'displayMenu()' to show the menu to the user
		displayMenu();
	
		// Read in input from user and assign to 'choice'
		int choice = sc.nextInt();

        // IF-ELSE statements to decide which method to call
		if (choice == 1) {    // display password specifications to the user
		
			showPasswordSpecifications();
		
		} else if (choice == 2) {	// generate a random password for the user
		    
		    	System.out.println("\nYour password is: " + generateRandomPassword(sc));
		    
		} else if (choice == 3) {   // ask the user to input a password and test for validity
		    
		    System.out.println("\nEnter a password to test:");
			sc.nextLine();
			String input = sc.nextLine();
			
			if (verifyPasswordSpecifications(input) == true) {
				
				System.out.println("\nYour password is valid.");
				
			} else {
			    
				System.out.println("\nYour password is NOT valid.");
				
			}
			
		} else {
			
			System.out.println("Sorry! That was an invalid option.");
			
		}

        // close the scanner
		sc.close();

	}

	public static void displayMenu() {
	System.out.println("Here is your menu of options:");
	
	System.out.println("1. See the password rules");
	
	System.out.println("2. Generate a random password");
	
	System.out.println("3. Test the validity of a password");
	
	}

	public static String generateRandomPassword(Scanner sc) {  
	    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter seed:");
	long seedy = scanner.nextLong();
	
	Random rand = new Random(seedy);
		
	    char lowerCase1 =(char)(rand.nextInt(26) + 97);
	    char lowerCase2 =(char)(rand.nextInt(26) + 97);
		char upperCase1 =(char)(rand.nextInt(26) + 65);
		char upperCase2 =(char)(rand.nextInt(26) + 65);
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		char rand1 = (char)(rand.nextInt(33) + 126);
		char rand2 =(char)(rand.nextInt(33) + 126);
	    
	    String tempPass =("" + lowerCase1 + lowerCase2 + upperCase1 + upperCase2 + num1 + num2 + rand1 + rand2);
        
		return tempPass;

	}

	public static void showPasswordSpecifications() {
	System.out.println("The rules for your password are:");
	
	System.out.println("1. It must be at least 8 characters long");
	
	System.out.println("2. At least one letter must be capitalized");
	
	System.out.println("3. It must contain at least 2 numbers");

	}

	public static boolean verifyPasswordSpecifications(String input) {
	    
        boolean checkLength = false;
        int length = input.length();
        
        if(length >= 8) {
            checkLength = true;
        }
        
        char ch;
        
        boolean check = false;
        
        boolean upperCase = false;
        
        boolean twoNum = false;
        
        int count = 0;
        
        for (int i=0; i < input.length(); i++) {
            ch = input.charAt(i);
            
            if(Character.isDigit(ch)) {
                count++;
            }
            if(count >= 2) {
                twoNum = true;
            }
            else if (Character.isUpperCase(ch)) {
                upperCase = true;
            }
            if(check && upperCase && twoNum) {
                check = true;
            }
        }

		
		return check;

	}
	
}
