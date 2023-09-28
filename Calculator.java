/*
 * Name - Gourav Naskar
 */
import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int num1, num2;

        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            // Read user's choice
            choice = scanner.nextInt();

            // Perform operations based on the choice
            switch (choice) {
                case 1:

                    //Addition
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:

                    //Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    int sub = num1 - num2;
                    System.out.println("Result: " + sub);
                    break;
                case 3:

                    //Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    int pro = num1 * num2;
                    System.out.println("Result: " + pro);
                    break;
                case 4:
                
                    //Division
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        double division = (double) num1 / num2;
                        System.out.println("Result: " + division);
                    }
                    break;
                case 5:
                    //Exit
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
