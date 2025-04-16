package Conditions;

import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for the two numbers
        System.out.print("Enter the first number (A): ");
        double A = sc.nextInt();
        System.out.print("Enter the first number (B): ");
        double B = sc.nextInt();
        // Show operation options
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");

        int operation = sc.nextInt();
        double result;
        // Perform the selected operation
        switch (operation) {
            case 1:
                result = A + B;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = A - B;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = A * B;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (B != 0) {
                    result = A / B;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (B != 0) {
                    result = A % B;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
        }
        sc.close();
    }
}
