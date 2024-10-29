package org.practice;

import java.util.Scanner;

public class Reversewordsinstring {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String string=input.nextLine();
		String reverseString="";
		String[] words=string.split("\\s");//separate the words by splitting the spaces between words
		
		//loop the words 
		for(int i=0;i<words.length;i++) {
			String word=words[i]; //store each word in word string.
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--) {//this loop is for characters
				reverseword = reverseword+word.charAt(j);
			}
			reverseString+=reverseword+" ";
		}
		System.out.println(reverseString);
		input.close();
	}

}
