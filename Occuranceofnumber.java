package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Occuranceofnumber {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
		
		int[] arraynum=new int[6];
		
		System.out.println("Enter elements into array:");
		for(int i=0;i<arraynum.length;i++) {
			arraynum[i]=input.nextInt();
		}
	
		int num=0;
		Arrays.sort(arraynum);
		System.out.println("Sorted array:" );
		for(int arr:arraynum) {
			System.out.print(arr+" ");
		}
		
		
		for(int i=0;i<arraynum.length;i++) {
			int count=1;
			if(i!=arraynum.length-1) {
			   for(int j=i+1;j<arraynum.length;j++) {
				
				if(arraynum[i]==arraynum[j]){
					count=count+1;
				}
				
				else {
					
					break;
				}
			   }
			}
			System.out.println();
			System.out.println("Element" +arraynum[i]+" " +"occured "+count +" times"); 
            i+=(count-1);
			
		}
		
		input.close();
		}

	}


