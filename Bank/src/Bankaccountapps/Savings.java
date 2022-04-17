package Bankaccountapps;

public class Savings extends Accounts {
	//attributes
	 int safetyDepositBoxID;
	private int safetyDepositkey;
	
		
	
		//method to checking account
		//constructors
	public Savings(String name, String SSN, double initDeposite) {
		super (name, SSN, initDeposite);
		accountNumber= "1" +accountNumber;
		setSafetyDepositBox();
		
		/*System.out.println("Account Number is "+ this.accountNumber);	
		System.out.println("New Saving Accounts " );
		System.out.println("Name:" + name);*/
		}
	@Override	
	public void setRate() {
		rate = getBaseRate()-.25;
		//System.out.println("Implement rate for saving ");
	}
		
	private void setSafetyDepositBox() {
		safetyDepositBoxID =(int)( Math.random()* Math.pow(10,3));
		//System.out.println(safetyDepositBoxID);
		safetyDepositkey=(int) (Math.random()* Math.pow(10,4));
		}
	public void showInfo() {
		
		System.out.println("Account Type: Saving");
		super.showInfo();
		System.out.println("Saving Account Features" +"\n Safety Deposti Box ID "+ safetyDepositBoxID + "\n Safety Deposite Key " + safetyDepositkey);
	}
	
}

