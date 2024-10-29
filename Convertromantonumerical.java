package org.practice;

import java.util.Scanner;

public class Convertromantonumerical {
	
	public static int romanValue(char r) {
		
		if(r=='I') 
			return 1;
		if(r=='V')
			return 5;
		if(r=='X')
			return 10;
		if(r == 'L')
	        return 50;
	    if (r == 'C')
	        return 100;
	    if (r == 'D')
	        return 500;
	    if (r == 'M')
	        return 1000;
	    else
	    return -1;
	}
	
	public static void convertRomantoNum(String str) {
		
		int r=0;
		char[] character=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			
			r=r+romanValue(character[i]);
			
			
			if(i-1>=0) {   
				
			if(romanValue(character[i-1])<romanValue(character[i])) 
			{
				
				r=r-2*(romanValue(character[i-1]));
				
			}
			 
		}

	}
		System.out.println(r);
		
}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Roman number:");
	    String str=input.nextLine();
		
	    convertRomantoNum(str);
	input.close();
	}

}
