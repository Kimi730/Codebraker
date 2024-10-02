/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChkOddEven;

/**
 *
 * @author anshenoy
 */
import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        
        num = sc.nextInt();
        int sum = num % 2;
        if (sum == 1) { System.out.println("het getal is oneven");
			
		}
        if (sum==0) {System.out.println("het getal is even");
			
		}
        }
       }
    

