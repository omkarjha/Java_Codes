public class Supermain {

    public static void main(String[] args) {
        Savings savingsAccount = new Savings(7000);
        savingsAccount.withdraw(800);
        savingsAccount.withdraw(400);

        Current currentAccount = new Current(2000);
        currentAccount.deposit(500);
        currentAccount.incrementOperations();
        currentAccount.deposit(400);
        currentAccount.incrementOperations();
        currentAccount.deposit(1000);
        currentAccount.withdraw(300);
        currentAccount.incrementOperations();
        currentAccount.deposit(2000);
        currentAccount.withdraw(300);
        // currentAccount.display();
    }
}
