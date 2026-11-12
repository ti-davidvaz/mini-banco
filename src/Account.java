public class Account {
    private final String name;
    private double currentBalance;
    private final int number;

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void showCurrentBalance() {
        System.out.println("Your current balance is: " + currentBalance);
    }

    public void withdraw(double withdrawValue) {
        if (withdrawValue <= 0) {
            System.out.println("Invalid value! Withdraw amount must be greater than zero.");

        } else if (withdrawValue > currentBalance) {
            System.out.println("Invalid value! Withdraw amount must be lower or equal to your current balance.");

        } else {
            currentBalance -= withdrawValue;
            System.out.println("Withdraw with the value: " + withdrawValue + " completed!");

        }
        showCurrentBalance();

    }

    public void deposit(double depositValue) {
        if (depositValue > 0) {
            currentBalance += depositValue;
            System.out.println("Deposit with the value: " + depositValue + " completed!");
        } else {
            System.out.println("Invalid value! Deposit amount must be greater than zero.");
        }
        showCurrentBalance();

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
