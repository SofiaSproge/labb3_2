package ver1;

public class SavingsAccount extends Account{
	public SavingsAccount(CurrentAccount arg1) {
		super(arg1);//wtf
		accountType = "Savings";
		theBalance = 0;
	}
	
	public void receive(double arg1) {
		theBalance= theBalance + arg1;
	}
	
	public double send (double arg1) {
	
		if(theBalance < arg1) {
			theBalance = 0.0;
		}
		else {
			theBalance = theBalance - arg1;
		}
		return arg1;
	}
}
