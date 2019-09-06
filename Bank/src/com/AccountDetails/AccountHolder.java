package com.AccountDetails;

public class AccountHolder {
	String FirstName, LastName;
	int age;
	float balance;
	boolean EligibleforCC;
	
	public void  testEligibleforCC() {
	
	if (age >20 && balance >=20000) {
		EligibleforCC = true; 
	}
}
}
