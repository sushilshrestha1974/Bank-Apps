package Bankaccountapps;

public abstract class Accounts implements Baserate {
	//attributes
	private String name;
	private String SSN;
	private double balance;
	protected double rate;
	protected String accountNumber;
	private static int index = 10000;
	
	
		
	
	
	//constructor
	public Accounts(String name, String SSN, double initDeposite) {
		this.name=name;
		this.SSN=SSN;
		this.balance=initDeposite;
		//System.out.println("Name:"+ name + " SSN: " + SSN + " Balance is $ "+ balance);
	
		//set accounts number
		index++;
		
		this.accountNumber= setAccountNumber();
		setRate();
		
		}
	public abstract void setRate();
	
	
		private String setAccountNumber() {
			String lastTwoOfSSN=SSN.substring(SSN.length()-2, SSN.length());
			int uniqueID = index;
			int randomNumber=(int)(Math.random()*Math.pow(10, 3));
			return lastTwoOfSSN + uniqueID+randomNumber;
			
		}
		public void compound() {
			double accruedInterest = balance * (rate/100);
			balance = balance + accruedInterest;
			
			System.out.println("Accrued Interest $" + accruedInterest);
			printBalance();
			
			
			
			
		}
		//list common method and transactions
		public void deposit(double amount) {
			balance=balance + amount;
			System.out.println("Depositing $" + amount);
			printBalance ();
			
			
		}
		public void withdraw(double amount) {
			balance = balance -amount;
			System.out.println("Withdrawing $" + amount);
			printBalance ();
		}
		public void transfer(String toWhere, double amount) {
			balance = balance -amount;
			System.out.println("Transfering $"+ amount + "to " + toWhere);
			printBalance ();
			
		}
		public void printBalance() {
			System.out.println("Your balance is now $" + balance);
		}
		
		public void showInfo() {
			System.out.println(
			"NAME: " + name +
			" \nACCOUNT NUMBER: " +	accountNumber+
			" \nBALNACE: " + balance+ "\nRATE:" + rate +"%");
			
		}
		
}


