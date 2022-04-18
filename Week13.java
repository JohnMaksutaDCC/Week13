package base;

import java.util.ArrayList;

import dartmouth.BankAccount;

public class Week13 {

	static ArrayList<BankAccount> accts = new ArrayList<BankAccount>();

	public static void main(String[] args) {
		BankAccount acct = new BankAccount();
		accts.add(acct);
		BankAccount acct2 = new BankAccount(100.01);
		accts.add(acct2);
		printStatus("Added Accounts");
		printStatus();
		acct.deposit(50.0);
		printStatus("Deposited 50.0 to first account");
		printStatus();
		acct.transfer(acct, acct.getBalance() / 2);
		printStatus();

	}

	private static void printStatus() {
		for (BankAccount acct : accts) {
			System.out.println(acct);
		}
	}

	private static void printStatus(String message) {
		System.out.println(message);
	}

}
