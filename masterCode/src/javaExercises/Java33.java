package javaExercises;

public class Java33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int number = 25;
	        int sum = sumOfDigits(number);
	        
	        System.out.println("The sum of the digits is: " + sum);
	    }

	 
	    public static int sumOfDigits(int number) {
	        int sum = 0;

	        number = Math.abs(number);
	        
	        while (number > 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	   return sum;
	    }
	}
