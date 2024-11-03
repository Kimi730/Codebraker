package javaExercises;

public class Java37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalStr = "The quick brown fox";
        String reversedStr = "";
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reversedStr += originalStr.charAt(i);
        }
        System.out.println("Reversed string: " + reversedStr);
	}
}
