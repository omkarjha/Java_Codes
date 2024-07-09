abstract class Account {
	double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited amount is Rs." + amount);
	}

	public void withdraw(double amount) {
	}

	public void display() {
		System.out.println("The balance in the account is :" + balance);
	}

}
