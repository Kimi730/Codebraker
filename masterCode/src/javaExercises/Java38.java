package javaExercises;

public class Java38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        
        int letters = 0, spaces = 0, numbers = 0, others = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            } else {
                others++;
            }
        }
        
        System.out.println("The string is : " + input);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}
