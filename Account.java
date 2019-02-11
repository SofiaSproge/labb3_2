package ver1;

public class Account {

	protected Customer theCustomer;
	protected int accountNumber;
	protected double theBalance;
	protected Bank fromBank;
	private static int availableNumbers = 0;
	protected String accountType;
	public static double CURRENTACCOUNTFEE=10.0;
	public static double SAVINGSINTEREST=0.01;
	
	public Account(Customer arg1, double arg2, Bank arg3) {
		theCustomer = arg1;
		theBalance = arg2;
		fromBank = arg3;
		availableNumbers = availableNumbers + 1;
		accountNumber = availableNumbers;
		
	}
	
	public void annualChange(){
		if(accountType.equals("Current")) {
			theBalance = theBalance - CURRENTACCOUNTFEE;
		}
		else if(accountType.equals("Savings")) {
			theBalance = theBalance + SAVINGSINTEREST;
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return theBalance;
	}
	
	public String toString() {
		String result = "\n******************************"; 
		result = result + "\nAccount number : " + accountNumber;
		result = result + "\nCustomer : " + theCustomer.getName();
		result = result + "\nBalance : " + theBalance;
		result = result + "\n******************************";
		return result;
	}
}
