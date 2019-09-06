package com.AccountDetails;
import java.util.*;


public class Calc {
	
	public static void main(String[] args) {
	
		CalcAddSubMulDiv div = new CalcAddSubMulDiv();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a = scan.nextInt();
		
		
		System.out.println("Enter 2nd no.");
		int b = scan.nextInt();
		
		
		div.division(a, b);
		div.multiplication(a, b);
		
	}

}
