package ver1;

public class Transaction {
	private int otherAccount;
	private double money;
	private double balance;
	
	
	public Transaction(int arg1, double arg2, double arg3) {
		otherAccount = arg1;
		money= arg2;
		balance = arg3;
	}
	
	public String toString() {
		String result= "Account: "+ otherAccount + " Transfered money: "+ money + " Balance: "+ balance ;
		return result;
	}
}
