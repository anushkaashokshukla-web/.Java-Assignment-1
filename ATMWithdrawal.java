import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw amount: ");
        double amount = sc.nextDouble();

        try {
            if (amount > balance)
                throw new Exception("Insufficient Balance");

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
