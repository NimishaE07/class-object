class ATM {
    int balance = 1000;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkBalance() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        ATM a = new ATM();
        a.deposit(500);
        a.withdraw(200);
        a.checkBalance();
    }
}
