package javaExercises;

public class Java69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String input = "Python";
        
        if (input.length() % 2 == 0) {
            String firstHalf = input.substring(0, input.length() / 2);
            System.out.println(firstHalf);
        } else {
            System.out.println("The length of the string is not even.");
        }
        
    }
}
	
