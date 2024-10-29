package org.practice;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number to find factorial: ");
	int num=s.nextInt();
	
	System.out.println("Factorial for given number " +num);

	 int fact=1;
	 for(int i=num;i>=1;i--) {
	 fact=fact*i;
	}
	 System.out.println(fact);
	 s.close();
	}
	
}
