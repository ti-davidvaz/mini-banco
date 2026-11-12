import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account conta = new Account("David", 1001);
        Client client = new Client("David dos Santos", "123.456.789-10", conta);
        Scanner scan = new Scanner(System.in);
        int option = -1;


        while (option != 4) {
            System.out.println("Which transaction would you like to perform?");
            System.out.println("1 - Show balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - exit");
            option = scan.nextInt();

            if (option == 1) {
                System.out.println("You have selected the check balance option.");
                conta.showCurrentBalance();

            } else if (option == 2) {
                System.out.println("You have selected the deposit option.");
                System.out.println("What amount would you like to deposit?");
                double value = scan.nextDouble();
                client.getAccount().deposit(value);

            } else if (option == 3) {
                System.out.println("You have selected the Withdraw option.");
                System.out.println("What amount would you like to Withdraw?");
                double value = scan.nextDouble();
                client.getAccount().withdraw(value);

            } else if (option == 4) {
                System.out.println("You have selected the exit option.");
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option");
            }

        }
        scan.close();
    }

}
