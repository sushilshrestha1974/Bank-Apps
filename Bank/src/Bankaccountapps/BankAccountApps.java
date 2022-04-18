package Bankaccountapps;

import java.util.List;

public class BankAccountApps {
	
	public static void main (String [] args) {
		String file= "C:\\Users\\SushilShrestha\\NewBankAccounts.csv";

	/*public static void main(String[] args) {
		Checking chkaccount = new Checking("Sushil Shrestha", "458777544", 498);
		Savings savaccount= new Savings("Bhagawati Shrestha" , "458797541" , 458);
		
		savaccount.compound();
		
		savaccount.showInfo();
		System.out.println("---------------");
		chkaccount.showInfo();
		/*savaccount.deposit(4000);
		savaccount.withdraw(2500);
		savaccount.transfer("Atlanta", 150);*/
	
				
		
	
		//read css file
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
System.out.println("New Account");
			System.out.println(accountHolder[0]);
System.out.println(accountHolder[1]);
System.out.println(accountHolder[2]);
System.out.println(accountHolder[3]);

	}
}
}

