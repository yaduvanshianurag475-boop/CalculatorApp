
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        System.out.println("==============================");
        System.out.println("      Welcome to Calculator!  ");
        System.out.println("==============================");

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter choice (1/2/3/4): ");

            int operation = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case 1 -> System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                case 2 -> System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                case 3 -> System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error! Cannot divide by zero!");
                    } else {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                }
                default -> System.out.println("Invalid choice!");
            }

            System.out.print("\nCalculate again? (yes/no): ");
            choice = scanner.next();
        }

        System.out.println("Thanks for using Calculator! Goodbye!");
        scanner.close();
    }
}