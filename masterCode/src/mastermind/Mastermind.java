package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Mastermind,Pick four colors,You have 10 chances");
		System.out.println("Pickable colors: R,Y,G,B,P");
		System.out.println(
				"If you get a X, its means you have it at the right place, if its W, its means its at the wrong place and none of both means it doesn't exist.");

		String red = "R";
		String yellow = "Y";
		String green = "G";
		String blue = "B";
		String purple = "P";
		String white = "W";
		String black = "X";

		Scanner sc = new Scanner(System.in);

		String code1 = red;
		String code2 = red;
		String code3 = blue;
		String code4 = blue;

		String gok1;
		String gok2;
		String gok3;
		String gok4;

		String ans1;
		String ans2;
		String ans3;
		String ans4;

		for (int round = 1; round <= 10; round++) {
			gok1 = sc.next();
			gok2 = sc.next();
			gok3 = sc.next();
			gok4 = sc.next();

			System.out.println("Round "+ round);

			if (gok1.equals(code1)) {
				System.out.print("X");
			} else {
				System.out.print("W");
			}
			if (gok2.equals(code2)) {
				System.out.print("X");
			} else {
				System.out.print("W");
			}

			if (gok3.equals(code3)) {
				System.out.print("X");
			} else {
				System.out.print("W");
			}

			if (gok4.equals(code4)) {
				System.out.print("X");
			} else {
				System.out.print("W");
			}
		    
		}
		if (gok1.equals(purple)); {
			System.out.println("");
		}
		if (gok2.equals(purple)); {
			System.out.println("");
		}
		if (gok3.equals(purple)); {
			System.out.println("");
		}
		if (gok4.equals(purple)); {
			System.out.println("");
		}

	}

}