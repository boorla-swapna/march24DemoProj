package org.practice;

import java.util.Scanner;

public class Bubblesort {

	
		public static void bubbleSort(int[] numbers) {
			for(int i=0;i<numbers.length-1;i++) {
				for(int j=0;j<numbers.length-i-1;j++) {
					if(numbers[j]>numbers[j+1]) {
						int temp=numbers[j];
						numbers[j]=numbers[j+1];
						numbers[j+1]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("After sorting: ");
			for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			}
		}

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
	        
			int[] numbers=new int[5];
			
			for(int i=0;i<numbers.length;i++) {
				numbers[i]=input.nextInt();
			}
			System.out.println("Elements in Array before bubble sort : ");
			for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			}
			
			bubbleSort(numbers);
			

	}

}
