import java.util.Collection;

public class BankAccount {
	private String accountNum;
	private String type;
	private double balance;

	public BankAccount(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.type = type;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public void makeDeposit(double amount) {

		balance += amount;
	}

	public void makeWithdrawl(double amount) {
		balance -= amount;
	}

	
	@Override
	public String toString() {
		return "" + this.accountNum + " " + this.type + " " + this.balance;

	}

}
