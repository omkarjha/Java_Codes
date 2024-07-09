class Current extends Account {
    private int numOperations;

    public Current(double initialBalance) {
        super(initialBalance);
        numOperations = 0;
    }

    public void deposit(double amount) {
        if (numOperations < 2) {
            System.out.println("Deposit denied. Need to perform at least 2 operations.");
            // incrementOperations();
        } else {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
            incrementOperations();

        }
        display();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Withdrawal denied. Insufficient funds.");
        }
        display();
    }

    public void incrementOperations() {
        numOperations++;
    }
}
