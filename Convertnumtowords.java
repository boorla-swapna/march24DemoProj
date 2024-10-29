package org.practice;

import java.util.Scanner;

public class Convertnumtowords {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=input.nextInt();
		
		String singleDigits[] = {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		

		//number suppose 23;
		
		//suppose if the number is double digits like 23,45 for this we have to first seperate the numbers from right to left and store in a variable. 
		//store all the tens in another array.
		String doubleDigits[]= {" ","Tens","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		//Suppose if the number starts with hundreds. store hundreds in another String variable. and seperate the digits from hundredth place 
		//And change the condition of number invalid to 999 if the number is greater than this .
		String hundred="Hundred";
		
		//Suppose if the number starts with thousands.store thousand ina string variable and seperate the digits of thousand place value
		//And change the condition of number invalid to 9999 if the number is greater than this .
		String thousand="Thousand";
		
		
		
		if(number<0 || number>9999) {
			System.out.println("Invalid number Range");
		}else {
			int ones=number%10; //store last digit in last variable 23 ,here 3 is separated, and store 2 value in another variable tens
			int a=number/10;
			int tens=a%10; //store tens values in another variable
			int hundreds=number/100;//store hundred place value in hundreds
			//(now get the remainder if thousands are there in number to seperate hundreds)
			int h=hundreds%10;
			int thousands=number/1000;//store thousand place value in thousands
			
			
			if(number<20) 
			System.out.println(singleDigits[number]);
			else if(number>=20 && number<=99)
				System.out.println(doubleDigits[tens]+" "+singleDigits[ones]);
			else if(number>=100 && number<=999)
				System.out.println(singleDigits[hundreds]+" "+hundred+" "+doubleDigits[tens]+" "+singleDigits[ones]);
				
			else
				System.out.println(singleDigits[thousands]+" "+thousand+" "+singleDigits[h]+" "+hundred+" "+doubleDigits[tens]+" "+singleDigits[ones]);
			
		}		
		input.close();
	}

}
