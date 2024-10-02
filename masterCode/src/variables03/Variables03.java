package variables03;

import java.util.Scanner;

public class Variables03 {

    public static void main(String[] args) {
        
    	boolean hideBox = true;
    	boolean playerTurn = true;
int rood = 1;
int geel = 2;
int blauw = 3;
int oranje = 4;
int groen = 5;
int paars = 6;
int zwart = 7;
int wit = 8;

int codeKrakerRij1vak1;
int codeKrakerRij1vak2;
int codeKrakerRij1vak3;
int codeKrakerRij1vak4;

int codeKrakerRij2vak1;
int codeKrakerRij2vak2;
int codeKrakerRij2vak3;
int codeKrakerRij2vak4;

int codeKrakerRij3vak1;
int codeKrakerRij3vak2;
int codeKrakerRij3vak3;
int codeKrakerRij3vak4;

int codeKrakerRij4vak1;
int codeKrakerRij4vak2;
int codeKrakerRij4vak3;
int codeKrakerRij4vak4;

int codeKrakerRij5vak1;
int codeKrakerRij5vak2;
int codeKrakerRij5vak3;
int codeKrakerRij5vak4;

int codeKrakerRij6vak1;
int codeKrakerRij6vak2;
int codeKrakerRij6vak3;
int codeKrakerRij6vak4;

int codeKrakerRij7vak1;
int codeKrakerRij7vak2;
int codeKrakerRij7vak3;
int codeKrakerRij7vak4;

int codeKrakerRij8vak1;
int codeKrakerRij8vak2;
int codeKrakerRij8vak3;
int codeKrakerRij8vak4;

int codeKrakerRij9vak1;
int codeKrakerRij9vak2;
int codeKrakerRij9vak3;
int codeKrakerRij9vak4;

int codeKrakerRij10vak1;
int codeKrakerRij10vak2;
int codeKrakerRij10vak3;
int codeKrakerRij10vak4;

try (Scanner CodeKleur = new Scanner(System.in)) {
	String code_1 = CodeKleur.next();
	String code_2 = CodeKleur.next();
	String code_3 = CodeKleur.next();
	String code_4 = CodeKleur.next();
	
	System.out.println("De code:");
	
	System.out.println(code_1 + " " + code_2 + " " + code_3 + " " + code_4);
	
	System.out.println(" ");
	
	int rij = 1;
	System.out.println("beurt " + rij);
	System.out.println(" ");
	
	System.out.println("Raad de code:");
	System.out.println("kies uit rood, geel, groen, blauw, paars, oranje");
	
	String AntwoordCode_1 = CodeKleur.next();
	String AntwoordCode_2 = CodeKleur.next();
	String AntwoordCode_3 = CodeKleur.next();
	String AntwoordCode_4 = CodeKleur.next();
	
	System.out.println("Gok: " + AntwoordCode_1 + " " + AntwoordCode_2 + " " + AntwoordCode_3 + " " + AntwoordCode_4);
	
	System.out.println("");
	
	System.out.println("Hint:");
	System.out.println("Kies uit: zwart, wit");
	System.out.println("");
	
	String hintPositie_1 = CodeKleur.next();
	String hintPositie_2 = CodeKleur.next();
	String hintPositie_3 = CodeKleur.next();
	String hintPositie_4 = CodeKleur.next();
	
	System.out.println("Hint: " + hintPositie_1 + " " + hintPositie_2 + " " + hintPositie_3 + " " + hintPositie_4);
}
    }
}
