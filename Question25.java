package com.cozentus.JavaTask;

import java.util.Scanner;

public class Question25 {
	
	 public static boolean TwoDecimal(double num1, double num2) {
	        
		 	int Num1 = (int) (num1 * 100);
	        int Num2 = (int) (num2 * 100);
	        return Num1 == Num2;
	   }
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double number2 = sc.nextDouble();

        if (TwoDecimal(number1, number2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

