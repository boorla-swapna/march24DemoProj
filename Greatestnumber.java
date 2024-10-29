package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Greatestnumber {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int num[]=new int[4];
	int size=num.length;
	for(int i=0;i<4;i++) {
		System.out.println("enter first element" +(i+1)+ ":");
		num[i]=sc.nextInt();
		
	}
   System.out.println("the elements in array are: " );
	for(int arr:num) {
		System.out.print(arr+ " ");
	}
	Arrays.sort(num);
	System.out.println("\n sorted array is :" );
	for(int arr:num) {
		System.out.print(arr+ " ");
	}
	System.out.println("\nThe first greatest number is" +num[size-1]);
	System.out.println("The second greatest number is" +num[size-2]);
	System.out.println("The third greatest number is" +num[size-3]);
}
}
    




