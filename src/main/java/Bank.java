import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bank {
	
	Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();

	
	public Collection<BankAccount> accountsValues() {
Collection<BankAccount> accountList = accounts.values();
		return accountList;
	}
	
	public BankAccount accessAccountNumber(BankAccount accountNum) {
	
	return accountNum;
	}
	public BankAccount accessAccountBalance(BankAccount balance) {
		
		return balance;
		}
	
	public void addBankAccount(BankAccount account) {
		accounts.put(account.getAccountNum(), account);
	}
	
	public void removeAccount(String accountNum) {
		accounts.remove(accountNum);
		
	}
	public void showOrderList() {
		
	}	
}
