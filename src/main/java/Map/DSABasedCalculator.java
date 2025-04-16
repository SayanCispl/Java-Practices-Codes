package Map;

import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class DSABasedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Map operation codes to their respective functions
        Map<Integer, BiFunction<Double, Double, Double>> operations = Map.of(
                1, (a, b) -> a + b,
                2, (a, b) -> a - b,
                3, (a, b) -> a * b,
                4, (a, b) -> b != 0 ? a / b : null,
                5, (a, b) -> b != 0 ? a % b : null
        );
        // Show operation menu
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");

        int operation = sc.nextInt();
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        BiFunction<Double, Double, Double> selectedOperation = operations.get(operation);

        if (selectedOperation != null) {
            Double result = selectedOperation.apply(a, b);
            if (result != null) {
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Cannot divide or modulo by zero.");
            }
        } else {
            System.out.println("Invalid operation selected.");
        }
        sc.close();
    }
}

