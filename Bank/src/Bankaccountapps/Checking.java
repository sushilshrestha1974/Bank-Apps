package Bankaccountapps;

public class Checking extends Accounts{
	//attributes
	private int debitCardNumber;
	private int debitCardPin;
	
	//method to checking account
	//constructors
	public Checking(String name, String SSN, double initDeposite) {
		super (name, SSN, initDeposite);
		accountNumber= "2" +accountNumber;
		setDebitCard();
		
		/*.out.println("Account Number is "+ this.accountNumber);	
		System.out.println("New Checking Account");
		System.out.println("Name: " + name);*/
	}
	@Override	
	public void setRate() {
		rate = getBaseRate()*.15;
		
		//System.out.println("Implement rate for chekcing ");
	}
	private void setDebitCard() {
		debitCardNumber =(int) (Math.random()* Math.pow(10,12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
		//System.out.println("My Card Number is: " +debitCardNumber);
		//System.out.println("My Card Pin Number is:" + debitCardPin);
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Checking Account features " + "\n Debit Card number: "+ debitCardNumber + "\n Debit Card Pin " + debitCardPin);
	}
	
}


