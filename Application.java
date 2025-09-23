import java.util.Scanner;

public class Bank {
  static double balance = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    while (option != 4) {
      System.out.println("Welcome to the Bank of Java");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.print("Enter an option: ");
      option = scanner.nextInt();

      switch (option) {
        case 1:
          checkBalance();
          break;
        case 2:
          deposit();
          break;
        case 3:
          withdraw();
          break;
        case 4:
          exit();
          break;
        default:
          System.out.println("Invalid option. Try again.");
          break;
      }
    }
  }

  public static void checkBalance() {
    System.out.println("Your current balance is $" + balance);
  }

  public static void deposit() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the amount to deposit: $");
    double amount = scanner.nextDouble();
    balance += amount;
    System.out.println("$" + amount + " has been deposited to your account.");
    checkBalance();
  }

  public static void withdraw() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the amount to withdraw: $");
    double amount = scanner.nextDouble();
    if (amount > balance) {
      System.out.println("Insufficient funds.");
    } else {
      balance -= amount;
      System.out.println("$" + amount + " has been withdrawn from your account.");
    }
    checkBalance();
  }
  #code changes for feature101 by Vivek in oct 2024 for Reports Module
  public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
#end of feature101

  public static void exit() {
    System.out.println("Thank you for banking with us. Have a great day!");
  }
}