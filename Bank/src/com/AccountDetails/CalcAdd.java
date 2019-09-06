package com.AccountDetails;
import java.util.*;


public class CalcAdd {
	
	public static void main(String[] args) {
		
		Scanner test = new Scanner(System.in);
		System.out.println("Enter first No::");
		int i = test.nextInt();
		
		
		System.out.println("Enter Second No::");
		int j = test.nextInt();
		
		
		CalcAddSubMulDiv add = new CalcAddSubMulDiv();
		add.add(i, j);
	
		test.close();
	}

}
