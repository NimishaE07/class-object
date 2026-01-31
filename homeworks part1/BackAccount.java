class BankAccount {
    String accountHolderName;
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolderName = "Nimisha";
        b.balance = 1000;

        b.deposit(500);
        b.withdraw(200);

        System.out.println("Balance = " + b.balance);
    }
}
