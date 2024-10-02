/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int round = 0;
        System.out.print("Enter a number: ");
        int number = console.nextInt();

        while (number <=9) {
            sum = sum + number;
            System.out.print("Enter a number: ");
            number = console.nextInt();
            round ++;
        }

        System.out.println("The sum is " + sum);

    }
}
