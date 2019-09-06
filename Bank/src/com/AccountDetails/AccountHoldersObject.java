package com.AccountDetails;

public class AccountHoldersObject {

	public static void main(String[] args) {		
	
		
		AccountHolder tom = new AccountHolder(); 
		tom.FirstName="Tom";
		tom.LastName = "Hanks";
		tom.age=20; 
		tom.balance=20000; 
		tom.testEligibleforCC();
		System.out.println("tom:"+tom.EligibleforCC);
		
		AccountHolder henry = new AccountHolder();
		
		henry.FirstName="Henry";
		henry.LastName = "Hill";
		henry.age=30; 
		henry.balance=20000; 
		henry.testEligibleforCC();
		System.out.println("henry:"+henry.EligibleforCC);
		
		
		
	}
	
}
