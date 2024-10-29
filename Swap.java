package org.practice;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		//swapping without third variable
		Scanner s=new Scanner(System.in);
	     System.out.print("Enter first number:");
			int num1=s.nextInt();
			System.out.print("Enter second number:");
			int num2=s.nextInt();
			
			System.out.println("numbers before swapping: " +num1 + " " +num2);
			
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			
			System.out.println("numbers after swapping: " +num1 +" " +num2);

	}

}
