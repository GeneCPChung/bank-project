import java.util.Scanner;
import java.util.Map.Entry;

public class BankingApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Bank myBank = new Bank();

		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.00);

		myBank.addBankAccount(account1);
		myBank.addBankAccount(account2);

		System.out.println("Welcome, here are your accounts at our bank:");
		for (Entry<String, BankAccount> entry : myBank.accounts.entrySet()) {
			System.out.println(entry.getValue());
		}
		String userOpt;
		double userAction;
		menuOptions();
		
		do {
			userOpt = input.nextLine();
			if (userOpt.equals("1")) {
				System.out.println("\nYou want to make a deposit");
				System.out.println("Here are your account numbers");
				for (Entry<String, BankAccount> entry : myBank.accounts.entrySet()) {
					System.out.println(entry.getValue());
				}
				System.out.println("Please Select the account by (acct num) to perform this transaction.");
				userOpt = input.nextLine();
				if (userOpt.equals("1111")) {
					System.out.println("Enter the amount to deposit to Checking: ");
					userAction = input.nextInt();
					myBank.accessAccountNumber(account1).makeDeposit(userAction);
					System.out.println("Your new Balance is: " + myBank.accessAccountBalance(account1));
					menuOptions();
				}
				if (userOpt.equals("2222")) {
					System.out.println("Enter the amount to deposit to Checking: ");
					userAction = input.nextInt();
					myBank.accessAccountNumber(account2).makeDeposit(userAction);
					System.out.println("Your new Balance is: " + myBank.accessAccountBalance(account2));
					menuOptions();
				}

			}
			if (userOpt.equals("2")) {
				System.out.println("\nYou want to make a withdrawl");
				System.out.println("Here are your account numbers");
				for (Entry<String, BankAccount> entry : myBank.accounts.entrySet()) {
					System.out.println(entry.getValue());
				}
				System.out.println("Please Select the account by (acct num) to perform this transaction.");
				userOpt = input.nextLine();
				if (userOpt.equals("2222")) {
					System.out.println("Enter the amount to deposit to withdrawn: ");
					userAction = input.nextInt();
					myBank.accessAccountNumber(account2).makeWithdrawl(userAction);
					System.out.println("Your new Balance is: " + myBank.accessAccountBalance(account2));
					menuOptions();
				}
			}

			if (userOpt.equals("3")) {
				System.out.println("Here are your account numbers");
				for (Entry<String, BankAccount> entry : myBank.accounts.entrySet()) {
					System.out.println(entry.getValue());
				}
				menuOptions();
				userOpt = input.nextLine();
			}

			if (userOpt.equals("4")) {
				System.out.println("You would like to close an account.");
				System.out.println("Here are your account numbers");
				for (Entry<String, BankAccount> entry : myBank.accounts.entrySet()) {
					System.out.println(entry.getValue());
				}
				System.out.println("Please Select the account by (acct num) to perform this transaction.");
				userOpt = input.nextLine();
				if (userOpt.equals("2222")) {
					System.out.println("You are closing: \n" + myBank.accessAccountNumber(account2));
					myBank.removeAccount(account2);
					System.out.println("\nYour remaining accounts are");
					for (Entry<String, BankAccount> entry : myBank.accounts.entrySet()) {
						System.out.println(entry.getValue());
					}
					menuOptions();
				
				}
			}

		} while (!userOpt.equals("-1"));
	}

	public static void menuOptions() {
		System.out.println("\nWhat would you like to do?");
		System.out.println("\nPress 1 to deposit");
		System.out.println("Press 2 to withdrawal");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press -1 to exit\n");

	}

}

/*
 * item = new TheItem(itemSelection, itemSelectionPrice, itemSelectionQuantity);
 * orderInput.addItem(item);
 */