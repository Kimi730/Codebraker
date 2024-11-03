package javaExercises;

public class Java50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder dividedBy3 = new StringBuilder();
        StringBuilder dividedBy5 = new StringBuilder();
        StringBuilder dividedBy3And5 = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                dividedBy3And5.append(i).append(", ");
            } else if (i % 3 == 0) {
                dividedBy3.append(i).append(", ");
            } else if (i % 5 == 0) {
                dividedBy5.append(i).append(", ");
            }
        }

        System.out.println("Divided by 3:");
        System.out.println(dividedBy3.toString());
        System.out.println("Divided by 5:");
        System.out.println(dividedBy5.toString());
        System.out.println("Divided by 3 & 5:");
        System.out.println(dividedBy3And5.toString());
    }
}
	
