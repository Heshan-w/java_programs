package projects.ATM;

public class ATM {
    private int pin;
    private double balance = 1000;

    public ATM(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Transaction successfull !\n");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient account balance !\n");
        } else {
            balance -= amount;
            System.out.println("Transaction successfull !\n");
        }
    }


}
