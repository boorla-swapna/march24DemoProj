package org.practice;

import java.util.Scanner;

public class Reversestring {


	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String string=input.nextLine();
		String reverse="";
		
		for(int i=string.length()-1;i>=0;i--) {
			 reverse=reverse+string.charAt(i);//store each character in string from end to start in reverse
		}
		System.out.println("Reverse of the String is " + reverse);
		input.close();
}
}



