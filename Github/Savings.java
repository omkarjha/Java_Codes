class Savings extends Account {
	public Savings(double initialBalance) {
		super(initialBalance);
	}

	public void withdraw(double amount) {
		if (balance - amount >= 1000) {
			balance -= amount;
			System.out.println("Withdrawn amount is Rs." + amount);

		} else {
			System.out.println("Withdrawal denied.Account balance would fall below Rs. 1000");
		}

	}
}
