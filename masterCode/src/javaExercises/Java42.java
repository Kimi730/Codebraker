package javaExercises;

import java.util.Scanner;

public class Java42 {

	public class PasswordInputScanner {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Input your Password: ");
	        String password = scanner.nextLine();
	        
	        System.out.println("Your password was: " + password);
	        
	        scanner.close();
	    }
	}

}
