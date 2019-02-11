package ver1;
import java.util.*;
public class CurrentAccount extends Account {
	
	private SavingsAccount theSavingsAccount;
	private ArrayList<Transaction>theTransactions;

	public CurrentAccount(Customer arg1, double arg2, Bank arg3) {
		super(arg1, arg2, arg3);
		theSavingsAccount = null;
		accountType="Current";
		Bank theBank=arg3;
	}
	public boolean hasSavingsAccount() {
		boolean result = false;
		if(theCurrentAccount!=null) { //vad ska stå här
			result = true;
		}
		return result;
	
	}
	
	public SavingsAccount createSavingsAccount() {
		
		
		if(theSavingsAccount!=null) {
			System.out.println("A savings account already exists");
			}
		else {
			SavingsAccount theSavingsAccount = new SavingsAccount();
			System.out.println("Added a savings account to the current account"+ getAccountNumber());
		
		}
		return theSavingsAccount;
		
	}
	
	public Bank getBank() {
		return fromBank;
	}
	
	public SavingsAccount getSavingsAccount() {
		return theSavingsAccount;
	}
	
	public void send(double arg1) {
		
	}
	
	public void send(int arg1, double arg2) {
		
	}
	
	public void receive(double arg1) {
		
	}
	
	public void receive(int arg1, double arg2) {
		
	}
	
	public String listTransactions() {
		
	}
	
	public Customer getCustomer() {
	
		return theCustomer;
	}
	
	public void payIn(double arg) {
		theBalance = theBalance + arg;
	}
	
}
