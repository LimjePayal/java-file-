class BankingSystem {
    private int balance = 1000;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
            }
        }
    }
}

class UserThread extends Thread {
    BankingSystem bank;

    UserThread(BankingSystem bank, String name) {
        super(name);
        this.bank = bank;
    }

    public void run() {
        bank.withdraw(500);
    }
}

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        UserThread t1 = new UserThread(bank, "User1");
        UserThread t2 = new UserThread(bank, "User2");

        t1.start();
        t2.start();
    }
}