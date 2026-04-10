class BankingSystem {
    int balance = 1000;

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        new Thread(() -> b.withdraw(700)).start();
        new Thread(() -> b.withdraw(500)).start();
    }
}
